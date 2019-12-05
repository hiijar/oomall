package com.example.demo;

import io.swagger.annotations.ApiOperation;
import org.apache.tomcat.util.http.ResponseUtil;
import org.springframework.core.annotation.Order;
import org.springframework.web.bind.annotation.*;

import javax.validation.constraints.NotNull;

/**
 * @Author lsz
 * @create 2019/12/3 14:57
 */

@RestController
@RequestMapping("/topics")
public interface TopicController {

    /**
     * 专题列表
     *
     * @param page 分页页数
     * @param limit 分页大小
     * @return 专题列表
     */
    @ApiOperation("用户获取专题列表 /list")
    @GetMapping("/")
    public Object list(@RequestParam(defaultValue = "1") Integer page,
                       @RequestParam(defaultValue = "10") Integer limit,
//                       @Sort @RequestParam(defaultValue = "add_time") String sort,
//                       @Order @RequestParam(defaultValue = "desc") String order) ;
                        @RequestParam(defaultValue = "add_time") String sort,
                        @RequestParam(defaultValue = "desc") String order) ;

    /**
     * 专题详情
     *
     * @param id 专题ID
     * @return 专题详情
     */
    @ApiOperation("用户获取专题详情 /detail")
    @GetMapping("/{id}")
    public Object detail(@NotNull Integer id) ;


    /**
     * 相关专题
     *
     * @param id 专题ID
     * @return 相关专题
     */
    @ApiOperation("用户获取专题的相关专题 /related")
    @GetMapping("/{id}/related")
    public Object related(@NotNull Integer id) ;

    @ApiOperation("管理员查询专题 /list")
    /**
    @RequiresPermissions("admin:topic:list")
    @RequiresPermissionsDesc(menu = {"推广管理", "专题管理"}, button = "查询")
    */
    @GetMapping("")
    public Object list(String title, String subtitle,
                       @RequestParam(defaultValue = "1") Integer page,
                       @RequestParam(defaultValue = "10") Integer limit,
//                       @Sort @RequestParam(defaultValue = "add_time") String sort,
//                       @Order @RequestParam(defaultValue = "desc") String order) ;
                       @RequestParam(defaultValue = "add_time") String sort,
                        @RequestParam(defaultValue = "desc") String order) ;

    @ApiOperation("管理员添加专题 /create")
    /**
    @RequiresPermissions("admin:topic:create")
    @RequiresPermissionsDesc(menu = {"推广管理", "专题管理"}, button = "添加")
     */
    @PostMapping("")
    public Object create(@RequestBody Topic topic) ;

    @ApiOperation("管理员查看专题详情 /read")
    /**
    *@RequiresPermissions("admin:topic:read")
    *@RequiresPermissionsDesc(menu = {"推广管理", "专题管理"}, button = "详情")
     */
    @GetMapping("/{id}")
    public Object read(@NotNull Integer id) ;

    @ApiOperation("管理员编辑专题 /update")
    /**
    @RequiresPermissions("admin:topic:update")
    @RequiresPermissionsDesc(menu = {"推广管理", "专题管理"}, button = "编辑")
    */
    @PutMapping("/{id}")
    public Object update(@RequestBody Topic topic,@PathVariable Integer id) ;

    @ApiOperation("管理员删除专题 /delete")
    /**
     @RequiresPermissions("admin:topic:delete")
     @RequiresPermissionsDesc(menu = {"推广管理", "专题管理"}, button = "删除")
     */
    @DeleteMapping("/{id}")
    public Object delete(@RequestBody Topic topic,@PathVariable Integer id) ;
}
