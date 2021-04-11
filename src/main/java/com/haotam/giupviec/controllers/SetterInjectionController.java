package com.haotam.giupviec.controllers;

import com.haotam.giupviec.services.interfaces.IGreetingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;

@Controller
public class SetterInjectionController {

    private IGreetingService greetingService;

    /**
     * we can either using qualifier or changing the parameter name to match the bean name of the implementation class so that Spring app context will know exactly which one to use
     * for example we could either remove the @Qualifier or changing the parameter name to setterGreetingService
     * @Autowired
     * public void setGreetingService(IGreetingService setterGreetingService) {
     *     this.greetingService = setterGreetingService
     * }
     * then it will work just fine
     * @param greetingService
     */
    @Autowired
    @Qualifier("setterGreetingService")
    public void setGreetingService(IGreetingService greetingService) {
        this.greetingService = greetingService;
    }

    public void sayHello() {
        this.greetingService.greeting();
    }
}
