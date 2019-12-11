package xmu.oomall.controller.vo;
import xmu.oomall.domain.*;

import java.util.List;

public class OrderItemVo {
    /**
     * 订单项信息
     */
    OrderItem orderItem;
    /**
     * 商品规格信息
     */
    ProductVo productVo;

    public OrderItem getOrderItem() {
        return orderItem;
    }

    public void setOrderItem(OrderItem orderItem) {
        this.orderItem = orderItem;
    }

    public ProductVo getProductVo() {
        return productVo;
    }

    public void setProductVo(ProductVo productVo) {
        this.productVo = productVo;
    }
}
