package xmu.oomall.controller.vo;
import org.graalvm.compiler.nodes.memory.address.AddressNode;
import org.junit.jupiter.api.Order;
import xmu.oomall.domain.*;
import java.util.List;

public class GetOrdersVo {

    /**
     * 获得订单
     */
    private Order order;

    /**
     * 获得订单明细
     */
    private List<OrderItemVo> orderItemVo;

    /**
     * 用户地址
     */
    private Address address;

    public Order getOrder() {
        return order;
    }

    public void setOrder(Order order) {
        this.order = order;
    }

    public List<OrderItemVo> getOrderItemVo() {
        return orderItemVo;
    }

    public void setOrderItemVo(List<OrderItemVo> orderItemVo) {
        this.orderItemVo = orderItemVo;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }
}
