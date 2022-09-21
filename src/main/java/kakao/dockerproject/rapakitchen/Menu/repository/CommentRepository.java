package kakao.dockerproject.rapakitchen.Menu.repository;

import kakao.dockerproject.rapakitchen.Menu.entity.commentlist;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CommentRepository extends JpaRepository<commentlist, Integer> {

   // commentlist findByMenuId(Integer menuId);
}
