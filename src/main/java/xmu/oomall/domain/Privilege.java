package xmu.good.oomall.domain;

import java.time.LocalDateTime;
import java.util.Objects;
/**
 * @Author: 数据库与对象模型标准组
 * @Description: 角色权限表
 * @Data:Created in 14:50 2019/11/29
 * @Modified By:
 **/

public class Privilege {
    private Integer id;
    /**
     * 角色id
     */
    private Integer roleId;
    /**
     * 名字
     */
    private String name;
    /**
     * 角色描述
     */
    private String description;

    private LocalDateTime gmtCreate;
    private LocalDateTime gmtModified;
    private Boolean beDeleted;

    @Override
    public String toString() {
        return "Privilege{" +
                "id=" + id +
                ", roleId=" + roleId +
                ", name='" + name + '\'' +
                ", description='" + description + '\'' +
                ", gmtCreate=" + gmtCreate +
                ", gmtModified=" + gmtModified +
                ", beDeleted=" + beDeleted +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {return true;}
        if (o == null || getClass() != o.getClass()) {return false;}
        Privilege privilege = (Privilege) o;
        return Objects.equals(id, privilege.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getRoleId() {
        return roleId;
    }

    public void setRoleId(Integer roleId) {
        this.roleId = roleId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public LocalDateTime getGmtCreate() {
        return gmtCreate;
    }

    public void setGmtCreate(LocalDateTime gmtCreate) {
        this.gmtCreate = gmtCreate;
    }

    public LocalDateTime getGmtModified() {
        return gmtModified;
    }

    public void setGmtModified(LocalDateTime gmtModified) {
        this.gmtModified = gmtModified;
    }

    public Boolean getBeDeleted() {
        return beDeleted;
    }

    public void setBeDeleted(Boolean beDeleted) {
        this.beDeleted = beDeleted;
    }
}
