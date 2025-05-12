package vn.scrip.middle.model.dto;

import lombok.Data;

@Data
public class ReviewDTO
{
    private Integer id;
    private Integer movieId;
    private Integer userId;
    private String content;
    private Integer rating;
}







