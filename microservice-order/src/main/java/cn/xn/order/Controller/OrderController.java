package cn.xn.order.Controller;

import cn.xn.order.pojo.Order;
import cn.xn.order.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by Lemon on 2019/12/13.
 */
@RestController
public class OrderController {

    @Autowired
    private OrderService orderService;

    @GetMapping(value = "order/{orderId}")
    public Order queryOrderId(@PathVariable("orderId") String orderId) {
        return this.orderService.queryOrderById(orderId);
    }

}
