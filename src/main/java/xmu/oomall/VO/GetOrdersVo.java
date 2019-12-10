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
    private List<OrderItem> orderItems;

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

    public List<OrderItem> getOrderItems() {
        return orderItems;
    }

    public void setOrderItems(List<OrderItem> orderItems) {
        this.orderItems = orderItems;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }
}
