package com.xmu.wowoto.payment.jiekou;

import org.springframework.web.bind.annotation.*;

/**
 * @Author zqh
 * @create 2019/12/10 23:18
 * 因为这个模块的内部接口都是我自己(凭空)瞎想的，难免有不正确的地方。如果大家发现了不正确的地方，欢迎（并且十分需要你的）纠正:)
 */
@RequestMapping("PaymentService")
@RestController
public interface PaymentController {

    /**
     * 订单模块调用此方法请求下单支付
     * 此方法再调用WxPayment模块的addWxPayment()方法（模拟微信统一支付api），addWxPayment方法应该返回prepay_id等信息
     * 此方法拿到prepay_id等信息后，需要修改数据库中payment表相应属性的属性值，如paySn等等
     * 调用此方法后，前端应显示包括商户名称、订单总价、支付方式(等)信息的界面，供用户确认其支付信息
     * 确认其支付信息后，用户可以点击确认支付按钮调用WxPayment模块的RequestPayment()方法发起最终支付
     *
     * @param orderPaymentVo
     * @return OrderPaymentVo
     */
    @PostMapping("payment")
    public Object addPayment(@Requestbody OrderPaymentVo orderPaymentVo);



    /**
     * 管理员删除支付（好像没什么用？）
     *
     * @param paymentId
     * @return Payment
     */
    @DeleteMapping("payment/{id}")
    public Object deletePayment(@PathVariable("id") Integer paymentId);



    /**
     * （模拟的）微信后台调用此方法修改订单状态
     * 此方法还会调用order模块的updateOrder方法，修改订单状态
     *
     * @param prepay_id：预支付订单号
     * @return Payment
     */
    @PutMapping("payment/{id}")
    public Object updatePayment(@PathVariable("id") Integer prepay_id);


    /**
     * 管理员查看所有支付（用户好像不用看？）
     *
     * @param getPaymentVo
     * @return List<GetPaymentVo>
     */
    @GetMapping("admin/payment")
    public Object adminGetAllPayments(GetPaymentVo getPaymentVo, @RequestParam Integer userId);



    /**
     * 管理员查看某个支付（用户好像不用看？）
     *
     * @param paymentId
     * @return GetPaymentVo
     */
    @GetMapping("admin/payment/{id}")
    public Object adminGetAllPayments(@PathVariable("id") Integer paymentId, @RequestParam Integer userId);

}
