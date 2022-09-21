package kakao.dockerproject.rapakitchen.Menu.service;

import kakao.dockerproject.rapakitchen.Menu.DTO.CommentResponse;
import kakao.dockerproject.rapakitchen.Menu.entity.commentlist;
import kakao.dockerproject.rapakitchen.Menu.entity.menulist;
import kakao.dockerproject.rapakitchen.Menu.repository.CommentRepository;
import kakao.dockerproject.rapakitchen.Menu.repository.MenuRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class CommentService {
    @Autowired
    private CommentRepository commentRepository;

    @Autowired
    private MenuRepository menuRepository;

    public commentlist write(Integer menuId, commentlist comment) {

        Optional<menulist> menu = menuRepository.findById(menuId);
        comment.setMenu(menu.get());
        commentRepository.save(comment);
        return comment;
    }


    public List<CommentResponse> getCommentList(Integer menuId) {
        List<commentlist> comments = commentRepository.findAll();
        List<CommentResponse> commentResponses = new ArrayList<>();

        for (commentlist comment : comments) {
            if(menuId.equals(comment.getMenu().getMenuId())) {
                CommentResponse commentResponse = CommentResponse.builder()
                        .nickName(comment.getNickName())
                        .commentId(comment.getCommentId())
                        .commentDate(comment.getCommentDate())
                        .commentMenu(comment.getCommentMenu()).build();
                commentResponses.add(commentResponse);
            }
        }

        return commentResponses;
    }


}

