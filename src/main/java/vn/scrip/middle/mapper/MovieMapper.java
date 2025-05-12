package vn.scrip.middle.mapper;

import vn.scrip.middle.entity.Movie;
import vn.scrip.middle.model.dto.MovieDTO;
import vn.scrip.middle.model.request.UpsertMovieRequest;

public class MovieMapper {

    public static MovieDTO toDTO(Movie movie) {
        MovieDTO dto = new MovieDTO();
        dto.setId(movie.getId());
        dto.setName(movie.getName());
        dto.setDescription(movie.getDescription());
        dto.setSlug(movie.getSlug());
        dto.setStatus(movie.getStatus());
        dto.setPoster(movie.getPoster());
        dto.setReleaseYear(movie.getReleaseYear());
        dto.setType(movie.getType());
        return dto;
    }

    public static Movie fromUpsertRequest(UpsertMovieRequest request) {
        Movie movie = new Movie();
        updateFromRequest(movie, request);
        return movie;
    }

    public static void updateFromRequest(Movie movie, UpsertMovieRequest request) {
        movie.setName(request.getName());
        movie.setDescription(request.getDescription());
        movie.setSlug(request.getSlug());
        movie.setStatus(request.getStatus());
        movie.setPoster(request.getPoster());
        movie.setReleaseYear(request.getReleaseYear());
        movie.setType(request.getType());
    }
}
