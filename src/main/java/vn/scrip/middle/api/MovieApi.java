package vn.scrip.middle.api;

import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.web.bind.annotation.*;
import vn.scrip.middle.model.dto.MovieDTO;
import vn.scrip.middle.service.MovieService;

@RestController
@RequestMapping("/api/movies")
@RequiredArgsConstructor
public class MovieApi {

    private final MovieService movieService;

    @GetMapping
    public Page<MovieDTO> getAllMovies(
            @RequestParam(defaultValue = "1") int page,
            @RequestParam(defaultValue = "10") int pageSize
    ) {
        return movieService.getAllMovies(page, pageSize);
    }

    @GetMapping("/{id}")
    public MovieDTO getMovieById(@PathVariable Integer id) {
        return movieService.getMovieById(id);
    }
}
