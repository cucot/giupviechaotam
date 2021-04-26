package com.haotam.giupviec.services.map;

import com.haotam.giupviec.model.Customer;
import com.haotam.giupviec.services.CustomerService;
import org.springframework.stereotype.Service;

@Service
public class MapCustomerService extends AbstractMapService<Customer, Long> implements CustomerService {
}
