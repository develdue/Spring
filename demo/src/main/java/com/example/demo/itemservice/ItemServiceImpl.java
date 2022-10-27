package com.example.demo.itemservice;

import com.example.demo.item.Item;
import com.example.demo.repository.Repository;
import com.example.demo.repository.RepositoryImpl;

public class ItemServiceImpl {
    private final Repository repository ;

    public ItemServiceImpl(Repository repository) {
        this.repository = repository;
    }



    public Item findItem(Long id) {
        return repository.findById(id);
    }

    public void setItem(Item item) {
        repository.save(item);
    }
}
