package com.haotam.giupviec.services;

import com.haotam.giupviec.model.Customer;

import java.util.Set;

public interface CustomerService {

    Customer save(Customer customer);

    Set<Customer> findAll();

    Customer findById(Long id);
}
