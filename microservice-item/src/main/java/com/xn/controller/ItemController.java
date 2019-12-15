package com.xn.controller;

import com.xn.pojo.Item;

import com.xn.service.ItemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;


/**
 * Created by Lemon on 2019/12/13.
 */
@RestController
public class ItemController {

    @Autowired
    private ItemService itemService;

    /**
     *
     * @param id
     * @return
     *
     * @RequestMapping(value = "/item/{id}" method = RequestMethod.GET) ==  @GetMapping
     */

    @GetMapping(value = "/item/{id}")
    public Item queryItemById(@PathVariable("id") Long id) {
        return itemService.queryItemById(id);
    }
}
