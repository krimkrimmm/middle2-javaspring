package vn.scrip.middle.model.dto;
import lombok.*;
import vn.scrip.middle.model.enums.MovieType;
@Data
@AllArgsConstructor
@NoArgsConstructor

@Builder
public class MovieRequest {
    private String title;
    private String description;
    private String thumbnail;
    private Double rating;
    private Boolean status;
    private MovieType type;
}



