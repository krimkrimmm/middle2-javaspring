package vn.scrip.middle.controller.admin;

import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import vn.scrip.middle.model.dto.MovieDTO;
import vn.scrip.middle.model.request.UpsertMovieRequest;
import vn.scrip.middle.service.MovieService;

@RestController
@RequestMapping("/api/admin/movie")
@RequiredArgsConstructor
public class AdminMovieController {

    private final MovieService movieService;

    @GetMapping
    public Page<MovieDTO> getAllMovies(
            @RequestParam(defaultValue = "1") int page,
            @RequestParam(defaultValue = "10") int pageSize
    ) {
        return movieService.getAllMovies(page, pageSize);
    }

    @PostMapping
    public ResponseEntity<MovieDTO> createMovie(@RequestBody UpsertMovieRequest request) {
        return ResponseEntity.ok(movieService.createMovie(request));
    }

    @PutMapping("/{id}")
    public ResponseEntity<MovieDTO> updateMovie(
            @PathVariable Integer id,
            @RequestBody UpsertMovieRequest request
    ) {
        return ResponseEntity.ok(movieService.updateMovie(id, request));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<?> deleteMovie(@PathVariable Integer id) {
        movieService.deleteMovie(id);
        return ResponseEntity.ok().build();
    }
}
