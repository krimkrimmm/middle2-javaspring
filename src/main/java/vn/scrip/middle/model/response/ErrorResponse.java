package vn.scrip.middle.model.response;
import lombok.*;
import org.springframework.http.HttpStatus;
@Builder
@NoArgsConstructor
@AllArgsConstructor

@Getter
@Setter
@Data
public class ErrorResponse {
    private int status;
    private String message;

}





