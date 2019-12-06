package com.xmu.wowoto.payment.controller;

import com.xmu.wowoto.payment.util.ResponseUtil;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@RestController("")
public class PaymentController {

    @PostMapping("payments")
    @ApiOperation("下单，获取prepay_id等五个参数，进而鉴权调起支付")
    public Object addPayment(@ApiParam(name="orderId",value="商户订单号",required=true) String orderId){
        Map<String, Object> addPaymentRet = new HashMap<String, Object>();
        return ResponseUtil.ok(addPaymentRet);
    }

    @PutMapping("payments/{id}")
    @ApiOperation("微信后台向商户系统推送支付结果，商户系统修改订单状态")
    public boolean updatePayment(@ApiParam(name="return_code",value="SUCCESS/FAIL",required=true) String return_code,
                                @ApiParam(name="return_msg",value="返回信息，如非空，为错误原因",required=false) String return_msg,
                                @ApiParam(name="orderId",value="商户订单号",required=true) @PathVariable("id") String orderId){
        return true;
    }
}
