package kakao.dockerproject.rapakitchen.Wishmenu.DTO;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class WishMenuRequest {
    private String requestMenu;

    public String getRequestMenu() {
        return requestMenu;
    }
}
