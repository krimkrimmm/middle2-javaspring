package vn.scrip.middle.model.dto;

import lombok.*;
import vn.scrip.middle.model.enums.MovieType;

import java.time.LocalDate;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Data
public class MovieDTO {
    private Integer id;
    private String title;

    private String type;
    private Boolean status;
    private String thumbnail;
    private String description;
    private Integer releaseYear;
}






