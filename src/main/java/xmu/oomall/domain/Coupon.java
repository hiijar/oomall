package xmu.ddao.domain.standard;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
@EqualsAndHashCode(callSuper = true)
public class Coupon extends CouponPo {
    private CouponRule couponRule;
}
