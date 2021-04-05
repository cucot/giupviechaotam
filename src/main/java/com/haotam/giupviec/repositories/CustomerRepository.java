package com.haotam.giupviec.repositories;

import com.haotam.giupviec.entity.Customer;
import org.springframework.data.repository.CrudRepository;

public interface CustomerRepository extends CrudRepository<Customer, Long> {
}
