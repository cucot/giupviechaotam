package com.haotam.giupviec.services.map;

import com.haotam.giupviec.model.Employee;
import com.haotam.giupviec.services.EmployeeService;
import org.springframework.stereotype.Service;

@Service
public class MapEmployeeService extends AbstractMapService<Employee, Long> implements EmployeeService {
}
