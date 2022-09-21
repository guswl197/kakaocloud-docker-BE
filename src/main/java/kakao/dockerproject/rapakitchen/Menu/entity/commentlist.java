package kakao.dockerproject.rapakitchen.Menu.entity;

import lombok.Builder;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.sql.Timestamp;


@Entity
@NoArgsConstructor
public class commentlist {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="comment_id")
    private Integer commentId;

    @ManyToOne
    @JoinColumn(name="menu_id")
    private menulist menu;

    @Column(name="comment_date")
    private Timestamp commentDate;

    @Column(name="nickname")
    private String nickName;

    @Column(name="comment_menu")
    private String commentMenu;

    @Builder
    public commentlist(Integer commentId, menulist menu, Timestamp commentDate, String nickName, String commentMenu) {
        this.commentId = commentId;
        this.menu = menu;
        this.commentDate = commentDate;
        this.nickName = nickName;
        this.commentMenu = commentMenu;
    }

    public Integer getCommentId() {
        return commentId;
    }

    public Timestamp getCommentDate() {
        return commentDate;
    }

    public String getNickName() {
        return nickName;
    }

    public String getCommentMenu() {
        return commentMenu;
    }

    public menulist getMenu() {
        return menu;
    }

    public void setCommentId(Integer commentId) {
        this.commentId = commentId;
    }

    public void setMenu(menulist menu) {
        this.menu = menu;
    }

    @Override
    public String toString() {
        return "Comment{" +
                "commentId=" + commentId +
                ", menu=" + menu +
                ", commentDate=" + commentDate +
                ", nickName='" + nickName + '\'' +
                ", commentMenu='" + commentMenu + '\'' +
                '}';
    }
}
