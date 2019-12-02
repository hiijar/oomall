package com.oomall.oomall.domain;

import javax.annotation.sql.DataSourceDefinition;
import java.time.LocalDateTime;
import java.util.Objects;

/**
 * @Author: 数据库与对象模型标准组
 * @Description:商品种类的信息
 * @Data:Created in 14:50 2019/11/29
 * @Modified By:
 **/

public class GoodsCategory {
    private Integer id;
    /**
     * 种类的名称
     */
    private String name;
    /**|
     * 该种类的父种类ID
     */
    private Integer pid;
    private LocalDateTime gmtCreate;
    private LocalDateTime gmtModified;
    private Boolean beDelete;

    @java.lang.Override
    public java.lang.String toString() {
        return "GoodsCategory{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", pid=" + pid +
                ", gmtCreate=" + gmtCreate +
                ", gmtModified=" + gmtModified +
                ", beDelete=" + beDelete +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {return true;}
        if (o == null || getClass() != o.getClass()) {return false;}
        GoodsCategory that = (GoodsCategory) o;
        return Objects.equals(id, that.id);
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

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getPid() {
        return pid;
    }

    public void setPid(Integer pid) {
        this.pid = pid;
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

    public Boolean getBeDelete() {
        return beDelete;
    }

    public void setBeDelete(Boolean beDelete) {
        this.beDelete = beDelete;
    }
}
