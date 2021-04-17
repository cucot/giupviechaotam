package com.haotam.giupviec.services;

import com.haotam.giupviec.model.Employee;

import java.util.Set;

public interface EmployeeService {

    Employee save(Employee employee);

    Set<Employee> findAll();

    Employee findById(Long id);
}
