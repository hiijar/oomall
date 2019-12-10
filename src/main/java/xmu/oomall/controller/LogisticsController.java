package com.example.demo;

import io.swagger.annotations.Api;
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
@RequestMapping("/LogisticsService")
public interface LogisticsController{

    @GetMapping("/")
    @ApiOperation(value="得到物流单号 /list")
    public Object getLogisticsId();

    @GetMapping("/")
    @ApiOperation(value="通过单号得到物流信息 /list")
    public Object getLogisticsInformation(@RequestBody String body);
}