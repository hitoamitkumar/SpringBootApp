package com.example.SpringBootApp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringBootAppApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootAppApplication.class, args);

		String value=	System.getProperty("USERNAME_VM_OPT");// Read VM argument
		System.out.print("From main env variable");
		System.out.print(value);
	}


}
