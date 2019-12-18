package xmu.oomall.domain;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.math.BigDecimal;
import java.time.LocalDateTime;

/**
 * @Author: 数据库与对象模型标准组
 * @Description: 特殊运费模板
 * @Date: Created in 16:00 2019/12/11
 **/
@Getter
@Setter
@ToString
@EqualsAndHashCode
public class SpecialFreight {

    private Integer id;
    /**
     * 首几件
     */
    private Integer firstNumPiece;
    /**
     * 首几件价格
     */
    private BigDecimal firstNumPiecePrice;
    /**
     * 续几件
     */
    private Integer continueNumPiece;
    /**
     * 续几件的价格
     */
    private BigDecimal continueNumPiecePrice;

    private LocalDateTime gmtCreate;
    private LocalDateTime gmtModified;
    private Boolean beDeleted;

}
