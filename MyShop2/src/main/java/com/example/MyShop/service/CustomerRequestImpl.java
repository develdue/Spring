package com.example.MyShop.service;

import com.example.MyShop.dto.Account;
import com.example.MyShop.dto.Customer;
import com.example.MyShop.repository.AccountRepository;
import com.example.MyShop.repository.AccountRepositoryImpl;
import com.example.MyShop.repository.CustomerRepository;
import com.example.MyShop.repository.CustomerRepositoryImpl;

public class CustomerRequestImpl implements CustomerRequest{

    CustomerRepository customerrepository = new CustomerRepositoryImpl();
    AccountRepository accountRepository = new AccountRepositoryImpl();

    @Override
    public int deposit(Long id,int money) {//입금
        Customer customer = customerrepository.selectCustomer(id);
        Account account = accountRepository.selectAccount(customer.getId());
        int balance = account.getBalance()+money;
        return balance;
    }

    @Override
    public int withdraw(Long id,int money) {//출금
        Customer customer = customerrepository.selectCustomer(id);
        Account account = accountRepository.selectAccount(customer.getId());
        int balance = account.getBalance()-money;
        return balance;
    }

}
