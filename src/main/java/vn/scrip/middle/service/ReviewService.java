package vn.scrip.middle.service;

import vn.scrip.middle.model.dto.ReviewDTO;
import vn.scrip.middle.model.request.CreateReviewRequest;
import vn.scrip.middle.model.request.UpdateReviewRequest;

import java.util.List;

public interface ReviewService {
    List<ReviewDTO> getReviewsByMovieId(Integer movieId);
    ReviewDTO createReview(CreateReviewRequest createReviewRequest);
    ReviewDTO updateReview(Integer id, UpdateReviewRequest updateReviewRequest);
    void deleteReview(Integer id);
}
