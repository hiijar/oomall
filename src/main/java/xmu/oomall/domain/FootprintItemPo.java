package xmu.oomall.domain;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.time.LocalDateTime;

/**
 * @Author: 数据库与对象模型标准组
 * @Description:足迹信息
 * @Data:Created in 14:50 2019/12/11
 **/
@Getter
@Setter
@ToString
@EqualsAndHashCode
public class FootprintItemPo {
    private Integer id;

    /**
    *创建时间
    */
    private LocalDateTime birthTime;
    /**
    *用户id
    */
    private Integer userId;
    /**
    *商品id
    */
    private Integer goodsId;
    private LocalDateTime gmtCreate;
}
