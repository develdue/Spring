package com.example.MyShop;

import com.example.MyShop.dto.Customer;
import com.example.MyShop.repository.AccountRepositoryImpl;
import com.example.MyShop.repository.CustomerRepository;
import com.example.MyShop.repository.CustomerRepositoryImpl;

public class AppConfiguration {

    CustomerRepositoryImpl customerDependencyIn(){
        return new CustomerRepositoryImpl(accountRepositoryDependencyIn());
    }

    AccountRepositoryImpl accountRepositoryDependencyIn(){
        return new AccountRepositoryImpl();
    }

}
