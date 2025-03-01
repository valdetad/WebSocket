package com.javatechie.spring.ws.api;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EnableJpaRepositories
public class SpringBootWebsocketApplication {
	public static void main(String[] args) {
		SpringApplication.run(SpringBootWebsocketApplication.class, args);
	}
}
