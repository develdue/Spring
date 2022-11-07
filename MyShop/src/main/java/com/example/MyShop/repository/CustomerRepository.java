package com.example.MyShop.repository;

import com.example.MyShop.dto.Account;
import com.example.MyShop.dto.Bank;
import com.example.MyShop.dto.Customer;

public interface CustomerRepository {

    void bankJoin(Customer customer, Account account);

    Account selectCustomer(String name);



}
