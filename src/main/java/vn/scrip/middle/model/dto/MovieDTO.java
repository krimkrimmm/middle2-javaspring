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
    private String name;
    private String description;
    private String slug;
    private Boolean status;
    private String poster;
    private Integer releaseYear;
    private MovieType type;

    // Getter
    public Integer getId() { return id; }
    public String getName() { return name; }
    public String getDescription() { return description; }
    public String getSlug() { return slug; }
    public Boolean getStatus() { return status; }
    public String getPoster() { return poster; }
    public Integer getReleaseYear() { return releaseYear; }
    public MovieType getType() { return type; }

    // Setter
    public void setId(Integer id) { this.id = id; }
    public void setName(String name) { this.name = name; }
    public void setDescription(String description) { this.description = description; }
    public void setSlug(String slug) { this.slug = slug; }
    public void setStatus(Boolean status) { this.status = status; }
    public void setPoster(String poster) { this.poster = poster; }
    public void setReleaseYear(Integer releaseYear) { this.releaseYear = releaseYear; }
    public void setType(MovieType type) { this.type = type; }
}






