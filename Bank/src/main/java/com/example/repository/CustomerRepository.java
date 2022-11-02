package com.example.repository;

import com.example.dto.Customer;

public interface CustomerRepository {

    void customerJoin(Customer customer);

    Customer selectCustomer(String name);

}
