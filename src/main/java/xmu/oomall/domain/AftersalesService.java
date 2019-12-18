package xmu.oomall.domain;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.time.LocalDateTime;

/**
 * @Author: 数据库与对象模型标准组
 * @Description: 订单明细
 * @Date: Created in 14:50 2019/12/11
 **/
@Getter
@Setter
@ToString
@EqualsAndHashCode
public class AftersalesService {
    private Integer id;
    /**
     * 下单时对应商品类型，只有两种：（1）预售商品，取值为1（2）其他商品，取值为0
     */
    private Integer goodsType;
    /**
     * 申请售后时间
     */
    private LocalDateTime applyTime;
    /**
     * 申请售后理由
     */
    private String applyReason;
    /**
     *售后完成时间
     */
    private LocalDateTime endTime;
    /**
     * 售后类型，0退货，1换货
     */
    private Integer type;
    /**
     * 用户售后请求现在是否有效（用户可以主动取消售后请求，售后请求也可能超时）
     */
    private Boolean beApplied;
    /**
     * 申请服务的产品数量，如退货的件数
     */
    private Integer number;
    /**
     * 订单明细ID
     */
    private Integer orderItemId;
    /**
     * 管理员处理状态,有三个状态：未审核：0 审核通过：1 审核拒绝：2
     */
    private Integer statusCode;
    /**
     * 用户ID
     */
    private Integer userId;

    private LocalDateTime gmtCreate;
    private LocalDateTime gmtModified;
    private Boolean beDeleted;

}
