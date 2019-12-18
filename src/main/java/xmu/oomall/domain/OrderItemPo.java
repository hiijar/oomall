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
 * @Date: Created in 14:35 2019/12/11
 **/
@Getter
@Setter
@ToString
@EqualsAndHashCode
public class OrderItemPo {
    private Integer id;
    /**
     * 所属订单的ID
     */
    private Integer orderId;
    /**
     *下单时商品类型，0普通商品，1预售商品，2团购商品
     */
    private Integer itemType;
    /**
     *订单项状态，0未付款，1未发货，2未收货，3未评价，4已完成订单(无售后或售后拒绝)，5申请退货，6退货成功，7申请换货，8换货成功，9待付尾款
     */
    private Integer statusCode;
    /**
     * 数量
     */
    private Integer number;
    /**
     * 价格
     */
    private BigDecimal price;
    /**
     * 成交价格，用于退货
     */
    private BigDecimal dealPrice;
    /**
     * 订单项对应货品ID
     */
    private Integer productId;
    /**
     * 订单项对应商品ID（冗余存储）
     */
    private Integer goodsId;
    /**
     * 订单项对应商品的描述（冗余存储）
     * JSON格式: {"name":xyz, "specifications":{"xxx": xxx, "yyy":yyy}}
     */
    private String nameWithSpecifications;
    /**
     * 订单项对应商品图片（冗余存储）
     */
    private String picUrl;
    private LocalDateTime gmtCreate;
    private LocalDateTime gmtModified;
    private Boolean beDeleted;

}
