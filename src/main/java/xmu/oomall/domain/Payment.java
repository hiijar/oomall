package xmu.good.oomall.domain;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.Objects;

/**
 * @Author: 数据库与对象模型标准组
 * @Description: 付款记录
 * @Date: Created in 16:00 2019/11/29
 * @Modified By:
 **/
public class Payment {
    private Integer id;
    /**
     * 付款金额
     */
    private BigDecimal actualPrice;
    /**
     * 付款渠道，微信，银行等等
     */
    private Integer payChannel;
    /**
     * 是否付款成功,0不成功，1成功
     */
    private Boolean beSuccessful;
    /**
     * 付款时间
     */
    private LocalDateTime payTime;
    /**
     * 付款编号，从支付渠道获得的
     */
    private String paySn;
    /**
     * 付款的开始时间 （在开始时间和结束时间之间才可以付款）
     */
    private LocalDateTime beginTime;
    /**
     * 付款的结束时间
     */
    private LocalDateTime endTime;
    /**
     * 订单Id
     */
    private Integer orderId;
    private LocalDateTime gmtCreate;
    private LocalDateTime gmtModified;
    private Boolean beDeleted;

    @Override
    public String toString() {
        return "Payment{" +
                "id=" + id +
                ", actualPrice=" + actualPrice +
                ", payChannel=" + payChannel +
                ", beSuccessful=" + beSuccessful +
                ", payTime=" + payTime +
                ", paySn='" + paySn + '\'' +
                ", beginTime=" + beginTime +
                ", endTime=" + endTime +
                ", orderId=" + orderId +
                ", gmtCreate=" + gmtCreate +
                ", gmtModified=" + gmtModified +
                ", beDeleted=" + beDeleted +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {return true;}
        if (o == null || getClass() != o.getClass()) {return false;}
        Payment payment = (Payment) o;
        return Objects.equals(id, payment.id);
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

    public BigDecimal getActualPrice() {
        return actualPrice;
    }

    public void setActualPrice(BigDecimal actualPrice) {
        this.actualPrice = actualPrice;
    }

    public Integer getPayChannel() {
        return payChannel;
    }

    public void setPayChannel(Integer payChannel) {
        this.payChannel = payChannel;
    }

    public Boolean getBeSuccessful() {
        return beSuccessful;
    }

    public void setBeSuccessful(Boolean beSuccessful) {
        this.beSuccessful = beSuccessful;
    }

    public LocalDateTime getPayTime() {
        return payTime;
    }

    public void setPayTime(LocalDateTime payTime) {
        this.payTime = payTime;
    }

    public String getPaySn() {
        return paySn;
    }

    public void setPaySn(String paySn) {
        this.paySn = paySn;
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

    public Integer getOrderId() {
        return orderId;
    }

    public void setOrderId(Integer orderId) {
        this.orderId = orderId;
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
