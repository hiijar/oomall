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
@RequestMapping("/ads")
public interface AdController {
	
	/**
	@RequiresPermissions("admin:ad:list")
    @RequiresPermissionsDesc(menu = {"推广管理", "广告管理"}, button = "查询")
	*/
    @GetMapping("/admins/ads")
    @ApiOperation(value="管理员查看所有的广告  /list")
    public Object list(String name, String content,
                       @RequestParam(defaultValue = "1") Integer page,
                       @RequestParam(defaultValue = "10") Integer limit,
//                       @Sort @RequestParam(defaultValue = "add_time") String sort,
//                       @Order @RequestParam(defaultValue = "desc") String order)
	
	private Object validate(LitemallAd ad)
	
	/**
	@RequiresPermissions("admin:ad:create")
    @RequiresPermissionsDesc(menu = {"推广管理", "广告管理"}, button = "添加")
	*/
    @PostMapping("/ads")
    @ApiOperation(value="新建一条广告 /create")
    public Object create(@RequestBody LitemallAd ad)
	
	/**
	@RequiresPermissions("admin:ad:read")
    @RequiresPermissionsDesc(menu = {"推广管理", "广告管理"}, button = "详情")
	*/
    @GetMapping("/ads/{id}")
    @ApiOperation(value="查看单条广告 /read")
    public Object read(@PathVariable Integer id)
	
	/**
	@RequiresPermissions("admin:ad:update")
    @RequiresPermissionsDesc(menu = {"推广管理", "广告管理"}, button = "编辑")
	*/
    @PutMapping("/ads/{id}")
    @ApiOperation(value="修改广告信息 /update")
    public Object update(@PathVariable Integer id,@RequestBody LitemallAd ad)
	
	/**
	@RequiresPermissions("admin:ad:delete")
    @RequiresPermissionsDesc(menu = {"推广管理", "广告管理"}, button = "删除")
	*/
    @DeleteMapping("/ads/{id}")
    @ApiOperation(value="删除一条广告/delete")
    public Object delete(@PathVariable Integer id,@RequestBody LitemallAd ad)
					   

}
