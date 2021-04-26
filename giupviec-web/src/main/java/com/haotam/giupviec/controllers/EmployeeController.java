package com.haotam.giupviec.controllers;

import com.haotam.giupviec.services.EmployeeService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("employees")
public class EmployeeController {

    private final EmployeeService employeeService;

    public EmployeeController(EmployeeService employeeService) {
        this.employeeService = employeeService;
    }

    @GetMapping({"", "/", "index", "index.html"})
    public String getEmployees(Model model) {
        model.addAttribute("employees", employeeService.findAll());
        return "employees/employees";
    }
}
