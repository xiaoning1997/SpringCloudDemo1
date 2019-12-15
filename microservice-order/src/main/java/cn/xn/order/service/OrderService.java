package cn.xn.order.service;

import cn.xn.order.pojo.Item;
import cn.xn.order.pojo.Order;
import cn.xn.order.pojo.OrderDetail;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.*;

/**
 * Created by Lemon on 2019/12/13.
 */
@Service
public class OrderService {

    private static final Map<String, Order> MAP = new HashMap();

    static {
        Order order = new Order();
        order.setOrderId("591900104210");
        order.setCreateDate(new Date());
        order.setUpdateDate(order.getCreateDate());
        order.setUserId(1L);
        List<OrderDetail> orderDetails = new ArrayList<>();

        Item item = new Item();//此处并没有商品数据，需要调用商品微服务获取
        item.setId(1L);
        orderDetails.add(new OrderDetail(order.getOrderId(), item));

        item = new Item();// 构建第二个商品
        item.setId(2L);
        orderDetails.add(new OrderDetail(order.getOrderId(), item));

        order.setOrderDetails(orderDetails);

        MAP.put(order.getOrderId(), order);
    }

    @Autowired
    private ItemService itemService;

    public Order queryOrderById(String orderId) {
        Order order = MAP.get(orderId);
        if(null == order)
            return null;
        List<OrderDetail> orderDetails = order.getOrderDetails();
        for (OrderDetail orderDetail : orderDetails) {
            //通过商品微服务 查询数据
            Item item = this.itemService.queryItemById(orderDetail.getItem().getId());
            if(null == item)
                continue;
            orderDetail.setItem(item);
        }
        return order;
    }
}
