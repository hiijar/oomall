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

    @GetMapping("/comments")
    public Object list();

    @DeleteMapping("/comments/{id}")
    public Object delete(@PathVariable Integer id);

    @PostMapping("/goods/{id}/comments")
    public Object create(CommentVo comment);

}