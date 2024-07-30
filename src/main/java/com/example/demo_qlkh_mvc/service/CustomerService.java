package com.example.demo_qlkh_mvc.service;

import com.example.demo_qlkh_mvc.model.Customer;

import java.util.List;

public interface CustomerService {
    List<Customer> findAll();

    void save(Customer customer);

    Customer findById(int id);

    void update(int id, Customer customer);

    void remove(int id);
}
