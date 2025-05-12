package vn.scrip.middle.model.dto;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
import lombok.Data;
@Data
public class EpisodeDTO
{
    private Integer id;
    private String name;
    private String videoUrl;
    private Integer displayOrder;
    private Integer movieId;
}






