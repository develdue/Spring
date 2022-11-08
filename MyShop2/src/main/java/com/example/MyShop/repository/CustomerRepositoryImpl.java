package com.example.MyShop.repository;

import com.example.MyShop.dto.Customer;
import java.util.HashMap;
import java.util.Map;

public class CustomerRepositoryImpl implements CustomerRepository{

    private static final Map<Long, Customer> store = new HashMap<>();//고객테이블

    @Override
    public void customerJoin(Customer customer) {
        store.put(customer.getId(),customer);
    }

    @Override
    public Customer selectCustomer(Long id) {
        return store.get(id);
    }

    @Override
    public Customer deleteCustomer(Long id) {
        store.remove(id);
        return store.get(id);
    }

    @Override
    public Customer updateCustomer(Customer customer) {
        store.replace(customer.getId(), customer);
        return store.get(customer.getId());
    }
}
