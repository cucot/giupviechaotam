package com.haotam.giupviec.services;

import com.haotam.giupviec.services.interfaces.IGreetingService;
import org.springframework.stereotype.Service;

@Service
public class ConstructorGreetingService implements IGreetingService {
    @Override
    public void greeting() {
        System.out.println("Hello, I am constructor injection greeting service");
    }
}
