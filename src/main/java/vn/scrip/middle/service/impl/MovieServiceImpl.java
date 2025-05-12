package vn.scrip.middle.service.impl;

import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.*;
import org.springframework.stereotype.Service;
import vn.scrip.middle.entity.Movie;
import vn.scrip.middle.exception.NotFoundException;
import vn.scrip.middle.mapper.MovieMapper;
import vn.scrip.middle.model.dto.MovieDTO;
import vn.scrip.middle.model.request.UpsertMovieRequest;
import vn.scrip.middle.repository.MovieRepository;
import vn.scrip.middle.service.MovieService;

@Service
@RequiredArgsConstructor
public class MovieServiceImpl implements MovieService {

    private final MovieRepository movieRepository;

    @Override
    public Page<MovieDTO> getAllMovies(int page, int pageSize) {
        Pageable pageable = PageRequest.of(page - 1, pageSize, Sort.by("id").descending());
        Page<Movie> moviePage = movieRepository.findAll(pageable);
        return moviePage.map(MovieMapper::toDTO);
    }

    @Override
    public MovieDTO getMovieById(Integer id) {
        Movie movie = movieRepository.findById(id)
                .orElseThrow(() -> new NotFoundException("Movie not found"));
        return MovieMapper.toDTO(movie);
    }

    @Override
    public MovieDTO createMovie(UpsertMovieRequest request) {
        Movie movie = MovieMapper.fromUpsertRequest(request);
        return MovieMapper.toDTO(movieRepository.save(movie));
    }

    @Override
    public MovieDTO updateMovie(Integer id, UpsertMovieRequest request) {
        Movie movie = movieRepository.findById(id)
                .orElseThrow(() -> new NotFoundException("Movie not found"));
        MovieMapper.updateFromRequest(movie, request);
        return MovieMapper.toDTO(movieRepository.save(movie));
    }

    @Override
    public void deleteMovie(Integer id) {
        Movie movie = movieRepository.findById(id)
                .orElseThrow(() -> new NotFoundException("Movie not found"));
        movieRepository.delete(movie);
    }
}
