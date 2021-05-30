package com.haotam.giupviec.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping("/admin")
public class AdminController {

    @GetMapping
    public String admin() {
        return "admin/admin";
    }
}
