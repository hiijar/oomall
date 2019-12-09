package xmu.oomall.controller;

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
    public Object list();
    /**
     */
    @PostMapping("/shareRules")
    public Object create(@RequestBody String body);
    /**
     */
    @DeleteMapping("/shareRules")
    public Object delete(@RequestBody String body);
    /**
     */
    @PutMapping("/shareRules")
    public Object update(@RequestBody String body);
    /**
     */
    @PostMapping("/beSharedItems")
    public Object createSharedItems(@RequestBody String body);

    @GetMapping("/shareRules/{goodsid}")
    public Object getRebate();

    @PostMapping("/beSharedItems")
    public Object wxCreate(@RequestBody String body);
}