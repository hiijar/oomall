package xmu.oomall.domain;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.time.LocalDateTime;

/**
 * @Author: 数据库与对象模型标准组
 * @Description: 分享明细
 * @Date: Created in 16:00 2019/12/11
 **/
@Getter
@Setter
@ToString
@EqualsAndHashCode
public class ShareItem {
    private Integer id;
    /**
     *分享者ID
     */
    private Integer userId;
    /**
     *商品ID
     */
    private Integer goodsId;
    /**
     *成功件数
     */
    private Integer successNum;

    private LocalDateTime gmtCreate;
    private LocalDateTime gmtModified;
    private Boolean beDeleted;

}
