package com.haotam.giupviec.controllers;

import com.haotam.giupviec.services.CustomerService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
@RequestMapping("customers")
public class CustomerController {

    private final CustomerService customerService;

    public CustomerController(CustomerService customerService) {
        this.customerService = customerService;
    }

    @GetMapping({"", "/", "index", "index.html"})
    public String getBikers(Model model) {
        model.addAttribute("customers", customerService.findAll());
        return "customers/customers";
    }
}
