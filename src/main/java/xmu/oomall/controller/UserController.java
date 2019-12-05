package com.ooad.controller;
import io.swagger.annotations.ApiOperation;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;
import javax.servlet.http.HttpServletRequest;

/**
 * UserController
 *
 * @author YangHong
 * @date 2019-12-03
 */
@RestController
@RequestMapping("")
@Validated
public interface UserController {
    /**
     * 用户个人页面数据
     *
     * 目前是用户订单统计信息
     *
     * @param userId 用户ID
     * @return 用户个人页面数据
     */
    @ApiOperation("用户查看自己的信息 /index")
    @GetMapping("/info")
    Object userInfo(Integer userId);

    /**
     * 账号登录
     *
     * @param body    请求内容，{ username: xxx, password: xxx }
     * @param request 请求对象
     * @return 登录结果
     */
    @PostMapping("login")
    @ApiOperation(value="用户登录 /login")
    Object login(@RequestBody String body, HttpServletRequest request);

    /**
     * 请求注册验证码
     *
     * TODO
     * 这里需要一定机制防止短信验证码被滥用
     * @param body 手机号码 { mobile }
     * @return
     */
    @PostMapping("regCaptcha")
    @ApiOperation(value="请求注册验证码 保留原来")
   Object registerCaptcha(@RequestBody String body);

    /**
     * 账号注册
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
    @PostMapping("register")
    @ApiOperation(value="用户注册 保留原来")
    Object register(@RequestBody String body, HttpServletRequest request);

    /**
     * 请求验证码
     *
     * TODO
     * 这里需要一定机制防止短信验证码被滥用
     *
     * @param body 手机号码 { mobile: xxx, type: xxx }
     * @return
     */
    @PostMapping("captcha")
    @ApiOperation(value="请求验证码 保留原来")
    Object captcha(Integer userId, @RequestBody String body);

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
    @PutMapping("password")
    @ApiOperation(value="用户重置密码 /reset")
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
    @PutMapping("phone")
    @ApiOperation(value="用户重置手机 /resetphone")
    Object resetPhone(Integer userId, @RequestBody String body, HttpServletRequest request);

}
