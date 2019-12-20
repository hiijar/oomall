package xmu.oomall.vo;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import xmu.oomall.domain.Address;

import java.util.List;

/**
 * @author: Ming Qiu
 * @description: OrderController.submit 的VO对象
 * @date: Created in 15:06 2019/11/5
 * @modified By:
 **/
@Getter
@Setter
@ToString
@EqualsAndHashCode
public class OrderSubmitVo {
    /**
     *  用户提交的返点数
     */
    private Integer rebate;
    /**
     *  用户在购物车中选中项目的id
     */
    private List<Integer> cartItemIds;
    /**
     * 配送的地址
     */
    private Address address;
    /**
     * 优惠卷id
     */
    private Integer couponId;
    /**
     * 订单留言
     */
    private String message ="";
}
