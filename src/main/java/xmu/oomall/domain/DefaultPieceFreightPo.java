package xmu.oomall.domain;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.math.BigDecimal;
import java.time.LocalDateTime;

/**
 * @Author: 数据库与对象模型标准组
 * @Description: 默认件数模板
 * @Date: Created in 16:00 2019/12/11
 **/
@Getter
@Setter
@ToString
@EqualsAndHashCode
public class DefaultPieceFreightPo {

    private Integer id;
    /**
     * 货物运送的目的地（即收货地址）
     * JSON格式: {"dest": [xxx,xxx,xxx,xxx,xxx]}
     * eg. {"dest": [1, 2, 3, 4, 5]}
     */
    private String destination;
    /**
     * 单位比例
     */
    private BigDecimal unitRate;
    /**
     * 快递送到需要的时间（次日 或者 1-2天等 ）
     */
    private String requireDays;
    private LocalDateTime gmtCreate;
    private LocalDateTime gmtModified;
    private Boolean beDeleted;

}
