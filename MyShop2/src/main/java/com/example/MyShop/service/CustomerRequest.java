package com.example.MyShop.service;

public interface CustomerRequest {

        int deposit(Long id,int money);

        int withdraw(Long id,int money);

}
