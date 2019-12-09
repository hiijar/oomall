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
@RequestMapping("")
public interface CommentController{

    @GetMapping("/comments")
    public Object list();

    @DeleteMapping("/comments/{id}")
    public Object delete(@PathVariable Integer id,@RequestBody String body);

}
