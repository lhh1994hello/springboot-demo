package com.hello;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ImportResource;

@ImportResource(locations = {"classpath:beans.xml"})
@SpringBootApplication
public class SpringbootHello1Application {

	public static void main(String[] args) {
		SpringApplication.run(SpringbootHello1Application.class, args);
	}

}

