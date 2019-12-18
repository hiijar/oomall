package xmu.oomall.domain;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.time.LocalDateTime;

/**
 * @Author: 数据库与对象模型标准组
 * @Description:团购规则信息
 * @Data:Created in 14:50 2019/12/11
 **/
@Getter
@Setter
@ToString
@EqualsAndHashCode
public class GrouponRulePo {
    private Integer id;
    /**
     * 团购开始时间
     */
    private LocalDateTime startTime;
    /**
     * 团购结束时间
     */
    private LocalDateTime endTime;
    /**
     * 判断团购是否还在进行中
     */
    private Boolean statusCode;
    /**
     * 团购等级（满多少人组团多少折扣）
     * JSON格式: {"strategy": [{"lowerbound":xxx, "upperbound":xxx, "rate":xxx}]}, xxx为具体数值
     */
    private String grouponLevelStragety;
    /**
     * 团购商品id
     */
    private Integer goodsId;

    private LocalDateTime gmtCreate;
    private LocalDateTime gmtModified;
    private Boolean beDeleted;
}