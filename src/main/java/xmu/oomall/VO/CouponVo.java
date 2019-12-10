package com.xmu.oomall.collectionservice.domain;
import xmu.oomall.domain.*;

import java.util.List;


public class CouponVo {

    /**
     * 优惠劵规则信息
     */
    private Coupon coupon;

    /**
     * 单张优惠劵信息
     */
    private CouponRules couponRules;

    public Coupon getCoupon() {
        return coupon;
    }

    public void setCoupon(Coupon coupon) {
        this.coupon = coupon;
    }

    public CouponRules getCouponRules() {
        return couponRules;
    }

    public void setCouponRules(CouponRules couponRules) {
        this.couponRules = couponRules;
    }
}
