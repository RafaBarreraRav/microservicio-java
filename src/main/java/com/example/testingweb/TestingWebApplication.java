package com.example.testingweb;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class TestingWebApplication {
	String password = "1234";

	public static void main(String[] args) {
		SpringApplication.run(TestingWebApplication.class, args);
	}
}
