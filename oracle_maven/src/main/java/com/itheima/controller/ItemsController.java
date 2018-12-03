package com.itheima.controller;

import com.itheima.domain.Items;
import com.itheima.service.IItemsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/items")
public class ItemsController {
    @Autowired
    private IItemsService itemsService;


    @RequestMapping("/findDetail")
    public String findDetail(Model model){
        System.out.println(1111);
        Items items = itemsService.findById(1);

        model.addAttribute("item",items);

        return "itemDetail";
    }
}
