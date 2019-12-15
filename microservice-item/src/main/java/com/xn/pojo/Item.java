package com.xn.pojo;

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

    public Item(Long id, String title, String pic, String desc, Long price) {
        this.id = id;
        this.title = title;
        this.pic = pic;
        this.desc = desc;
        this.price = price;
    }
}
