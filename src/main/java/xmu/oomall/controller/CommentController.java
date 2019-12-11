package xmu.oomall.controller;

import org.apache.tomcat.util.http.ResponseUtil;
import org.springframework.core.annotation.Order;
import org.springframework.web.bind.annotation.*;

import javax.validation.constraints.NotNull;

/**
 * @Author xyt
 * @create 2019/12/4 13:00
 */

@RestController
@RequestMapping("/commentsService")
public interface CommentController{

    @GetMapping("/goods/{id}/comments")
    public Object goodslist(@PathVariable Integer id);

    @GetMapping("/admin/comments")
    public Object adminlist(@PathVariable Integer userid,@PathVariable Integer productid,@RequestParam Integer page,@RequestParam Integer limit);

    @DeleteMapping("/comments/{id}")
    public Object delete(@PathVariable Integer id);

    @PostMapping("/goods/{id}/comments")
    public Object create(@PathVariable Integer id,@RequestbodyCommentVo comment);

    @PutMapping("/admin/comments/{id}")
    public Object update(@PathVariable Integer id,@Requestbody CommentVo comment);

}