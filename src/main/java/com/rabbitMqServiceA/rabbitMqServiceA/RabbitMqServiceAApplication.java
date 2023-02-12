package com.rabbitMqServiceA.rabbitMqServiceA;

import org.springframework.amqp.rabbit.annotation.EnableRabbit;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@EnableRabbit
@SpringBootApplication
public class RabbitMqServiceAApplication {

	public static void main(String[] args) {
		SpringApplication.run(RabbitMqServiceAApplication.class, args);
	}

}
