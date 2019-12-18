package xmu.oomall.domain;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.math.BigDecimal;
import java.time.LocalDateTime;

/**
 * @Author: 数据库与对象模型标准组
 * @Description: 订单明细
 * @Date: Created in 15:19 2019/12/11
 **/
@Getter
@Setter
@ToString
@EqualsAndHashCode
public class OrderPo {
    private Integer id;
    /**
     * 下单用户
     */
    private Integer userId;
    /**
     * 订单序号
     */
    private String orderSn;
    /**
     * 订单状态
     * 0：订单生成,未支付
     * 1：下单后未支付，用户取消
     * 2：下单后未支付超时系统自动取消
     * 3：支付完成，商家未发货
     * 4：订单产生，已付款未发货，此时用户取消订单并取得退款（在发货前只要用户点取消订单，无需经过审核）
     * 5:商家发货，用户未确认
     * 6:用户确认收货
     * 7:用户没有确认收货超过一定时间，系统自动确认收货
     * 8:已评价
     */
    private Integer statusCode;
    /**
     * 收件人姓名
     */
    private String consignee;
    /**
     * 联系电话
     */
    private String mobile;
    /**
     * 留言
     */
    private String message;
    /**
     * 商品总价
     */
    private BigDecimal goodsPrice;
    /**
     * 优惠卷减免费用
     */
    private BigDecimal couponPrice;
    /**
     * 返点减免费用
     */
    private BigDecimal rebatePrice;
    /**
     * 配送费用
     */
    private BigDecimal freightPrice;
    /**
     * 总费用
     */
    private BigDecimal integralPrice;
    /**
     * 快递单编号
     */
    private String shipSn;
    /**
     * 发货快递公司
     */
    private String shipChannel;
    /**
     * 发货时间
     */
    private LocalDateTime shipTime;
    /**
     * 用户收货确认时间
     */
    private LocalDateTime confirmTime;
    /**
     * 订单关闭时间
     */
    private LocalDateTime endTime;
    /**
     * 订单支付时间
     */
    private LocalDateTime payTime;
    /**
     * 父订单Id
     */
    private Integer parentId;
    /**
     * 收货地址
     */
    private String address;

    private LocalDateTime gmtCreate;
    private LocalDateTime gmtModified;
    private Boolean beDeleted;

}
