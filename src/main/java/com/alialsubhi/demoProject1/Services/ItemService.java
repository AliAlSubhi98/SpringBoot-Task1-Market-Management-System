package com.alialsubhi.demoProject1.Services;

import com.alialsubhi.demoProject1.Models.Item;
import com.alialsubhi.demoProject1.Repositories.ItemRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ItemService {

    @Autowired
    ItemRepository itemRepository;

    public List<Item> getAllItems() {
        return itemRepository.findAll();
    }
}
