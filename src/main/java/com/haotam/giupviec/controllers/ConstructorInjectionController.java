package com.haotam.giupviec.controllers;

import com.haotam.giupviec.services.interfaces.IGreetingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;

@Controller
public class ConstructorInjectionController {

    //constructor injection is automatically done without @Autowired
    private final IGreetingService greetingService;

    @Autowired
    public ConstructorInjectionController(@Qualifier("constructorGreetingService") IGreetingService greetingService) {
        this.greetingService = greetingService;
    }

    public void sayHello() {
        this.greetingService.greeting();
    }
}
