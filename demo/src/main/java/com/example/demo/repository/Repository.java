package com.example.demo.repository;

import com.example.demo.item.Item;

public interface Repository {
    void save(Item item);

    Item findById(Long id);
}
