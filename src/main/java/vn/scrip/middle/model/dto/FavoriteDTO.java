package vn.scrip.middle.model.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor  // <- cần thêm
@AllArgsConstructor
public class FavoriteDTO {
    private Integer userId;
    private Integer movieId;
}
