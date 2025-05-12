package vn.scrip.middle.service;
import org.springframework.data.domain.Page;
import vn.scrip.middle.model.dto.MovieDTO;
import vn.scrip.middle.model.request.UpsertMovieRequest;

public interface MovieService
{
    Page<MovieDTO> getAllMovies(int page, int pageSize);
    MovieDTO getMovieById(Integer id);
    MovieDTO createMovie(UpsertMovieRequest request);
    MovieDTO updateMovie(Integer id, UpsertMovieRequest request);
    void deleteMovie(Integer id);
}






