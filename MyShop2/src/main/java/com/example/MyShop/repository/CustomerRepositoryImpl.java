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
    public void deleteCustomer(Long id) {
        store.remove(id);
    }

    @Override
    public Customer updateCustomer(Long id, String name, String rrNumber, String address, String password) {
        store.get(id).setId(id);
        store.get(id).setName(name);
        store.get(id).setRrNumber(rrNumber);
        store.get(id).setPassword(password);
        return store.get(id);
    }
}
