package com.oomall.oomall.domain;

import java.util.Objects;

public class Region {

    private Integer id;
    /**
     * 父亲的id
     */
    private Integer pid;
    /**
     * 名字
     */
    private String name;
    /**
     * 类型
     */
    private Short type;
    /**
     * 邮政编码
     */
    private String postalCode;

    @Override
    public String toString() {
        return "Region{" +
                "id=" + id +
                ", pid=" + pid +
                ", name='" + name + '\'' +
                ", type=" + type +
                ", postalCode='" + postalCode + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {return true;}
        if (o == null || getClass() != o.getClass()) {return false;}
        Region region = (Region) o;
        return Objects.equals(id, region.id);
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

    public Integer getPid() {
        return pid;
    }

    public void setPid(Integer pid) {
        this.pid = pid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Short getType() {
        return type;
    }

    public void setType(Short type) {
        this.type = type;
    }

    public String getPostalCode() {
        return postalCode;
    }

    public void setPostalCode(String postalCode) {
        this.postalCode = postalCode;
    }
}
