package com.example.demo.itemservice;

import com.example.demo.item.Item;

public interface ItemService {
    Item findItem(Long id);

    void setItem(Item item);
}
