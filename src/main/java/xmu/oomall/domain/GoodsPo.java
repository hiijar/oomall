package xmu.oomall.domain;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.math.BigDecimal;
import java.time.LocalDateTime;

/**
 * @Author: 数据库与对象模型标准组
 * @Description:商品信息
 * @Data:Created in 14:50 2019/12/11
 **/
@Getter
@Setter
@ToString
@EqualsAndHashCode
public class GoodsPo {

    private Integer id;
    /**
     * 商品名称
     */
    private String name;
    /**
     * 商品序列号
     */
     private String goodsSn;
    /**
     * 商品简称
     */
    private String shortName;
    /**
     * 商品描述
     */
    private String description;
    /**
     * 商品简介
     */
    private String brief;
    /**
     * 图片链接
     */
    private String picUrl;
    /**
     * 商品详情（可以参照淘宝的商品详情页，全是图片的那种）
     * JSON格式: {"detail": [xxx,xxx,xxx]},xxx代表图片url
     */
    private String detail;
    /**
     * 上下架状态，0表示下架，1表示上架，2表示最新，3表示最热，4表示最新且最热
     */
    private Integer statusCode;
    /**
     * 分享链接
     */
    private String shareUrl;
    /**
     * 商品图片展示廊，就是像淘宝点进商品，滚动展示很多图片
     * JSON格式: {"gallery": [xxx,xxx,xxx] },xxx代表图片url
     */
    private String gallery;
    /**
     * 商品分类ID
     */
    private Integer goodsCategoryId;
    /**
     * 品牌ID
     */
    private Integer brandId;
    /**
     * 商品重量
     */
    private BigDecimal weight;
    /**
     * 商品体积
     * JSON格式: {length:xxx, width:xxx, height:xxx},xxx为具体数值,单位厘米
     */
    private String volume;
    /**
     * 特殊邮费计算模板ID
     */
    private Integer specialFreightId;
    /**
     * 0：默认模板计算邮费 1：特殊模板计算邮费
     */
    private Boolean beSpecial;
    /**
     * 该商品的最低产品价格
     */
    private BigDecimal price;

    private Boolean beDeleted;
    private LocalDateTime gmtCreate;
    private LocalDateTime gmtModified;

}
