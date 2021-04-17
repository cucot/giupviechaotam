package com.haotam.giupviec.services.map;

import com.haotam.giupviec.model.Employee;
import com.haotam.giupviec.services.CrudService;

import java.util.Set;

public class MapEmployeeService extends AbstractMapService<Employee, Long> implements CrudService<Employee, Long> {

    @Override
    public Employee save(Employee employee) {
        return super.save(employee.getId(), employee);
    }

    @Override
    public Employee findById(Long id) {
        return super.findByID(id);
    }

    @Override
    public void delete(Employee employee) {
        super.delete(employee);
    }

    @Override
    public void deleteById(Long id) {
        super.deleteById(id);
    }

    @Override
    public Set<Employee> findAll() {
        return super.findAll();
    }
}
