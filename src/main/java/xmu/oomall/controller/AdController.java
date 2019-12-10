package com.example.demo.controller;

import com.example.demo.domain.Ad;
import org.apache.tomcat.util.http.ResponseUtil;
import org.springframework.web.bind.annotation.*;

import javax.validation.constraints.NotNull;

/**
 * @Author zjy
 * @create 2019/12/10 23:22
 */

@RestController
@RequestMapping("/AdService")
public interface AdController {

    /**
     *
     * @return List<ad>
     */
    @GetMapping("/admins/ads")
    Object adminFindAdList();

    /**
     *
     * @param ad
     * @return ad
     */
    @PostMapping("/ads")
    Object adminCreateAad(@RequestBody Ad ad);

    /**
     *
     * @param id
     * @return ad
     */
    @GetMapping("/ads/{id}")
    Object adminFindAd(@PathVariable Integer id);

    /**
     *
     * @param id
     * @param ad
     * @return ad
     */
    @PutMapping("/ads/{id}")
    Object adminUpdateAd(@PathVariable Integer id,@RequestBody Ad ad);

    /**
     *
     * @param id
     * @return 无(ResponseUtil.ok()即可)
     */
    @DeleteMapping("/ads/{id}")
    Object adminDeleteAd(@PathVariable Integer id);

    /**
     *
     * @return List<ad>
     */
    @GetMapping("/ads")
    Object userFindAd();
}
