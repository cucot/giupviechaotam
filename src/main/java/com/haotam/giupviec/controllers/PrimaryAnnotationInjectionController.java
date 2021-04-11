package com.haotam.giupviec.controllers;

import com.haotam.giupviec.services.interfaces.IGreetingService;
import org.springframework.stereotype.Controller;

@Controller
public class PrimaryAnnotationInjectionController {

    private final IGreetingService greetingService;

    public PrimaryAnnotationInjectionController(IGreetingService greetingService) {
        this.greetingService = greetingService;
    }

    public void sayHello() {
        this.greetingService.greeting();
    }
}
