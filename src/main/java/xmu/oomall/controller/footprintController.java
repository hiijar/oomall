package com.example.demo;

import io.swagger.annotations.ApiOperation;
import org.apache.tomcat.util.http.ResponseUtil;
import org.springframework.core.annotation.Order;
import org.springframework.web.bind.annotation.*;

import javax.validation.constraints.NotNull;

/**
 * @Author zhc
 * @create 2019/12/3 18:30
 */


@RestController
@RequestMapping("/footprint")

public interface footprintController {
	
	/**
	*获取足迹信息
	*/	
	@GetMapping("/footprints")
    @ApiOperation(value = "获取足迹信息/list", notes = "获取足迹信息")
    public Object list(String userId, String goodsId,
                       @RequestParam(defaultValue = "1") Integer page,
                       @RequestParam(defaultValue = "10") Integer limit,
					   @RequestParam(defaultValue = "add_time") String sort,
                       @RequestParam(defaultValue = "desc") String order);
//                       @Sort @RequestParam(defaultValue = "add_time") String sort,
//                      @Order @RequestParam(defaultValue = "desc") String order;
	
	/**
     * 删除用户足迹
     *
     * @param userId 用户ID
     * @param body   请求内容， { id: xxx }
     * @return 删除操作结果
     */
    @ApiOperation("删除用户足迹 /delete")
    @DeleteMapping("{id}")
    public Object delete(@LoginUser Integer userId, @RequestBody String body);

    /**
     * 用户足迹列表
     *
     * @param page 分页页数
     * @param limit 分页大小
     * @return 用户足迹列表
     */
    @ApiOperation("获得用户足迹列表 /list")
    @GetMapping("")
    public Object list(@LoginUser Integer userId,
                       @RequestParam(defaultValue = "1") Integer page,
                       @RequestParam(defaultValue = "10") Integer limit);

}
