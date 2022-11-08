package com.example.MyShop.service;

import com.example.MyShop.dto.Account;
import com.example.MyShop.dto.Customer;
import com.example.MyShop.repository.AccountRepository;
import com.example.MyShop.repository.AccountRepositoryImpl;
import com.example.MyShop.repository.CustomerRepository;
import com.example.MyShop.repository.CustomerRepositoryImpl;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CustomerRequestImplTest {

    CustomerRepository customerRepository = new CustomerRepositoryImpl(new AccountRepositoryImpl());//회원가입에 필요한 객체가 필요하기에 객체 생성
    AccountRepository accountRepository = new AccountRepositoryImpl();
    CustomerRequest customerRequest=new CustomerRequestImpl();


    @Test
    void deposit() {
        Customer customer = new Customer(5464L,"서재연","94121956465465","탄현", "서재연");
        Account account = new Account(5464L,5464L,"sadsasad", "탄현", "46546545", 564654);
        customerRepository.customerJoin(customer);
        accountRepository.accountJoin(account);


        customerRequest.deposit(5464L,10);
        System.out.println(account);
    }

    @Test
    void withdraw() {
        Customer customer = new Customer(5464L,"서재연","94121956465465","탄현", "서재연");
        Account account = new Account(5464L,5464L,"sadsasad", "탄현", "46546545", 564654);
        customerRepository.customerJoin(customer);
        accountRepository.accountJoin(account);


        customerRequest.withdraw(5464L,10);
        System.out.println(account);
    }
}