package xmu.oomall.domain;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.math.BigDecimal;
import java.util.List;

/**
 * @Author: 数据库与对象模型标准组
 * @Description:团购规则对象
 * @Data:Created in 14:50 2019/12/11
 **/
@Getter
@Setter
@ToString
@EqualsAndHashCode(callSuper = true)
public class GrouponRule extends GrouponRulePo {
    @Getter
    @Setter
    private class Strategy{
        private Integer lowerBound;
        private Integer upperBound;
        private BigDecimal discountRate;
    }
    private List<Strategy> strategyList;
}
