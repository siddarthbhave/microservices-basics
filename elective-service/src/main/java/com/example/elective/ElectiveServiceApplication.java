package com.example.elective;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class ElectiveServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(ElectiveServiceApplication.class, args);
	}

}