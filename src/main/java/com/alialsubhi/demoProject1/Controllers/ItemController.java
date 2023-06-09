package com.alialsubhi.demoProject1.Controllers;

import com.alialsubhi.demoProject1.Models.Item;
import com.alialsubhi.demoProject1.Services.ItemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "Item")
public class ItemController {

    @Autowired
    ItemService itemService;

    public ItemController(ItemService itemService) {
        this.itemService = itemService;
    }

    @RequestMapping(value = "getAll", method = RequestMethod.GET)
    public List<Item> getAllItems() {
        return itemService.getAllItems();
    }


    @GetMapping(value = "getById")
    public Item getItemById(@RequestParam long id) {
        return itemService.getItemById(id);
    }
}
