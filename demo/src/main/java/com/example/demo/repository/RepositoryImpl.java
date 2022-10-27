package com.example.demo.repository;

import com.example.demo.item.Item;

import java.util.HashMap;
import java.util.Map;

public class RepositoryImpl implements Repository {
    private static Map<Long, Item> store = new HashMap<>();

    public void save(Item item) {
        store.put(item.getId() , item);
    }

    public Item findById(Long id) {
        return store.get(id);
    }
}
