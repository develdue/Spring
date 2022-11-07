package com.example.MyShop.Request;

import com.example.MyShop.dto.Customer;
import com.example.MyShop.repository.CustomerRepository;
import com.example.MyShop.repository.CustomerRepositoryImpl;

public class CustomerRequestImpl implements CustomerRequest{

    CustomerRepository customerrepository = new CustomerRepositoryImpl();

    @Override
    public int deposit(String password,String name,int money) {
        Customer customer = customerrepository.selectCustomer(name);
        int balance =customer.getBalance()+money;
        return balance;
    }

    @Override
    public int withdraw(String password,String name,int money) {
        Customer customer = customerrepository.selectCustomer(name);
        int balance =customer.getBalance()-money;
        return balance;
    }

}
