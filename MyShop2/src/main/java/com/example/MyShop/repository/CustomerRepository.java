package com.example.MyShop.repository;

import com.example.MyShop.dto.Customer;

public interface CustomerRepository {

    void customerJoin(Customer customer);

    Customer selectCustomer(Long id);

    void deleteCustomer(Long id);

    Customer updateCustomer(Long id,String name,String rrNumber,String address,String password);

}
