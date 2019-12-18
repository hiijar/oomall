package xmu.oomall.domain;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.Objects;

/**
 * @Author: 数据库与对象模型标准组
 * @Description: 产品信息
 * @Date: Created in 16:00 2019/12/11
 **/
@Getter
@Setter
@ToString
@EqualsAndHashCode
public class ProductPo {

    private Integer id;
    /**
     * 产品对应商品的id
     */
    private Integer goodsId;
    /**
     * 产品图片的url
     */
    private String picUrl;
    /**
     * sku属性，用于描述特定货品，如红色，41码
     * JSON格式，针对不同规格有不同的描述
     * eg1. {"color": "red", "size": 41}，可以表示红色41码
     * eg2. {"color": "black", "volume": 500}，可以表示黑色500ml的水杯
     */
    private String specifications;
    /**
     * 产品价格
     */
    private BigDecimal price;
    /**
     * 产品安全库存
     */
    private Integer safetyStock;

    private LocalDateTime gmtCreate;
    private LocalDateTime gmtModified;
    private Boolean beDeleted;

}
