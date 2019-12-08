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
public interface AftersaleController {

	@GetMapping("/admin/afterSaleServices")
    @ApiOperation(value="管理员查询售后服务列表(条件搜索)  ")
    public Object adminFindAftersaleServiceList();

	@GetMapping("/admin/afterSaleServices/{id}")
    @ApiOperation(value="管理员查询某一售后服务具体信息  ")
    public Object adminFindAftersaleService();
	
	@PutMapping("/admin/afterSaleServices/{id}")
    @ApiOperation(value="管理员修改售后服务的信息  ")
    public Object adminUpdateAftersaleService();
	
	@GetMapping("/afterSaleService")
    @ApiOperation(value="用户查询售后服务列表  /list")
    public Object userFindAftersaleServiceList();
	
	@PostMapping("/afterSaleService")
    @ApiOperation(value="用户申请售后服务  ")
    public Object userApplyAftersaleService();
	
	@GetMapping("/afterSaleService/{id}")
    @ApiOperation(value="用户查询某一售后服务具体信息  ")
    public Object userFindAftersaleService();
	
	@PutMapping("/afterSaleService/{id}")
    @ApiOperation(value="用户修改售后服务的信息(比如状态:取消售后服务)  /update")
    public Object userUpdateAftersaleService();
	
	@DeleteMapping("/afterSaleService/{id}")
    @ApiOperation(value="用户删除某一个售后服务的信息(逻辑删除)  /delete")
    public Object userDeleteAftersaleService();
}
