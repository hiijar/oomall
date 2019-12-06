package com.example.demo;

import io.swagger.annotations.ApiOperation;
import org.apache.tomcat.util.http.ResponseUtil;
import org.springframework.core.annotation.Order;
import org.springframework.web.bind.annotation.*;

import javax.validation.constraints.NotNull;
@RestController
@RequestMapping("/admin-freight")// /wx/order

public interface FeightController {


    @GetMapping("/defaultFreights")
    @ApiOperation(value = "获取默认运费规则", notes = "")
    public Object getDefaultFreights();


    @GetMapping("/specialFreight")
    @ApiOperation(value = "获取特殊运费规则", notes = "")
    public Object getSpecialFreight();


    @PostMapping("/defaultFreights")
    @ApiOperation(value = "新增默认运费规则", notes = "")
    public Object addDefaultFreights(@RequestBody String body);

    @PostMapping("/specialFreight")
    @ApiOperation(value = "新增特殊运费规则", notes = "")
    public Object addSpecialFreight(@RequestBody String body);

    @DeleteMapping("/defaultFreights/{id}")
    @ApiOperation(value = "删除默认运费规则", notes = "")
    public Object deleteDefaultFreight(@PathVariable("defaultFreightsId") String defaultFreightsId);

    @DeleteMapping("/specialFreights/{id}")
    @ApiOperation(value = "删除特殊运费规则", notes = "")
    public Object deleteSpecialFreight(@PathVariable("specialFreightsId") String specialFreightsId);

    @PutMapping("/specialFreights/{id}")
    @ApiOperation(value = "修改特殊运费规则/delete", notes = "")
    public Object updateSpecialFreight(@PathVariable("specialFreightsId") String specialFreightsId);

    @DeleteMapping("/defaultFreights/{id}")
    @ApiOperation(value = "修改默认运费规则", notes = "")
    public Object updateDefaultFreight(@PathVariable("defaultFreightsId") String defaultFreightsId);

    @GetMapping("/freight/{orderitemid}")
    @ApiOperation(value = "获取运费", notes = "")
    public Object getFreight();
}