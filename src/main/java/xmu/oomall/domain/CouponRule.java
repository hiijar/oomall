package com.oomall.oomall.domain;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.Objects;

/**
 * @Author: 数据库与对象模型标准组
 * @Description:优惠券规则信息
 * @Data:Created in 14:50 2019/11/29
 * @Modified By:
 **/

public class CouponRule {
    private Integer id;
    /**
     * 优惠券规则名称
     */
    private Integer name;
    /**
     * 优惠券简介
     */
    private String brief;
    /**
     * 优惠券规则的生效日期
     */
    private LocalDateTime beginTime;
    /**
     * 优惠券规则的失效日期
     */
    private LocalDateTime endTime;
    /**
     * 优惠券规则的图片
     */
    private String pciUrl;
    /**
     * 优惠券规则的有效期(即有效的天数)
     */
    private Integer validPeriod;
    /**
     * 折扣金额（满减金额）
     */
    private BigDecimal discount;
    /**
     * 优惠规则生效需达到的满减上限
     */
    private BigDecimal limit;
    /**
     * 该优惠券规则下优惠券的总张数
     */
    private Integer total;
    /**
     * 存放适用于本优惠券规则的所有商品ID
     */
    private String goodsList1;
    /**
     * 存放适用于本优惠券规则的所有商品ID(商品可能很多，可能需要多个list存放)
     */
    private String goodsList2;
    private LocalDateTime gmtCreate;
    private LocalDateTime gmtModified;
    private Boolean beDelete;


    @Override
    public boolean equals(Object o) {
        if (this == o) {return true;}
        if (o == null || getClass() != o.getClass()) {return false;}
        CouponRule that = (CouponRule) o;
        return Objects.equals(id, that.id);
    }

    @java.lang.Override
    public java.lang.String toString() {
        return "CouponRule{" +
                "id=" + id +
                ", name=" + name +
                ", name='" + name + '\'' +
                ", beginTime=" + beginTime +
                ", endTime=" + endTime +
                ", pciUrl='" + pciUrl + '\'' +
                ", validPeriod=" + validPeriod +
                ", discount=" + discount +
                ", limit=" + limit +
                ", total=" + total +
                ", goodsList1='" + goodsList1 + '\'' +
                ", goodsList2='" + goodsList2 + '\'' +
                ", gmtCreate=" + gmtCreate +
                ", gmtModified=" + gmtModified +
                ", beDelete=" + beDelete +
                '}';
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

    public Integer getName() {
        return name;
    }

    public String getBrief() {
        return brief;
    }

    public void setBrief(String brief) {
        this.brief = brief;
    }

    public LocalDateTime getBeginTime() {
        return beginTime;
    }

    public void setBeginTime(LocalDateTime beginTime) {
        this.beginTime = beginTime;
    }

    public LocalDateTime getEndTime() {
        return endTime;
    }

    public void setEndTime(LocalDateTime endTime) {
        this.endTime = endTime;
    }

    public String getPciUrl() {
        return pciUrl;
    }

    public void setPciUrl(String pciUrl) {
        this.pciUrl = pciUrl;
    }

    public Integer getValidPeriod() {
        return validPeriod;
    }

    public void setValidPeriod(Integer validPeriod) {
        this.validPeriod = validPeriod;
    }

    public BigDecimal getDiscount() {
        return discount;
    }

    public void setDiscount(BigDecimal discount) {
        this.discount = discount;
    }

    public BigDecimal getLimit() {
        return limit;
    }

    public void setLimit(BigDecimal limit) {
        this.limit = limit;
    }

    public Integer getTotal() {
        return total;
    }

    public void setTotal(Integer total) {
        this.total = total;
    }

    public String getGoodsList1() {
        return goodsList1;
    }

    public void setGoodsList1(String goodsList1) {
        this.goodsList1 = goodsList1;
    }

    public String getGoodsList2() {
        return goodsList2;
    }

    public void setGoodsList2(String goodsList2) {
        this.goodsList2 = goodsList2;
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

    public void setName(Integer name) {
        this.name = name;
    }
}
