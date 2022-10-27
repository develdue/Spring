package com.example.demo.item;

public class Item {
    Long id;
    int price;

    Item(Long id , int price) {
        this.id = id;
        this.price = price;
    }

    public Long getId() {
        return id;
    }

    public int getPrice() {
        return price;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setPrice(int price) {
        this.price = price;
    }
}
