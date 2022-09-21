package kakao.dockerproject.rapakitchen.Wishmenu.entity;

import jdk.jfr.Enabled;
import lombok.Builder;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.sql.Timestamp;

@Entity
@NoArgsConstructor
public class requestmenu {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="request_id")
    private Integer requestId;

    @Column(name="request_date")
    private Timestamp requestDate;

    @Column(name="request_menu")
    private String requestMenu;

    @Builder
    public requestmenu(Integer requestId, Timestamp requestDate, String requestMenu) {
        this.requestId = requestId;
        this.requestDate = requestDate;
        this.requestMenu = requestMenu;
    }

    public Timestamp getRequestDate() {
        return requestDate;
    }

    public String getRequestMenu() {
        return requestMenu;
    }

    @Override
    public String toString() {
        return "requestmenu{" +
                "requestId=" + requestId +
                ", requestDate=" + requestDate +
                ", requestMenu='" + requestMenu + '\'' +
                '}';
    }
}
