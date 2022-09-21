package kakao.dockerproject.rapakitchen.Wishmenu.repository;

import kakao.dockerproject.rapakitchen.Menu.entity.commentlist;
import kakao.dockerproject.rapakitchen.Wishmenu.entity.requestmenu;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface WishMenuRepository extends JpaRepository<requestmenu, Integer> {
}
