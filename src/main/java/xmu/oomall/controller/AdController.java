package com.example.demo;

import io.swagger.annotations.ApiOperation;
import org.apache.tomcat.util.http.ResponseUtil;
import org.springframework.core.annotation.Order;
import org.springframework.web.bind.annotation.*;

import javax.validation.constraints.NotNull;

/**
 * @Author zjy
 * @create 2019/12/5 17:38
 */

@RestController
@RequestMapping("")
public interface AdController {
	
    @GetMapping("/admins/ads")
    @ApiOperation(value="管理员查看所有的广告  /list")
    public Object adminFindAdList(String name, String content,
                       @RequestParam(defaultValue = "1") Integer page,
                       @RequestParam(defaultValue = "10") Integer limit,
//                       @Sort @RequestParam(defaultValue = "add_time") String sort,
//                       @Order @RequestParam(defaultValue = "desc") String order
					   );
	
    @PostMapping("/ads")
    @ApiOperation(value="新建一条广告 /create")
    public Object adminCreateAad(@RequestBody Ad ad);

    @GetMapping("/ads/{id}")
    @ApiOperation(value="查看单条广告 /read")
    public Object adminFindAd(@PathVariable Integer id);

    @PutMapping("/ads/{id}")
    @ApiOperation(value="修改广告信息 /update")
    public Object adminUpdateAd(@PathVariable Integer id,@RequestBody Ad ad);

    @DeleteMapping("/ads/{id}")
    @ApiOperation(value="删除一条广告 /delete")
    public Object adminDeleteAd(@PathVariable Integer id,@RequestBody Ad ad);
 
	@GetMapping("/ads")
    @ApiOperation(value="用户查询广告")
    public Object userFindAd();
}
