package xmu.good.oomall.domain;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.Objects;

/**
 * @Author: 数据库与对象模型标准组
 * @Description: 订单明细
 * @Date: Created in 15:19 2019/11/29
 * @Modified By:
 **/
public class Order {
    private Integer id;
    /**
     * 下单用户
     */
    private Integer userId;
    /**
     * 该订单对于与be_shared_item表id
     */
    private String beSharedItemIds;
    /**
     * 订单序号
     */
    private String orderSn;
    /**
     * 订单状态，1未付款，2未发货，3未收获，4未评价，5已完成订单，6退货订单，7换货订单
     */
    private Integer statusCode;
    /**
     * 收件人姓名
     */
    private String consignee;
    /**
     * 联系电话
     */
    private String mobile;
    /**
     * 留言
     */
    private String message;
    /**
     * 订单费用
     */
    private BigDecimal goodsPrice;
    /**
     * 优惠卷减免费用
     */
    private BigDecimal couponPrice;
    /**
     * 返点减免费用
     */
    private BigDecimal rebatePrice;
    /**
     * 配送费用
     */
    private BigDecimal freightPrice;
    /**
     * 积分费用
     */
    private BigDecimal integralPrice;
    /**
     * 快递单编号
     */
    private String shipSn;
    /**
     * 发货快递公司
     */
    private Integer shipChannel;
    /**
     * 发货时间
     */
    private LocalDateTime shipTime;
    /**
     * 用户收货确认时间
     */
    private LocalDateTime confirmTime;
    /**
     * 订单关闭时间
     */
    private LocalDateTime endTime;
    /**
     * 订单支付时间
     */
    private LocalDateTime payTime;
    /**
     * 父订单Id
     */
    private Integer parentId;
    /**
     * 收货地址
     */
    private String address;
    private LocalDateTime gmtCreate;
    private LocalDateTime gmtModified;
    private Boolean beDeleted;

    @Override
    public String toString() {
        return "Order{" +
                "id=" + id +
                ", userId=" + userId +
                ", beSharedItemIds=" + beSharedItemIds +
                ", orderSn='" + orderSn + '\'' +
                ", statusCode=" + statusCode +
                ", consignee='" + consignee + '\'' +
                ", mobile='" + mobile + '\'' +
                ", message='" + message + '\'' +
                ", goodsPrice=" + goodsPrice +
                ", couponPrice=" + couponPrice +
                ", rebatePrice=" + rebatePrice +
                ", freightPrice=" + freightPrice +
                ", integralPrice=" + integralPrice +
                ", shipSn='" + shipSn + '\'' +
                ", shipChannel=" + shipChannel +
                ", shipTime=" + shipTime +
                ", confirmTime=" + confirmTime +
                ", endTime=" + endTime +
                ", payTime=" + payTime +
                ", parentId=" + parentId +
                ", address='" + address + '\'' +
                ", gmtCreate=" + gmtCreate +
                ", gmtModified=" + gmtModified +
                ", beDeleted=" + beDeleted +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {return true;}
        if (o == null || getClass() != o.getClass()) {return false;}
        Order order = (Order) o;
        return Objects.equals(id, order.id);
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

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public String getBeSharedItemIds() {
        return beSharedItemIds;
    }

    public void setBeSharedItemIds(String beSharedItemIds) {
        this.beSharedItemIds = beSharedItemIds;
    }

    public String getOrderSn() {
        return orderSn;
    }

    public void setOrderSn(String orderSn) {
        this.orderSn = orderSn;
    }

    public Integer getStatusCode() {
        return statusCode;
    }

    public void setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
    }

    public String getConsignee() {
        return consignee;
    }

    public void setConsignee(String consignee) {
        this.consignee = consignee;
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public BigDecimal getGoodsPrice() {
        return goodsPrice;
    }

    public void setGoodsPrice(BigDecimal goodsPrice) {
        this.goodsPrice = goodsPrice;
    }

    public BigDecimal getCouponPrice() {
        return couponPrice;
    }

    public void setCouponPrice(BigDecimal couponPrice) {
        this.couponPrice = couponPrice;
    }

    public BigDecimal getRebatePrice() {
        return rebatePrice;
    }

    public void setRebatePrice(BigDecimal rebatePrice) {
        this.rebatePrice = rebatePrice;
    }

    public BigDecimal getFreightPrice() {
        return freightPrice;
    }

    public void setFreightPrice(BigDecimal freightPrice) {
        this.freightPrice = freightPrice;
    }

    public BigDecimal getIntegralPrice() {
        return integralPrice;
    }

    public void setIntegralPrice(BigDecimal integralPrice) {
        this.integralPrice = integralPrice;
    }

    public String getShipSn() {
        return shipSn;
    }

    public void setShipSn(String shipSn) {
        this.shipSn = shipSn;
    }

    public Integer getShipChannel() {
        return shipChannel;
    }

    public void setShipChannel(Integer shipChannel) {
        this.shipChannel = shipChannel;
    }

    public LocalDateTime getShipTime() {
        return shipTime;
    }

    public void setShipTime(LocalDateTime shipTime) {
        this.shipTime = shipTime;
    }

    public LocalDateTime getConfirmTime() {
        return confirmTime;
    }

    public void setConfirmTime(LocalDateTime confirmTime) {
        this.confirmTime = confirmTime;
    }

    public LocalDateTime getEndTime() {
        return endTime;
    }

    public void setEndTime(LocalDateTime endTime) {
        this.endTime = endTime;
    }

    public LocalDateTime getPayTime() {
        return payTime;
    }

    public void setPayTime(LocalDateTime payTime) {
        this.payTime = payTime;
    }

    public Integer getParentId() {
        return parentId;
    }

    public void setParentId(Integer parentId) {
        this.parentId = parentId;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
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
