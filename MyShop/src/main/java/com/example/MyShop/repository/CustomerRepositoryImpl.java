package com.example.MyShop.repository;

import com.example.MyShop.dto.Account;
import com.example.MyShop.dto.Bank;
import com.example.MyShop.dto.Customer;

import java.util.HashMap;
import java.util.Map;

public class CustomerRepositoryImpl implements CustomerRepository{

    private static final Map<Customer,Account> store = new HashMap<>();//고객테이블

    @Override
    public void bankJoin(Customer customer, Account account) {
        String accountNumber = "";
        for(int num=0;num<13; num++){
            accountNumber += (long)(Math.random()*10);

        }
        customer.setAccountNumber(accountNumber);
        customer.setBalance(0);
        store.put(customer,account);


    }

    @Override
    public Account selectCustomer(String name) {
        return store.get(name);
    }
}
