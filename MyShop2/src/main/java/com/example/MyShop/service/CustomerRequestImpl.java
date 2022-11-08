package com.example.MyShop.service;

import com.example.MyShop.dto.Account;
import com.example.MyShop.dto.Customer;
import com.example.MyShop.repository.AccountRepository;
import com.example.MyShop.repository.AccountRepositoryImpl;
import com.example.MyShop.repository.CustomerRepository;
import com.example.MyShop.repository.CustomerRepositoryImpl;
import lombok.extern.slf4j.Slf4j;

public class CustomerRequestImpl implements CustomerRequest{

    CustomerRepository customerrepository = new CustomerRepositoryImpl();
    AccountRepository accountRepository = new AccountRepositoryImpl();

    @Override
    public void deposit(Long id,int money) {//입금
        Customer customer = customerrepository.selectCustomer(id);
        Account account = accountRepository.selectAccount(customer.getId());
        int balance = account.getBalance()+money;
        account.setBalance(balance);
    }

    @Override
    public void withdraw(Long id,int money) {//출금
        Customer customer = customerrepository.selectCustomer(id);
        Account account = accountRepository.selectAccount(customer.getId());
        int balance = account.getBalance()-money;
        account.setBalance(balance);
    }

}
