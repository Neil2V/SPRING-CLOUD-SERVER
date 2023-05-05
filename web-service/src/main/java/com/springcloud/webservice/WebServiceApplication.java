package com.springcloud.webservice;

import com.springcloud.webservice.entity.User;
import com.springcloud.webservice.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;



@SpringBootApplication
public class WebServiceApplication implements CommandLineRunner {

	@Autowired
	UserRepository userRepository;

	public static void main(String[] args) {
		SpringApplication.run(WebServiceApplication.class, args);
	}


	@Override
	public void run(String... args) throws Exception {
		userRepository.save(User.builder().nombre("Neil").build());
	}

	@Override
	public void run(String... args) throws Exception {
		userRepository.save(User.builder().nombre("Ale").build());
	}

}
