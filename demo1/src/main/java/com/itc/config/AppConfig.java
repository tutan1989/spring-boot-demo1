package com.itc.config;

import org.h2.server.web.WebServlet;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.web.servlet.ServletRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

import com.itc.service.HelloWorld;
import com.itc.service.HelloWorldService;

@Configuration
@EnableAutoConfiguration
@Import(EmployeeConfig.class)
public class AppConfig {

	@Bean("helloBean")
	public HelloWorld helloBean() {
		return new HelloWorldService();
	}
	
	// Add this in App config.java 

	// Custom config can be declared here.
		// its helps to look up the h2 datebase on browser
		
	
	
	@Bean
	ServletRegistrationBean h2servletRegistration() {
		ServletRegistrationBean registrationBean = new ServletRegistrationBean(new WebServlet());
		registrationBean.addUrlMappings("/console/*");
		return registrationBean;
	}
	 
}

