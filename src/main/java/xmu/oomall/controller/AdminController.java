package com.ooad.controller;
import com.ooad.domain.other.Admin;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;
import javax.servlet.http.HttpServletRequest;
/**
 * AdminController
 *
 * @author YangHong
 * @date 2019-12-03
 */
@RestController
@RequestMapping("/admin")
@Validated
@Api(value = "admin-admin")
public interface AdminController {
    /**
     * 管理员获取用户列表
     * @param username 用户名
     * @param mobile 手机号
     * @param page 分页页数
     * @param limit 分页大小
     * @param sort 添加时间排序
     * @param order 添加时间排序
     * @return 用户列表
     */
    @ApiOperation("管理员查询用户 /list")
    @GetMapping("/users")
    Object userList(String username, String mobile,
                    @RequestParam(defaultValue = "1") Integer page,
                    @RequestParam(defaultValue = "10") Integer limit,
                    @RequestParam(defaultValue = "add_time") String sort,
                    @RequestParam(defaultValue = "desc") String order);

    /**
     * 获取管理员列表
     *
     * @param username 管理员名
     * @param page 分页页数
     * @param limit 分页大小
     * @param sort 添加时间排序
     * @param order desc排序
     * @return Object 管理员列表
     */
    @GetMapping("/admins")
    @ApiOperation(value="按照条件查找管理员/list")
    Object list(String username,
                @RequestParam(defaultValue = "1") Integer page,
                @RequestParam(defaultValue = "10") Integer limit,
                @RequestParam(defaultValue = "add_time") String sort,
                @RequestParam(defaultValue = "desc") String order);

    /**
     * 创建一个管理员
     *
     * @param admin 管理员信息
     * @return 创建结果（成功或者失败）
     */
    @PostMapping("/admins")
    @ApiOperation("新建一个管理员/create")
    Object create(@RequestBody Admin admin);

    /**
     * 查看管理员信息
     *
     * @param id 管理员的id
     * @return 管理员信息
     */
    @GetMapping("/admins/{id}")
    @ApiOperation("根据id查看单个管理员/read")
    Object read(@PathVariable Integer id);

    /**
     * 修改管理员信息
     *
     * @param id 管理员id
     * @param admin 新的管理员信息
     * @return 修改结果
     */
    @PutMapping("/admins/{id}")
    @ApiOperation(value="修改管理员信息/update")
    Object update(@PathVariable Integer id, @RequestBody Admin admin);

    /**
     * 删除某个管理员
     *
     * @param id 管理员id
     * @param admin 管理员信息
     * @return 删除结果
     */
    @DeleteMapping("/admins/{id}")
    @ApiOperation(value="删除一个管理员/delete")
   Object delete(@PathVariable Integer id, @RequestBody Admin admin);

    /**
     * 管理员根据请求信息登陆
     * @param body 请求体
     * @param request 请求
     * @return 登陆结果
     */
    @PostMapping("/admins/login")
    @ApiOperation("管理员登录/login")
    Object login(@RequestBody String body, HttpServletRequest request);

    /**
     * 管理员注销
     * @return 注销结果
     */
    @PostMapping("/admins/logout")
    @ApiOperation("管理员登出/logout")
    Object logout();

    /**
     * 管理员查看自己的信息
     * @return 管理员的信息
     */
    @GetMapping("/admins/info")
    @ApiOperation("查看管理员自己的信息/info")
    Object info();
}
