package vn.scrip.middle.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import vn.scrip.middle.entity.Review;
import vn.scrip.middle.model.dto.ReviewDTO;
import vn.scrip.middle.model.request.CreateReviewRequest;
import vn.scrip.middle.model.request.UpdateReviewRequest;
import vn.scrip.middle.repository.ReviewRepository;
import vn.scrip.middle.service.ReviewService;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class ReviewServiceImpl implements ReviewService {

    @Autowired
    private ReviewRepository reviewRepository;

    @Override
    public List<ReviewDTO> getReviewsByMovieId(Integer movieId) {
        List<Review> reviews = reviewRepository.findByMovieId(movieId);
        return reviews.stream().map(this::convertToDTO).collect(Collectors.toList());
    }

    @Override
    public ReviewDTO createReview(CreateReviewRequest createReviewRequest) {
        Review review = new Review();
        review.setMovieId(createReviewRequest.getMovieId());
        review.setUserId(createReviewRequest.getUserId());
        review.setContent(createReviewRequest.getContent());
        review.setRating(createReviewRequest.getRating());
        reviewRepository.save(review);
        return convertToDTO(review);
    }

    @Override
    public ReviewDTO updateReview(Integer id, UpdateReviewRequest updateReviewRequest) {
        Review review = reviewRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Review not found"));
        review.setContent(updateReviewRequest.getContent());
        review.setRating(updateReviewRequest.getRating());
        reviewRepository.save(review);
        return convertToDTO(review);
    }

    @Override
    public void deleteReview(Integer id) {
        reviewRepository.deleteById(id);
    }

    private ReviewDTO convertToDTO(Review review) {
        ReviewDTO dto = new ReviewDTO();
        dto.setId(review.getId());
        dto.setMovieId(review.getMovieId());
        dto.setUserId(review.getUserId());
        dto.setContent(review.getContent());
        dto.setRating(review.getRating());
        return dto;
    }
}
