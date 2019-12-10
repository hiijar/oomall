package xmu.oomall.controller.vo;

import xmu.oomall.domain.Role;

import java.util.List;

public class AdminRolesResponseVo {
    /**
     * 查询到的roles列表
     */
    private List<Role> roles;

    @Override
    public String toString() {
        return "AdminFootprintsResponseVo{" +
                "roles=" + roles +
                '}';
    }

    public List<Role> getFootPrintItems() {
        return roles;
    }

    public void setFootPrintItems(List<Role> roles) {
        this.roles = roles;
    }
}
