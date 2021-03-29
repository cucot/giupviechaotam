package com.giupviechaotam.api;

import com.giupviechaotam.api.request.DataTableRequest;
import com.giupviechaotam.api.response.DataTableResponse;
import com.giupviechaotam.entity.Employee;
import com.giupviechaotam.service.EmployeeService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class LaoDongAPI {

    @Autowired
    private EmployeeService employeeService;
    
    @CrossOrigin
    @RequestMapping(path = "/employees", method = RequestMethod.GET)
    public DataTableResponse<Employee> getAll(@ModelAttribute DataTableRequest dataTableRequest) {
        return employeeService.getEmployees(dataTableRequest);
    }

}
