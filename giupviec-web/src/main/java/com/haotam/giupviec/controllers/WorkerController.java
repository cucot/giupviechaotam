package com.haotam.giupviec.controllers;

import com.haotam.giupviec.repositories.WorkerRepository;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

//@Controller
public class WorkerController {

    private final WorkerRepository workerRepository;

    public WorkerController(WorkerRepository workerRepository) {
        this.workerRepository = workerRepository;
    }

    @GetMapping("/workers-management")
    public String manageWorkers(Model model) {
//        model.addAttribute("workerList", workerRepository.findAll());
        return "pages/worker";
    }

}
