package vn.scrip.middle.model.request;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import vn.scrip.middle.model.enums.MovieType;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class UpsertMovieRequest {
    private String name;
    private String description;
    private String slug;
    private Boolean status;

    private String poster;
    private Integer releaseYear;
    private MovieType type;
}








