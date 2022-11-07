package com.example.MyShop.repository;

import com.example.MyShop.dto.Customer;

public interface CustomerRepository {

    void customerJoin(Customer customer);

    Customer selectCustomer(Long id);



}
