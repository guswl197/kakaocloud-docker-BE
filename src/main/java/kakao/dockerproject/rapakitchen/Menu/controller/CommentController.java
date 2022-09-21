package kakao.dockerproject.rapakitchen.Menu.controller;

import kakao.dockerproject.rapakitchen.Menu.DTO.CommentRequest;
import kakao.dockerproject.rapakitchen.Menu.DTO.CommentResponse;
import kakao.dockerproject.rapakitchen.Menu.entity.commentlist;
import kakao.dockerproject.rapakitchen.Menu.service.CommentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.web.PageableDefault;
import org.springframework.web.bind.annotation.*;

import java.sql.Timestamp;
import java.util.List;
import java.util.function.Function;

@RestController
@RequestMapping("/comment")
public class CommentController {
    @Autowired
    private CommentService commentService;

    @PostMapping
    private Boolean comment(@RequestParam("menuId") Integer menuId, @RequestBody CommentRequest comment) {
        commentlist addComment = null;
        Timestamp timestamp = new Timestamp(System.currentTimeMillis());

        try {
            addComment = commentlist.builder()
                    .commentDate(timestamp)
                    .nickName(comment.getNickName())
                    .commentMenu(comment.getCommentMenu())
                    .build();
            commentService.write(menuId, addComment);
        } catch (Exception e) {
            return false;
        }
        return true;
    }

    @GetMapping
    public List<CommentResponse> commentList(@RequestParam("menuId") Integer menuId) {
        List<CommentResponse> commentResponseList = commentService.getCommentList(menuId);
        return commentResponseList;
    }
}
