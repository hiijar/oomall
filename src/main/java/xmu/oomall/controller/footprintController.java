package com.example.demo;

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
     *获取足迹信息/list
     */
    @GetMapping("/footprints")
    public Object list(String userId, String goodsId,
                       @RequestParam(defaultValue = "1") Integer page,
                       @RequestParam(defaultValue = "10") Integer limit,
                       @RequestParam(defaultValue = "add_time") String sort,
                       @RequestParam(defaultValue = "desc") String order);
//                       @Sort @RequestParam(defaultValue = "add_time") String sort,
//                      @Order @RequestParam(defaultValue = "desc") String order;

    /**
     * 删除用户足迹/delete
     *
     * @param userId 用户ID
     * @param body   请求内容， { id: xxx }
     * @return 删除操作结果
     */
    @DeleteMapping("{id}")
    public Object delete(@LoginUser Integer userId, @RequestBody String body);

    /**
     * 获取用户足迹列表/list
     *
     * @param page 分页页数
     * @param limit 分页大小
     * @return 用户足迹列表
     */
    @GetMapping("")
    public Object list(@LoginUser Integer userId,
                       @RequestParam(defaultValue = "1") Integer page,
                       @RequestParam(defaultValue = "10") Integer limit);

    /**
     *内部接口:添加足迹信息/add
     *@param userId 用户ID
     *@param body
     */
    @PostMapping("/footprints")
    public Object add(@LoginUser Integer userId, @RequestBody Footprint footprint);

}
