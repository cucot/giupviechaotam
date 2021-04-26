package com.haotam.giupviec.controllers;

import com.haotam.giupviec.services.BikerService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
@RequestMapping("bikers")
public class BikerController {

    private final BikerService bikerService;

    public BikerController(BikerService bikerService) {
        this.bikerService = bikerService;
    }

    @GetMapping({"", "/", "index", "index.html"})
    public String getBikers(Model model) {
        model.addAttribute("bikers", bikerService.findAll());
        return "bikers/bikers";
    }
}
