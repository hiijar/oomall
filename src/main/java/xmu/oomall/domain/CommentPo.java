package xmu.oomall.domain;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.time.LocalDateTime;

/**
 * @Author: 数据库与对象模型标准组
 * @Description:评论
 * @Data:Created in 14:50 2019/12/11
 **/
@Getter
@Setter
@ToString
@EqualsAndHashCode
public class CommentPo {
    private Integer id;
    /**
     * 发表评论的用户的id
     */
    private Integer userId;
    /**
     * 发表评论的内容
     */
    private String content;
    /**
     * 评论的状态 0：未审核 1：审核通过 2：审核失败
     */
    private Integer statusCode;
    /**
     * 发表评论的星级（1-5）
     */
    private Integer star;
    /**
     * 评论的产品的id
     */
    private Integer productId;

    private LocalDateTime gmtCreate;
    private LocalDateTime gmtModified;
    private Boolean beDeleted;

}
