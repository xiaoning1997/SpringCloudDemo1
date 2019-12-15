package cn.xn.order.pojo;

import lombok.Data;

/**
 * Created by Lemon on 2019/12/13.
 */
@Data
public class OrderDetail {

    private String orderId;
    private Item item = new Item();

    public OrderDetail(){

    }

    public OrderDetail(String orderId, Item item) {
        this.orderId = orderId;
        this.item = item;
    }
}
