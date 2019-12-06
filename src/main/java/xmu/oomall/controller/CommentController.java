package com.example.demo;

import io.swagger.annotations.ApiOperation;
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
public interface LogController{

    @GetMapping("/comments")
    @ApiOperation(value="根据条件查找评论 /list")
    public Object list();

    @DeleteMapping("/comments/{id}")
    @ApiOperation(value="删除一条评论/delete")
    public Object delete(@PathVariable Integer id,@RequestBody String body);

}