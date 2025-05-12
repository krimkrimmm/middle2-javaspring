package vn.scrip.middle.model.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class ReviewDTO {
    private Integer id;
    private Integer movieId;
    private Integer userId;
    private String content;

    private Double rating; // Đảm bảo kiểu Double cho rating
}
