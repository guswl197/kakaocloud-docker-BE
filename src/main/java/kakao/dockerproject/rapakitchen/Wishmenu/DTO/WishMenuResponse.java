package kakao.dockerproject.rapakitchen.Wishmenu.DTO;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

import java.sql.Timestamp;

@Getter
@Setter
public class WishMenuResponse {

    private String requestMenu;
    private Timestamp requestDate;

    @Builder
    public WishMenuResponse(String requestMenu, Timestamp requestDate) {
        this.requestMenu = requestMenu;
        this.requestDate = requestDate;
    }
}
