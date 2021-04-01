//package com.haotam.giupviec.config;
//
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Configuration;
//import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
//import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
//import org.springframework.security.core.userdetails.User;
//import org.springframework.security.core.userdetails.UserDetails;
//import org.springframework.security.core.userdetails.UserDetailsService;
//import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
//import org.springframework.security.crypto.password.PasswordEncoder;
//import org.springframework.security.provisioning.InMemoryUserDetailsManager;
//
////@EnableWebSecurity
////@Configuration
//public class WebSecurityConfig extends WebSecurityConfigurerAdapter {
//
////	@Bean
////	public PasswordEncoder passwordEncoder() {
////		return new BCryptPasswordEncoder();
////	}
////
////	@Override
////	@Bean
////	protected UserDetailsService userDetailsService() {
////		UserDetails myUser = User.withUsername("nnphuc")
////				.password("$2a$10$l3qMQTH/yHq6ePCishQmY.Izqg90OxGI9fg7avH7Km5s3sjpkLuZO")//123456
////				.roles("USER").build();
////		return new InMemoryUserDetailsManager(myUser);
////	}
////
////
//
//	
//}
////