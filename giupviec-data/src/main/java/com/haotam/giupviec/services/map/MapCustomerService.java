package com.haotam.giupviec.services.map;

import com.haotam.giupviec.model.Customer;
import com.haotam.giupviec.services.CrudService;

import java.util.Set;

public class MapCustomerService extends AbstractMapService<Customer, Long> implements CrudService<Customer, Long> {

    @Override
    public Customer save(Customer customer) {
        return super.save(customer.getId(), customer);
    }

    @Override
    public void delete(Customer customer) {
        super.delete(customer);
    }

    @Override
    public void deleteById(Long id) {
        super.deleteById(id);
    }

    @Override
    public Customer findById(Long id) {
        return super.findByID(id);
    }

    @Override
    public Set<Customer> findAll() {
        return super.findAll();
    }
}
