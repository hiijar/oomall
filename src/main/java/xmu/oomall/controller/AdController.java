package com.example.demo.controller;

import org.apache.tomcat.util.http.ResponseUtil;
import org.springframework.web.bind.annotation.*;

import javax.validation.constraints.NotNull;

/**
 * @Author zjy
 * @create 2019/12/8 23:46
 */

@RestController
@RequestMapping("")
public interface AdController {

    @GetMapping("/admins/ads")
    public Object adminFindAdList(@RequestParam(defaultValue = "1") Integer page,
                                  @RequestParam(defaultValue = "10") Integer limit
    );

    @PostMapping("/ads")
    public Object adminCreateAd(@RequestBody Ad ad);

    @GetMapping("/ads/{id}")
    public Object adminFindAdById(@PathVariable Integer id);

    @PutMapping("/ads/{id}")
    public Object adminUpdateAd(@PathVariable Integer id,@RequestBody Ad ad);

    @DeleteMapping("/ads/{id}")
    public Object adminDeleteAd(@PathVariable Integer id);

    @GetMapping("/ads")
    public Object userFindAdList();
}
