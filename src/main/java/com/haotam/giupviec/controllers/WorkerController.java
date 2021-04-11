package com.haotam.giupviec.controllers;

import com.haotam.giupviec.repositories.WorkerRepository;
import com.haotam.giupviec.services.interfaces.IGreetingService;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class WorkerController {

	private final WorkerRepository workerRepository;
	private IGreetingService greetingService;


	public WorkerController(WorkerRepository workerRepository, @Qualifier("constructorGreetingService") IGreetingService greetingService) {
		this.workerRepository = workerRepository;
		this.greetingService = greetingService;
	}

	@GetMapping("/workers-management")
	public String manageWorkers(Model model) {
		model.addAttribute("workerList", workerRepository.findAll());
		this.greetingService.greeting();
		return "pages/worker";
	}

}
