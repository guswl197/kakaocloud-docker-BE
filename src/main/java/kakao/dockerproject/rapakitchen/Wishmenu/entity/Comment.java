package kakao.dockerproject.rapakitchen.Wishmenu.entity;

import lombok.Builder;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.security.Timestamp;
import java.util.Date;

@Entity
@NoArgsConstructor
public class Comment {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="comment_id")
    private Integer commentId;

    @Column(name="menu_id")
    private Integer menuId;

    @Column(name="comment_date")
    private Date commentDate;

    @Column(name="comment_menu")
    private String commentMenu;

    @Builder
    public Comment(Integer commentId, Integer menuId, Date commentDate, String commentMenu) {
        this.commentId = commentId;
        this.menuId = menuId;
        this.commentDate = commentDate;
        this.commentMenu = commentMenu;
    }
}
