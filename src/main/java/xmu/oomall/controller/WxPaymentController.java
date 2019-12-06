package com.xmu.wowoto.wx_payment.controller;

import com.xmu.wowoto.wx_payment.util.ResponseUtil;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.HashMap;
import java.util.Map;

@RestController
public interface WxPaymentController {

    /*
     * @Return:
     *     prepay_id, 微信生成的预支付会话标识
     *     等等
     */
    @PostMapping("prepays")
    @ApiOperation("商户在小程序中先调用该接口在微信支付服务后台生成预支付交易单，返回正确的预支付交易后调起支付。")
    public Object unifiedOrder(@ApiParam(name="actualPrice",value="付款金额",required=true) BigDecimal actualPrice,
                               @ApiParam(name="payChannel",value="付款渠道",required=true) Integer payChannel,
                               @ApiParam(name="beginTime",value="付款的开始时间",required=false) LocalDateTime beginTime,
                               @ApiParam(name="endTime",value="付款的结束时间",required=false) LocalDateTime endTime,
                               @ApiParam(name="orderId",value="商户订单号",required=true)Integer orderId);



    @PutMapping("prepays/{id}")
    @ApiOperation("调用requestPayment()发起微信支付")
    public Object requestPayment(@ApiParam(name="timeStamp",value="时间戳",required=true) String timeStamp,
                                 @ApiParam(name="prepay_id",value="统一下单接口返回的 prepay_id 参数值",required=true) @PathVariable("id") String prepay_id,
                                 @ApiParam(name="orderId",value="商户订单号",required=true) String orderId);

}