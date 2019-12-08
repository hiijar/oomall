package xmu.good.oomall.domain;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.Objects;
/**
 * @Author: 数据库与对象模型标准组
 * @Description: 默认重量模板
 * @Date: Created in 16:00 2019/11/29
 * @Modified By:
 **/

public class DefaultFreight {
    private Integer id;
    /**
     * 货物运送的目的地（即收货地址）
     */
    private String destination;
    /**
     * 快递重量模板中快递首重0.5kg的价格
     */
    private BigDecimal firstHeavyPrice;
    /**
     * 续重的邮费价格
     */
    private BigDecimal continueHeavyPrice;
    /**
     * 10kg以上每kg的邮费价格（下一区间以下）
     */
    private BigDecimal over10Price;
    /**
     * 50kg以上每kg的邮费价格
     */
    private BigDecimal over50Price;
    /**
     * 100kg以上每kg的邮费价格
     */
    private BigDecimal over100Price;
    /**
     * 300kg以上每kg的邮费价格
     */
    private BigDecimal over300Price;
    /**
     * 快递送到需要的时间（次日 或者 1-2天等 ）
     */
    private String requireDays;
    private LocalDateTime gmtCreate;
    private LocalDateTime gmtModified;
    private Boolean beDeleted;

    @Override
    public String toString() {
        return "DefaultFreight{" +
                "id=" + id +
                ", destination='" + destination + '\'' +
                ", firstHeavyPrice=" + firstHeavyPrice +
                ", continueHeavyPrice=" + continueHeavyPrice +
                ", over10Price=" + over10Price +
                ", over50Price=" + over50Price +
                ", over100Price=" + over100Price +
                ", over300Price=" + over300Price +
                ", requireDays=" + requireDays +
                ", gmtCreate=" + gmtCreate +
                ", gmtModified=" + gmtModified +
                ", beDeleted=" + beDeleted +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {return true;}
        if (o == null || getClass() != o.getClass()) {return false;}
        DefaultFreight that = (DefaultFreight) o;
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

    public String getDestination() {
        return destination;
    }

    public void setDestination(String destination) {
        this.destination = destination;
    }

    public BigDecimal getFirstHeavyPrice() {
        return firstHeavyPrice;
    }

    public void setFirstHeavyPrice(BigDecimal firstHeavyPrice) {
        this.firstHeavyPrice = firstHeavyPrice;
    }

    public BigDecimal getContinueHeavyPrice() {
        return continueHeavyPrice;
    }

    public void setContinueHeavyPrice(BigDecimal continueHeavyPrice) {
        this.continueHeavyPrice = continueHeavyPrice;
    }

    public BigDecimal getOver10Price() {
        return over10Price;
    }

    public void setOver10Price(BigDecimal over10Price) {
        this.over10Price = over10Price;
    }

    public BigDecimal getOver50Price() {
        return over50Price;
    }

    public void setOver50Price(BigDecimal over50Price) {
        this.over50Price = over50Price;
    }

    public BigDecimal getOver100Price() {
        return over100Price;
    }

    public void setOver100Price(BigDecimal over100Price) {
        this.over100Price = over100Price;
    }

    public BigDecimal getOver300Price() {
        return over300Price;
    }

    public void setOver300Price(BigDecimal over300Price) {
        this.over300Price = over300Price;
    }

    public String getRequireDays() {
        return requireDays;
    }

    public void setRequireDays(String requireDays) {
        this.requireDays = requireDays;
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
