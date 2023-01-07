package com.nttdata.card.microservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.data.mongodb.config.EnableReactiveMongoAuditing;
import reactivefeign.spring.config.EnableReactiveFeignClients;

@SpringBootApplication
@EnableEurekaClient
@EnableReactiveFeignClients
@EnableReactiveMongoAuditing
public class CardMicroserviceApplication {

	public static void main(String[] args) {
		SpringApplication.run(CardMicroserviceApplication.class, args);
	}

}
