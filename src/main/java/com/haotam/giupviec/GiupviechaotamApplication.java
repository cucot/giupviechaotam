package com.haotam.giupviec;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication(scanBasePackages = "com.haotam.giupviec")
public class GiupviechaotamApplication {

    public static void main(String[] args) {
        ApplicationContext appContext = SpringApplication.run(GiupviechaotamApplication.class, args);
    }
}
