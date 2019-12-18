package xmu.oomall.domain;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.time.LocalDateTime;
import java.util.Objects;

/**
 * @Author: 数据库与对象模型标准组
 * @Description:优惠券规则信息
 * @Data:Created in 14:50 2019/12/11
 **/
@Getter
@Setter
@ToString
@EqualsAndHashCode
public class CouponRulePo {
    private Integer id;
    /**
     * 优惠券规则名称
     */
    private String name;
    /**
     * 优惠券简介
     */
    private String brief;
    /**
     * 优惠券规则的生效日期
     */
    private LocalDateTime beginTime;
    /**
     * 优惠券规则的失效日期
     */
    private LocalDateTime endTime;
    /**
     * 判断优惠券规则是否还有效（管理员下架）
     */
    private Boolean statusCode;
    /**
     * 优惠券规则的图片
     */
    private String picUrl;
    /**
     * 优惠券规则的有效期(即有效的天数)
     */
    private Integer validPeriod;
    /**
     * 折扣策略
     * JSON格式:{"name":“XXX”, "obj":{XXX}}
     * eg. {"name":"xmu.oomall.discount.domain.DiscountStrategy.NumberStrategy", "obj":{"threshold":5, "offCash":10.01}}
     */
    private String strategy;
    /**
     * 该优惠券规则下优惠券的总张数
     */
    private Integer total;
    /**
     * 该优惠券规则下优惠券的被领取数
     */
    private Integer collectedNum;
    /**
     * 存放适用于本优惠券规则的所有商品ID
     * JSON格式:{"goodsIds": [xxx,xxx,xxx,xxx,xxx]}
     * eg. {"goodsIds": [1, 2, 3, 4, 5]}
     */
    private String goodsList1;
    /**
     * 存放适用于本优惠券规则的所有商品ID(商品可能很多，可能需要多个list存放)
     * JSON格式:{"goodsIds": [xxx,xxx,xxx,xxx,xxx]}
     * eg. {"goodsIds": [1, 2, 3, 4, 5]}
     */
    private String goodsList2;
    private LocalDateTime gmtCreate;
    private LocalDateTime gmtModified;
    private Boolean beDeleted;

}
