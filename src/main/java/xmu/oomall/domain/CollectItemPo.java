package xmu.oomall.domain;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.time.LocalDateTime;

/**
 * @Author: 数据库与对象模型标准组
 * @Description:收藏明细
 * @Data:Created in 14:50 2019/12/11
 **/
@Getter
@Setter
@ToString
@EqualsAndHashCode
public class CollectItemPo {
    private Integer id;
    /**
    *商品id
    */
    private Integer goodsId;
    /**
    *用户id
    */
    private Integer userId;

    private LocalDateTime gmtCreate;
    private LocalDateTime gmtModified;
}
