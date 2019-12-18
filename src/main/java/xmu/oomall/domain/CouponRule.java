package xmu.oomall.domain;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

/**
 * @Author: 数据库与对象模型标准组
 * @Description:优惠规则对象
 * @Data:Created in 14:50 2019/12/11
 **/
@Getter
@Setter
@ToString
@EqualsAndHashCode(callSuper = true)
public class CouponRule extends CouponRulePo {

    private Object couponStrategy;
}
