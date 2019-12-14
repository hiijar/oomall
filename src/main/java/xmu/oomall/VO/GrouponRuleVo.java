package xmu.oomall.discount.controller.vo;

import xmu.oomall.discount.domain.GoodsPo;
import xmu.oomall.discount.domain.GrouponRulePo;

public class GrouponRuleVo {
    private GrouponRulePo grouponRulePo;
    private GoodsPo goodsPo;

    public GrouponRulePo getGrouponRulePo() {
        return grouponRulePo;
    }

    public void setGrouponRulePo(GrouponRulePo grouponRulePo) {
        this.grouponRulePo = grouponRulePo;
    }

    public GoodsPo getGoodsPo() {
        return goodsPo;
    }

    public void setGoodsPo(GoodsPo goodsPo) {
        this.goodsPo = goodsPo;
    }

    @Override
    public String toString() {
        return "GrouponRuleVo{" +
                "grouponRulePo=" + grouponRulePo +
                ", goodsPo=" + goodsPo +
                '}';
    }
}
