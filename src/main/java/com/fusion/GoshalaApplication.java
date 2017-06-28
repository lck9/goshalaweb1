package com.fusion;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;

@EnableAutoConfiguration
@ComponentScan("controller")
@EntityScan("model")
@SpringBootApplication
public class GoshalaApplication {

	public static void main(String[] args) {
		SpringApplication.run(GoshalaApplication.class, args);
	}
}
