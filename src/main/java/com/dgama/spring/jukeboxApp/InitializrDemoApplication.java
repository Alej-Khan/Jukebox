package com.dgama.spring.jukeboxApp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class InitializrDemoApplication {

	@GetMapping("/hello")
	public String sayHello() {
		return "Hello World";
	}

	public static void main(String[] args) {
		SpringApplication.run(InitializrDemoApplication.class, args);
	}

}
