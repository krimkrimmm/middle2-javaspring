package vn.scrip.middle.model.request;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;
@Getter
@Setter

@Data
public class AddFavoriteRequest {
    private Integer userId;
    private Integer movieId;
}







