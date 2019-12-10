package com.example.demo.controller;

import com.example.demo.domain.AftersalesService;
import com.example.demo.domain.SpecialFreight;
import org.apache.tomcat.util.http.ResponseUtil;
import org.springframework.web.bind.annotation.*;

import javax.validation.constraints.NotNull;

/**
 * @Author zjy
 * @create 2019/12/10 23:22
 */

@RestController
@RequestMapping("/AftersalesServiceService")
public interface AftersalesServiceController {

    /**
     *
     * @param aftersalesService
     * @return List<aftersaleService>
     */
    @GetMapping("/admin/aftersalesServices")
    Object adminFindAftersalesServiceList(@RequestBody AftersalesService aftersalesService);


    /**
     *
     * @param id
     * @param specialFreight
     * @return aftersalesService
     */
    @GetMapping("***/aftersalesServices/{id}")
    Object adminFindAftersalesService(@PathVariable Integer id, @RequestBody SpecialFreight specialFreight);

    /**
     *
     * @param id
     * @param aftersalesService
     * @return aftersalesService
     */
    @PutMapping("***/admin/aftersalesServices/{id}")
    Object adminUpdateAftersalesService(@PathVariable Integer id, @RequestBody AftersalesService aftersalesService);

    /**
     *
     * @return List<aftersalesService>
     */
    @GetMapping("/aftersalesService")
    Object userFindAftersalesServiceList();

    /**
     *
     * @param aftersalesService
     * @return aftersalesService
     */
    @PostMapping("/aftersalesService")
    Object userApplyAftersalesService(@RequestBody AftersalesService aftersalesService);

    /**
     *
     * @param id
     * @return aftersalesService
     */
    @GetMapping("/aftersalesService/{id}")
    Object userFindAftersalesService(@PathVariable Integer id);

    /**
     *
     * @param id
     * @param aftersalesService
     * @return aftersalesService
     */
    @PutMapping("/aftersalesService/{id}")
    Object userUpdateAftersalesService(@PathVariable Integer id, @RequestBody AftersalesService aftersalesService);

    /**
     *
     * @param id
     * @return 无(ResponseUtil.ok()即可)
     */
    @DeleteMapping("/aftersalesService/{id}")
    Object userDeleteAftersalesService(@RequestParam Integer id);
}
