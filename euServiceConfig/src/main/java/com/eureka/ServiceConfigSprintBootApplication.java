package com.eureka;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@SpringBootApplication
@EnableConfigServer
public class ServiceConfigSprintBootApplication {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SpringApplication.run(ServiceConfigSprintBootApplication.class, args);

	}

}
