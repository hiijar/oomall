package xmu.oomall.domain;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.time.LocalDateTime;

/**
 * @Author: 数据库与对象模型标准组
 * @Description:被分享明细
 * @Data:Created in 14:50 2019/12/11
 **/
@Getter
@Setter
@ToString
@EqualsAndHashCode
public class BeSharedItem {

    private Integer id;
    /**
     * 分享者的id
     */
    private Integer sharerId;
    /**
     * 被分享者的id
     */
    private Integer beSharedUserId;
    /**
     * 状态 0：表示分享成功 1：表示成功购买且未退货
     */
    private Integer statusCode;
    /**
     * 分享成功时的时间
     */
    private LocalDateTime birthTime;
    /**
     * 分享的商品id
     */
    private Integer goodsId;
    private LocalDateTime gmtCreate;
    private LocalDateTime gmtModified;
    private Boolean beDeleted;

}
