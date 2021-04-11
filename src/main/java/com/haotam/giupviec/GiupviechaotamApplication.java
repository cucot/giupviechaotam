package com.haotam.giupviec;

import com.haotam.giupviec.controllers.ConstructorInjectionController;
import com.haotam.giupviec.controllers.PrimaryAnnotationInjectionController;
import com.haotam.giupviec.controllers.SetterInjectionController;
import com.haotam.giupviec.services.EmployeeService;
import com.haotam.giupviec.services.WorkerService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@SpringBootApplication(scanBasePackages = "com.haotam.giupviec")
public class GiupviechaotamApplication {

	public static void main(String[] args) {
		ApplicationContext appContext = SpringApplication.run(GiupviechaotamApplication.class, args);
		ConstructorInjectionController constructorInjectionController = appContext.getBean("constructorInjectionController", ConstructorInjectionController.class);
		SetterInjectionController setterInjectionController = appContext.getBean("setterInjectionController", SetterInjectionController.class);

		constructorInjectionController.sayHello();
		setterInjectionController.sayHello();
		appContext.getBean("primaryAnnotationInjectionController", PrimaryAnnotationInjectionController.class).sayHello();
	}
	
//	@Bean
//	public WebMvcConfigurer corsConfigurer() {
//		return new WebMvcConfigurer() {
//			@Override
//			public void addCorsMappings(CorsRegistry registry) {
//				registry.addMapping("/").allowedOrigins("http://localhost:8080");
//				WebMvcConfigurer.super.addCorsMappings(registry);
//			}
//
//		};
//	}

}
