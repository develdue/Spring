package com.example.repository;

import com.example.dto.Customer;

import java.util.HashMap;
import java.util.Map;

public class CustomerRepositoryImpl implements CustomerRepository {


    private static final Map<String, Customer> store = new HashMap<>();

    @Override
    public void customerJoin(Customer customer) {
        store.put(customer.getName(),customer);

    }

    @Override
    public Customer selectCustomer(String name) {
        return store.get(name);
    }




}
