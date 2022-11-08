package com.example.MyShop.service;

public interface CustomerRequest {

        void deposit(Long id,int money);

        void withdraw(Long id,int money);

}
