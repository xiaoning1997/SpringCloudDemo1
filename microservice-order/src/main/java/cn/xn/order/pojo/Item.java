package cn.xn.order.pojo;

import lombok.Data;

/**
 * Created by Lemon on 2019/12/13.
 */
@Data
public class Item {

    private Long id;
    private String title;
    private String pic;
    private String desc;
    private Long price;

    public Item() {

    }

}
