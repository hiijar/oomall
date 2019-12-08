package xmu.oomall.controller.vo;

import xmu.oomall.domain.FootPrintItem;

import java.util.List;

public class AdminFootprintsResponseVo {
    /**
     * 查询到的footprintItems列表
     */
    private List<FootPrintItem> footPrintItems;

    @Override
    public String toString() {
        return "AdminFootprintsResponseVo{" +
                "footPrintItems=" + footPrintItems +
                '}';
    }

    public List<FootPrintItem> getFootPrintItems() {
        return footPrintItems;
    }

    public void setFootPrintItems(List<FootPrintItem> footPrintItems) {
        this.footPrintItems = footPrintItems;
    }
}
