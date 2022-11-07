package com.example.MyShop.Request;

public interface CustomerRequest {

        int deposit(String password,String name,int money);

        int withdraw(String password,String name,int money);

}
