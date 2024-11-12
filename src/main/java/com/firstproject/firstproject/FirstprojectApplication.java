package com.firstproject.firstproject;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class FirstprojectApplication {

	//@GetMapping("/aboutApp")
	public static void main(String[] args) {
		SpringApplication.run(FirstprojectApplication.class, args);
		//public aboutApp() { return "asd"; }
	}

}
