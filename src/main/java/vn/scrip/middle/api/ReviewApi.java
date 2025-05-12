package vn.scrip.middle.api;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import vn.scrip.middle.model.dto.ReviewDTO;
import vn.scrip.middle.model.request.CreateReviewRequest;
import vn.scrip.middle.model.request.UpdateReviewRequest;
import vn.scrip.middle.service.ReviewService;

import java.util.List;

@RestController
@RequestMapping("/api/reviews")
public class ReviewApi {

    @Autowired
    private ReviewService reviewService;

    @GetMapping("/movie/{movieId}")
    public List<ReviewDTO> getReviewsByMovieId(@PathVariable Integer movieId) {
        return reviewService.getReviewsByMovieId(movieId);
    }

    @PostMapping("/create")
    public ReviewDTO createReview(@RequestBody CreateReviewRequest reviewRequest) {
        return reviewService.createReview(reviewRequest);
    }

    @PutMapping("/update/{id}")
    public ReviewDTO updateReview(@PathVariable Integer id, @RequestBody UpdateReviewRequest reviewRequest) {
        return reviewService.updateReview(id, reviewRequest);
    }

    @DeleteMapping("/delete/{id}")
    public void deleteReview(@PathVariable Integer id) {
        reviewService.deleteReview(id);
    }
}
