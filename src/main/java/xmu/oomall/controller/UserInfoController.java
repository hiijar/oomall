package xmu.oomall.userinfo;
import xmu.oomall.userinfo.domain.*;
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
@RequestMapping("userInfoService")
public interface UserInfoService {
    // 内部接口
    /**
     * 修改用户返点
     * @param user 用户的实例对象
     * @return 修改结果
     */
    @PutMapping("/user/rebate")
    Object updateUserRebate(@RequestBody User user);

    // 管理员
    /**
     * 获取管理员列表
     * @return 管理员列表
     */
    @GetMapping("/admins")
   Object adminList();

    /**
     * 创建一个管理员
     *
     * @param admin 管理员信息
     * @return 新增的admin对象
     */
    @PostMapping("/admins")
    Object createAdmin(@RequestBody Admin admin);

    /**
     * 查看管理员信息
     *
     * @param id 管理员的id
     * @return admin对象
     */
    @GetMapping("/admins/{id}")
    Object getAdminInfo(@PathVariable Integer id);

    /**
     * 修改管理员信息
     *
     * @param id 管理员id
     * @param admin 新的管理员信息
     * @return 修改后的admin对象
     */
    @PutMapping("/admins/{id}")
    Object updateAdmin(@PathVariable Integer id, @RequestBody Admin admin);

    /**
     * 删除某个管理员
     *
     * @param id 管理员id
     * @return 删除结果
     */
    @DeleteMapping("/admins/{id}")
    Object delete(@PathVariable Integer id);

    /**
     * 管理员根据请求信息登陆
     * @param body 请求体 包含账号密码
     * @return admin对象
     */
    @PostMapping("/admins/login")
    Object adminLogin(@RequestBody Object body);

    /**
     * 管理员注销
     * @return admin对象
     */
    @PostMapping("/admins/logout")
    Object adminLogOut();

    /**
     * 管理员查看自己的信息
     * @return admin对象
     */
    @GetMapping("/admins/info")
    Object adminInfo();

    /**
     * 管理员修改密码
     * @param admin admin对象
     * @return admin对象
     */
    @PutMapping("/admin/password")
    Object updateAdminPassword(@RequestBody Admin admin);
    /**
     * 管理员获取用户列表
     * @return 用户列表
     */
    @GetMapping("/users")
    Object userList();

    /**
     * 管理员查看所有角色
     * @return role的列表
     */
    @GetMapping("/roles")
    Object roleList();

    /**
     * 管理员新建角色
     * @param role role实例
     * @return role的实例
     */
    @PostMapping("/roles")
    Object addRole(@RequestBody Role role);

    /**
     * 查看单个角色的详细信息
     * @param id role的id
     * @return role实例
     */
    @GetMapping("/roles/{id}")
    Object getRole(@PathVariable("id") Integer id);

    /**
     * 修改某个role的信息
     * @param id role的id
     * @param role role实例
     * @return 修改后的role
     */
    @PutMapping("/roles/{id}")
    Object updateRole(@PathVariable("id") Integer id, @RequestBody Role role);

    /**
     * 删除某个role
     * @param id role的id
     * @return 删除结果
     */
    @DeleteMapping("/roles/{id}")
    Object deleteRole(@PathVariable("id") Integer id);

    /**
     * 修改role权限
     * @param id role的id
     * @param role 要修改的role实例
     * @return 没有permission表，暂时返回role
     */
    @PutMapping("/roles/{id}/permission")
    Object updateRolePermission(@PathVariable("id") Integer id, @RequestBody Role role);

    /**
     * 返回一个权限对应的管理员
     * @param id 权限的id
     * @return 管理员的列表
     */
    @GetMapping("/roles/{id}/admins")
    Object getAdmin(@PathVariable("id") Integer id);


    // 用户
    /**
     * 用户个人页面数据
     *
     * 目前是用户订单统计信息
     * 具体的userId去解析token获得
     * @return 用户个人页面数据userInfoVo
     */
    @GetMapping("/user")
    Object userInfo();

    /**
     * 用户账号登录
     *
     * @param body 包含账号密码
     * @return 数据是userInfoVo
     */
    @PostMapping("/login")
    Object userLogin(@RequestBody Object body);

    /**
     * 请求注册验证码
     *
     * 这里需要一定机制防止短信验证码被滥用
     * @param body 包括phoneNumber,captchaType
     * @return 验证码
     */
    @PostMapping("/regCaptcha")
    Object registerCaptcha(@RequestBody Object body);

    /**
     * 用户账号注册
     *
     * @param body    请求内容
     *                {
     *                username: xxx,
     *                password: xxx,
     *                mobile: xxx
     *                wxCode: xxx
     *                }
     *                其中code是手机验证码，目前还不支持手机短信验证码
     * @param request 请求对象
     * @return 注册结果
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
    Object register(@RequestBody String body, HttpServletRequest request);

    /**
     * 请求验证码
     *
     * 这里需要一定机制防止短信验证码被滥用
     * @param captcha 手机号码 { mobile: xxx, type: xxx }
     * @return 验证码captcha
     */
    @PostMapping("/captcha")
    Object captcha(@RequestBody Object captcha);

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
   Object reset(@RequestBody String body, HttpServletRequest request);

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
    Object resetPhone(@RequestBody String body, HttpServletRequest request);
}
