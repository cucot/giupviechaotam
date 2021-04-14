package com.haotam.giupviec.repositories;

import com.haotam.giupviec.model.Customer;
import org.springframework.data.repository.CrudRepository;

public interface CustomerRepository extends CrudRepository<Customer, Long> {
}
