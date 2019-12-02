package com.oomall.oomall.domain;

import java.time.LocalDateTime;
import java.util.Objects;

/**
 * @Author: 数据库与对象模型标准组
 * @Description: 订单明细
 * @Date: Created in 14:50 2019/11/29
 * @Modified By:
 **/
public class AftersalesService {
    private Integer id;
    /**
     *商品类型，1普通商品，2预售商品，3团购商品，4分享商品
     */
    private Short goodsType;
    /**
     * 申请售后时间
     */
    private LocalDateTime applyTime;
    /**
     * 申请售后理由
     */
    private String applyReason;
    /**
     *售后完成时间
     */
    private LocalDateTime endTime;
    /**
     * 售后类型，0退货，1换货
     */
    private Boolean type;
    /**
     * 该申请是否被接受，0代表否，1代表是
     */
    private Boolean beApplied;
    /**
     * 申请服务的产品数量，如退货的件数
     */
    private Integer number;
    /**
     * 订单明细ID
     */
    private Integer orderItemId;
    private LocalDateTime gmtCreate;
    private LocalDateTime gmtModified;
    private Boolean beDelete;

    @Override
    public String toString() {
        return "AftersalesService{" +
                "id=" + id +
                ", goodsType=" + goodsType +
                ", applyTime=" + applyTime +
                ", applyReason='" + applyReason + '\'' +
                ", endTime=" + endTime +
                ", type=" + type +
                ", beApplied=" + beApplied +
                ", number=" + number +
                ", orderItemId=" + orderItemId +
                ", gmtCreate=" + gmtCreate +
                ", gmtModified=" + gmtModified +
                ", beDelete=" + beDelete +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {return true;}
        if (o == null || getClass() != o.getClass()) {return false;}
        AftersalesService that = (AftersalesService) o;
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

    public Short getGoodsType() {
        return goodsType;
    }

    public void setGoodsType(Short goodsType) {
        this.goodsType = goodsType;
    }

    public LocalDateTime getApplyTime() {
        return applyTime;
    }

    public void setApplyTime(LocalDateTime applyTime) {
        this.applyTime = applyTime;
    }

    public String getApplyReason() {
        return applyReason;
    }

    public void setApplyReason(String applyReason) {
        this.applyReason = applyReason;
    }

    public LocalDateTime getEndTime() {
        return endTime;
    }

    public void setEndTime(LocalDateTime endTime) {
        this.endTime = endTime;
    }

    public Boolean getType() {
        return type;
    }

    public void setType(Boolean type) {
        this.type = type;
    }

    public Boolean getBeApplied() {
        return beApplied;
    }

    public void setBeApplied(Boolean beApplied) {
        this.beApplied = beApplied;
    }

    public Integer getNumber() {
        return number;
    }

    public void setNumber(Integer number) {
        this.number = number;
    }

    public Integer getOrderItemId() {
        return orderItemId;
    }

    public void setOrderItemId(Integer orderItemId) {
        this.orderItemId = orderItemId;
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
