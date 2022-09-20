package kakao.dockerproject.rapakitchen.Menu.controller;

import kakao.dockerproject.rapakitchen.Menu.DTO.CommentRequest;
import kakao.dockerproject.rapakitchen.Menu.entity.commentlist;
import kakao.dockerproject.rapakitchen.Menu.service.CommentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.sql.Timestamp;

@RestController
@RequestMapping("/comment")
public class CommentController {
    @Autowired
    private CommentService commentService;

    @PostMapping
    private Boolean comment(@RequestParam("menuId") Integer menuId, @RequestBody CommentRequest comment){
        commentlist addComment = null;
        Timestamp timestamp = new Timestamp(System.currentTimeMillis());


        try{
            addComment = commentlist.builder().commentDate(timestamp).nickName(comment.getNickName()).commentMenu(comment.getCommentMenu()).build();
            commentService.write(menuId, addComment);
        } catch (Exception e) {
            return false;
        }
        return true;
    }
}
