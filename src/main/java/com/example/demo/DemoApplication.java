package com.example.demo;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;

@SpringBootApplication
@EnableAutoConfiguration
public class DemoApplication {

	private static final Logger LOGGER = LoggerFactory.getLogger(DemoApplication.class);

	@RequestMapping("/")
	String home() {
		LOGGER.info("Endpoint for home had been called");
		return "Hello World!";
	}

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}

}
