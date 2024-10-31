package com.vivek;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import jakarta.annotation.PostConstruct;

@SpringBootApplication
@RestController
@RequestMapping("/spring")
public class FirstSpringAwsDeploymentDemoApplication {
	
	
	private static Logger logger = LoggerFactory.getLogger(FirstSpringAwsDeploymentDemoApplication.class);
	
	@PostConstruct
	public void init() {
		logger.info("Application Started.....");
	}

	public static void main(String[] args) {
		logger.info("Application Started 1.....");
		SpringApplication.run(FirstSpringAwsDeploymentDemoApplication.class, args);
	}

	
	
	@GetMapping("/hello")
	public String helloWord() {
		logger.info("Called -------- helloWord()----------");
		return "Welcome to First Spring Project deployment in EC2 AWS............";
	}
}
