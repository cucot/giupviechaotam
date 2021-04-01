package com.haotam.giupviec;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@SpringBootApplication(scanBasePackages = "com.haotam.giupviec")
public class GiupviechaotamApplication {

	public static void main(String[] args) {
//		BCryptPasswordEncoder encoder = new BCryptPasswordEncoder();
//		System.out.println(encoder.encode("123456"));
		SpringApplication.run(GiupviechaotamApplication.class, args);
	}
	
	@Bean
	public WebMvcConfigurer corsConfigurer() {
		return new WebMvcConfigurer() {
			@Override
			public void addCorsMappings(CorsRegistry registry) {
				registry.addMapping("/").allowedOrigins("http://localhost:8080");
				WebMvcConfigurer.super.addCorsMappings(registry);
			}
			
		};
	}

}
