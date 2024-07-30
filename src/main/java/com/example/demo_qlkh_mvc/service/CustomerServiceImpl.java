package com.example.demo_qlkh_mvc.service;

import com.example.demo_qlkh_mvc.model.Customer;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class CustomerServiceImpl implements CustomerService {

    private static Map<Integer, Customer> customers;

    static {
        customers = new HashMap<>();
        customers.put(1, new Customer(1, "Trang", "trang@codegym.vn", "Hanoi"));
        customers.put(2, new Customer(2, "Nguyen", "nguyen@codegym.vn", "hung yen"));
        customers.put(3, new Customer(3, "Khoi", "khoi@codegym.vn", "Bac ninh"));
        customers.put(4, new Customer(4, "Kien", "kien@codegym.vn", "Nam dinh"));
        customers.put(5, new Customer(5, "Huy", "huy@codegym.vn", "Ha giang"));
        customers.put(6, new Customer(6, "Quan", "quan@codegym.vn", "Hanoi"));
    }


    @Override
    public List<Customer> findAll() {
        return new ArrayList<>(customers.values());
    }

    @Override
    public void save(Customer customer) {
        customers.put(customer.getId(), customer);
    }

    @Override
    public Customer findById(int id) {
        return customers.get(id);
    }

    @Override
    public void update(int id, Customer customer) {
        customers.put(id, customer);
    }

    @Override
    public void remove(int id) {
        customers.remove(id);
    }
}
