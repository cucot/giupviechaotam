package com.haotam.giupviec;

import com.haotam.giupviec.resourceholder.DatasourceHolder;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication(scanBasePackages = "com.haotam.giupviec")
public class GiupviechaotamApplication {

    public static void main(String[] args) {
        ConfigurableApplicationContext context = SpringApplication.run(GiupviechaotamApplication.class, args);
        DatasourceHolder holder = context.getBean(DatasourceHolder.class);
        System.out.println(holder);;
    }
}
