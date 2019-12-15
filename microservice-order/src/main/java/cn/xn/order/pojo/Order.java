package cn.xn.order.pojo;

import lombok.Data;

import java.util.Date;
import java.util.List;

/**
 * Created by Lemon on 2019/12/13.
 */
@Data
public class Order {

    private String orderId;
    private Long userId;
    private Date createDate;
    private Date updateDate;
    private List<OrderDetail> orderDetails;

    public Order(){

    }


}
