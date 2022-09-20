package kakao.dockerproject.rapakitchen.Menu.entity;

import lombok.Builder;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.sql.Timestamp;


@Entity
@NoArgsConstructor
public class menulist {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer menuId;

    @Column(name="menu_one")
    private String menuOne;

    @Column(name="menu_two")
    private String menuTwo;

    @Column(name="menu_thr")
    private String menuThr;

    @Column(name="menu_fou")
    private String menuFou;

    @Column(name="menu_fiv")
    private String menuFiv;

    @Column(name="menu_date")
    private Timestamp menuDate;

    @Column(name="public_day", columnDefinition = "TINYINT", length=1)
    private Byte publicDay;

    @Builder
    public menulist(Integer menuId, String menuOne, String menuTwo, String menuThr, String menuFou, String menuFiv, Timestamp menuDate, Byte publicDay) {
        this.menuId = menuId;
        this.menuOne = menuOne;
        this.menuTwo = menuTwo;
        this.menuThr = menuThr;
        this.menuFou = menuFou;
        this.menuFiv = menuFiv;
        this.menuDate = menuDate;
        this.publicDay = publicDay;
    }

}
