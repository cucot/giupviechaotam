package com.giupviechaotam.service;


import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import com.giupviechaotam.repository.EmployeeRepository;
import com.giupviechaotam.api.request.DataTableRequest;
import com.giupviechaotam.api.response.DataTableResponse;
import com.giupviechaotam.entity.Employee;

@Service
@Transactional
public class EmployeeService {
    
    @Autowired
    private EmployeeRepository employeeRepository;

    public DataTableResponse<Employee> getEmployees(DataTableRequest dataTableRequest) {
        int startPage = dataTableRequest.getStart() / dataTableRequest.getLength();
        Pageable pageable = PageRequest.of(startPage, dataTableRequest.getLength());
        Page<Employee> responsePage = employeeRepository.findAll(pageable);
        DataTableResponse<Employee> dataTableResponse = new DataTableResponse<>();
        dataTableResponse.setRecordsTotal(responsePage.getTotalElements());
        dataTableResponse.setRecordsFiltered(responsePage.getTotalElements());
        dataTableResponse.setData(responsePage.getContent());
        dataTableResponse.setDraw(dataTableRequest.getDraw());
        return dataTableResponse;
    }
}
