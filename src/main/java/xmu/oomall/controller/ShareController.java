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
public interface ShareController {

    /**

     */
    @GetMapping("/shareRules")
    @ApiOperation(value="获取分享规则  /list")
    public Object list();


    /**

     */
    @PostMapping("/shareRules")
    @ApiOperation(value="增加新的分享规则 /create")
    public Object create(@RequestBody String body)

    /**

     */
    @DeleteMapping("/shareRules")
    @ApiOperation(value="删除一条评论/delete")
    public Object delete(@RequestBody String body);

    /**

     */
    @PutMapping("/shareRules")
    @ApiOperation(value="修改分享规则 /update")
    public Object update(@RequestBody String body)

    /**

     */
    @PostMapping("/beSharedItems")
    @ApiOperation(value="增加某个用户的被分享表 /create")
    public Object create(@RequestBody String body)


}