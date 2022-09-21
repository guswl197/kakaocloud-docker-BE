package kakao.dockerproject.rapakitchen.Menu.DTO;

import kakao.dockerproject.rapakitchen.Menu.entity.menulist;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import java.sql.Timestamp;

@Getter
@Setter
public class CommentResponse {

    private Integer commentId;
    private String nickName;
    private Timestamp commentDate;
    private String commentMenu;

    @Builder
    public CommentResponse(Integer commentId, String nickName, Timestamp commentDate, String commentMenu) {
        this.commentId = commentId;
        this.nickName = nickName;
        this.commentDate = commentDate;
        this.commentMenu = commentMenu;
    }
}
