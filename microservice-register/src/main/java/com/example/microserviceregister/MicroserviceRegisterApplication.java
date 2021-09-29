package com.example.microserviceregister;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class MicroserviceRegisterApplication {

	public static void main(String[] args) {
		SpringApplication.run(MicroserviceRegisterApplication.class, args);
	}

}