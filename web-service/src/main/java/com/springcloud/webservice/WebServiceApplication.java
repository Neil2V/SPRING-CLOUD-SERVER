package com.springcloud.webservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class WebServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(WebServiceApplication.class, args);
	}

<<<<<<< Updated upstream
=======

	@Override
	public void run(String... args) throws Exception {
		userRepository.save(User.builder().nombre("Ale").build());
	}
>>>>>>> Stashed changes
}
