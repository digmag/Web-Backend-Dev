package com.example.BackendDevelop;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = "com.example.BackendDevelop")
public class BackendDevelopApplication {

	public static void main(String[] args) {
		SpringApplication.run(BackendDevelopApplication.class, args);
	}

}
