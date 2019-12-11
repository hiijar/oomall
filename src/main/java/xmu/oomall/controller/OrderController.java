package ooad33.order.controller;


import ooad33.order.domain.vo.GetOrdersVo;
import ooad33.order.domain.vo.OrderSubmitVo;
import org.springframework.web.bind.annotation.*;

/**
 * @Author lsz
 * @create 2019/12/10 22:10
 */
@RequestMapping("/OrderService")
@RestController
public interface OrderController {

    /**
     *
     * @param
     * @return  List<GetOrdersVo>
     */
    @GetMapping("/orders")
    public Object getOrders(@RequestParam Integer userId, @RequestParam Integer page, @RequestParam Integer limit);

    /**
     *
     * @param orderSubmitVo
     * @return  OrdersubmitVo
     */
    @PostMapping("/orders")
    Object submitOrders(OrderSubmitVo orderSubmitVo);

    /**
     * @return  返回getOrdersVo
     */
    @GetMapping("/orders/{id}")
    Object getOrderDetail(@PathVariable Integer id);


    /**
     *
     * @param id
     * @return  Order
     */
    @PutMapping("/orders/{id}/cancel")
    Object cancelOrder(@PathVariable Integer id);

    /**
     *
     * @param id
     * @return  无（ResponseUtil.ok()即可）
     */
    @DeleteMapping("/orders/{id}")
    Object deleteOrder(@PathVariable Integer id);

    /**
     *
     * @param id
     * @return  Order
     */
    @PostMapping("/orders/{id}/confirm")
    Object confirmOrder(@PathVariable Integer id);

    /**
     *
     * @param id
     * @return  Order
     */
    @PostMapping("/orders/{id}/refund")
    Object refundOrder(@PathVariable Integer id);

    /**
     *
     * @param getOrdersVo
     * @return  List<GetOrdersVo>
     */
    @GetMapping("/orders/unevaluted")
    Object orderUnevaluted(@RequestBody GetOrdersVo getOrdersVo);

    /**
     *
     * @param userId
     * @return  List<GetOrdersVo>
     */
    @GetMapping("/admin/orders")
    Object adminGetOrders( @RequestParam Integer userId);

    /**
     *
     * @param id
     * @return  GetOrdersVo
     */
    @GetMapping("/orders/{id}")
    Object getOrders(@PathVariable Integer id);

    /**
     *管理员处理退款
     * @param id
     * @return  Order
     */
    @PostMapping("/admin/orders/{id}/refund")
    Object adminHandleRefund(@PathVariable Integer id);

    /**
     *
     * @param id
     * @return  Order
     */
    @PostMapping("/orders/{id}/ship")
    Object orderShip(Integer id);



}
