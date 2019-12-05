package com.example.demo;

import io.swagger.annotations.ApiOperation;
import org.apache.tomcat.util.http.ResponseUtil;
import org.springframework.core.annotation.Order;
import org.springframework.web.bind.annotation.*;

import javax.validation.constraints.NotNull;

/**
 * @Author zjy
 * @create 2019/12/3 18:13
 */

@RestController
@RequestMapping("/logistics")
public interface AdController{

    @GetMapping("/")
    @ApiOperation(value="管理员查看所有的广告  /list")
    public Object list();

}