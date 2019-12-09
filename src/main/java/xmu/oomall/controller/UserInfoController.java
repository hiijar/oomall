package com.ooad.controller;
import com.ooad.domain.ad.Ad;
import com.ooad.domain.other.Admin;
import com.ooad.domain.other.Role;
import com.ooad.domain.other.User;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.apache.ibatis.annotations.Param;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;
import javax.servlet.http.HttpServletRequest;
import java.math.BigDecimal;
import java.util.List;

/**
 * AdminController
 *
 * @author YangHong
 * @date 2019-12-03
 */
@RestController
@RequestMapping("")
public interface UserInfoController {
    // 内部接口
    /**
     * 内部接口， 修改返点的值
     * @param userId 用户的id
     * @param rebate 返点值
     * @return 修改成功或者失败
     */
    @PutMapping("/user/rebate")
    String userInfo(Integer userId, BigDecimal rebate);

    // 管理员
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
    @GetMapping("users")
    List<User> userList(String username, String mobile,
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
    List<Admin> list(String username,
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
    String create(@RequestBody Admin admin);

    /**
     * 查看管理员信息
     *
     * @param id 管理员的id
     * @return 管理员信息
     */
    @GetMapping("/admins/{id}")
    Admin read(@PathVariable Integer id);

    /**
     * 修改管理员信息
     *
     * @param id 管理员id
     * @param admin 新的管理员信息
     * @return 修改结果
     */
    @PutMapping("/admins/{id}")
    Admin update(@PathVariable Integer id, @RequestBody Admin admin);

    /**
     * 删除某个管理员
     *
     * @param id 管理员id
     * @param admin 管理员信息
     * @return 删除结果
     */
    @DeleteMapping("/admins/{id}")
   String delete(@PathVariable Integer id, @RequestBody Admin admin);

    /**
     * 管理员根据请求信息登陆
     * @param body 请求体
     * @param request 请求
     * @return 登陆结果
     */
    @PostMapping("/admins/login")
    String adminLogin(@RequestBody String body, HttpServletRequest request);

    /**
     * 管理员注销
     * @return 注销结果
     */
    @PostMapping("/admins/logout")
    String logout(@Loginuser Integer userId);

    /**
     * 管理员查看自己的信息
     * @param userId 用户的id
     * @return 管理员的信息
     */
    @GetMapping("/admins/info")
    Admin info(@Loginuser Integer userId);

    /**
     * 管理员查看所有角色
     * @return 角色列表
     */
    @GetMapping("/roles")
    List<Role> roleList();

    /**
     * 管理员新建角色
     * @param role role实例
     * @return 创建结果
     */
    @PostMapping("/roles")
    String addRole(@RequestBody Role role);

    /**
     * 查看单个角色的详细信息
     * @param id role的id
     * @return role实例
     */
    @GetMapping("/roles/{id}")
    Role getRole(@PathVariable("id") Integer id);

    /**
     * 修改某个role的信息
     * @param id role的id
     * @param role role实例
     * @return 修改后的role
     */
    @PutMapping("/roles/{id}")
    Role updateRole(@PathVariable("id") Integer id, @RequestBody Role role);

    /**
     * 删除某个role
     * @param id role的id
     * @return 删除结果
     */
    @DeleteMapping("/roles/{id}")
    String deleteRole(@PathVariable("id") Integer id);

    /**
     * 修改role权限
     * @param id role的id
     * @param  permission 权限
     * @return 修改结果
     */
    @PutMapping("/roles/{id}/permission")
    String updateRolePermission(@PathVariable("id") Integer id, @Param("permission") String permission);

    /**
     * 返回一个权限对应的管理员
     * @param id 权限的id
     * @return 管理员的列表
     */
    @GetMapping("/roles/{id}/admins")
    List<Admin> getAdmin(@PathVariable("id") Integer id);
    // 用户
    /**
     * 用户个人页面数据
     *
     * 目前是用户订单统计信息
     *
     * @param userId 用户ID
     * @return 用户个人页面数据
     */
    @GetMapping("/info")
    User userInfo(@Loginuser Integer userId);

    /**
     * 用户账号登录
     *
     * @param body    请求内容，{ username: xxx, password: xxx }
     * @param request 请求对象
     * @return 登录结果
     */
    @PostMapping("/login")
    User userLogin(@RequestBody String body, HttpServletRequest request);

    /**
     * 请求注册验证码
     *
     * TODO
     * 这里需要一定机制防止短信验证码被滥用
     * @param body 手机号码 { mobile }
     * @return 验证码
     */
    @PostMapping("/regCaptcha")
    String registerCaptcha(@RequestBody String body);

    /**
     * 用户账号注册
     *
     * @param body    请求内容
     *                {
     *                username: xxx,
     *                password: xxx,
     *                mobile: xxx
     *                code: xxx
     *                }
     *                其中code是手机验证码，目前还不支持手机短信验证码
     * @param request 请求对象
     * @return 登录结果
     * 成功则
     * {
     * errno: 0,
     * errmsg: '成功',
     * data:
     * {
     * token: xxx,
     * tokenExpire: xxx,
     * userInfo: xxx
     * }
     * }
     * 失败则 { errno: XXX, errmsg: XXX }
     */
    @PostMapping("/register")
    User register(@RequestBody String body, HttpServletRequest request);

    /**
     * 请求验证码
     *
     * TODO
     * 这里需要一定机制防止短信验证码被滥用
     *
     * @param body 手机号码 { mobile: xxx, type: xxx }
     * @return 验证码
     */
    @PostMapping("/captcha")
    String captcha(Integer userId, @RequestBody String body);

    /**
     * 账号密码重置
     *
     * @param body    请求内容
     *                {
     *                password: xxx,
     *                mobile: xxx
     *                code: xxx
     *                }
     *                其中code是手机验证码，目前还不支持手机短信验证码
     * @param request 请求对象
     * @return 登录结果
     * 成功则 { errno: 0, errmsg: '成功' }
     * 失败则 { errno: XXX, errmsg: XXX }
     */
    @PutMapping("/password")
    User reset(@RequestBody String body, HttpServletRequest request);

    /**
     * 账号手机号码重置
     *
     * @param body    请求内容
     *                {
     *                password: xxx,
     *                mobile: xxx
     *                code: xxx
     *                }
     *                其中code是手机验证码，目前还不支持手机短信验证码
     * @param request 请求对象
     * @return 登录结果
     * 成功则 { errno: 0, errmsg: '成功' }
     * 失败则 { errno: XXX, errmsg: XXX }
     */
    @PutMapping("/phone")
    User resetPhone(@Loginuser Integer userId, @RequestBody String body, HttpServletRequest request);
}
