package com.example.demo.Controller;


import com.example.demo.Domain.Topic;
import org.springframework.web.bind.annotation.*;

import javax.validation.constraints.NotNull;

/**
 * @Author lsz
 * @create 2019/12/3 14:57
 */

@RestController
@RequestMapping("/topicsSerice")
public interface TopicController {

    @GetMapping("/topics")
    public Object list(@RequestParam(defaultValue = "1") Integer page,
                       @RequestParam(defaultValue = "10") Integer limit) ;

    @GetMapping("/topics/{id}")
    public Object detail(@NotNull Integer id) ;

    @PostMapping("/topics")
    public Object create(@RequestBody Topic topic) ;

    @GetMapping("/topics/{id}")
    public Object read(@NotNull Integer id) ;

    @PutMapping("/topics/{id}")
    public Object update(@RequestBody Topic topic,@PathVariable Integer id) ;


    @DeleteMapping("/topics/{id}")
    public Object delete(@RequestBody Topic topic,@PathVariable Integer id) ;
}
