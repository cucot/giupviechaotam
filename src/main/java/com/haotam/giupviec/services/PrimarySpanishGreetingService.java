package com.haotam.giupviec.services;

import com.haotam.giupviec.services.interfaces.IGreetingService;
import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

@Profile({"sp", "default"})
@Primary
@Service
public class PrimarySpanishGreetingService implements IGreetingService {
    @Override
    public void greeting() {
        System.out.println("Hello, I am primary Spanish greeting service");
    }

    @PostConstruct
    public void notifyingConstruction() {
        System.out.println("I have been constructed");
    }

    @PreDestroy
    public void notifyingDestruction() {
        System.out.println("I am about to be destroyed");
    }
}
