package com.xmu.wowoto.wx_payment.jiekou;

import org.springframework.web.bind.annotation.*;

/**
 * @Author zqh
 * @create 2019/12/11 11:06
 * 因为这个模块的内部接口都是我自己(凭空)瞎想的，难免有不正确的地方。如果大家发现了不正确的地方，欢迎（并且十分需要你的）纠正:)
 */
@RequestMapping("/WxPaymentService")
@RestController
public interface WxPaymentController {

    /**
     * 支付模块调用此方法模拟微信统一支付api
     * 此方法应该返回给支付模块prepay_id等信息
     *
     * @param paymentWxPaymentVo
     * @return PaymentWxPaymentVo
     */
    @PostMapping("wxpayment")
    public Object unifiedWxPayment(PaymentWxPaymentVo paymentWxPaymentVo);


    /**
     * 用户发起最终支付
     * 此方法将调用Payment模块的updatePayment方法修改支付状态等信息
     * updatePayment方法进而调用Order模块的updateOrder方法修改订单状态等信息
     * 同时，调用此方法后，前端应显示当前（支付状态），商品，商品全称，支付时间，支付方式，交易单号，商户单号等信息给用户
     *
     * @param prepay_id
     * @return updateWxPaymentVo
     */
    @PutMapping("wxpayment/{id}")
    public Object requestWxPayment(@PathVariable("id") Integer prepay_id);

}
