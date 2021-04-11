package com.haotam.giupviec.services;

import com.haotam.giupviec.services.interfaces.IGreetingService;
import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Profile({"en"})
@Primary
@Service
public class PrimaryEnglishGreetingService implements IGreetingService {
    @Override
    public void greeting() {
        System.out.println("Hello, I am primary English greeting Service");
    }
}
