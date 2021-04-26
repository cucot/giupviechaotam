package com.haotam.giupviec.controllers;

import com.haotam.giupviec.services.WorkerService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("workers")
public class WorkerController {

    private final WorkerService workerService;

    public WorkerController(WorkerService workerService) {
        this.workerService = workerService;
    }

    @GetMapping({"", "/", "/index.html", "/index"})
    public String getWorkers(Model model) {
        model.addAttribute("workers", workerService.findAll());
        return "workers/workers";
    }
}
