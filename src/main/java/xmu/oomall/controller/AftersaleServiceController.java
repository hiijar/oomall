package com.example.demo.controller;

import org.apache.tomcat.util.http.ResponseUtil;
import org.springframework.web.bind.annotation.*;

import javax.validation.constraints.NotNull;

/**
 * @Author zjy
 * @create 2019/12/8 16:48
 */

@RestController
@RequestMapping("")
public interface AftersaleServiceController {

    @GetMapping("/admin/afterSaleServices")
    public Object adminFindAftersaleServiceList();

    @GetMapping("/admin/afterSaleServices/{id}")
    public Object adminFindAftersaleService();

    @PutMapping("/admin/afterSaleServices/{id}")
    public Object adminUpdateAftersaleService();

    @GetMapping("/afterSaleService")
    public Object userFindAftersaleServiceList();

    @PostMapping("/afterSaleService")
    public Object userApplyAftersaleService();

    @GetMapping("/afterSaleService/{id}")
    public Object userFindAftersaleService();

    @PutMapping("/afterSaleService/{id}")
    public Object userUpdateAftersaleService();

    @DeleteMapping("/afterSaleService/{id}")
    public Object userDeleteAftersaleService();
}
