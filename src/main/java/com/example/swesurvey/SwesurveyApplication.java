package com.example.swesurvey;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.boot.autoconfigure.domain.EntityScan;

@SpringBootApplication
@ComponentScan(basePackages = { "com.example.swesurvey" })
@EntityScan(basePackages = "com.example.swesurvey")
public class SwesurveyApplication {

	public static void main(String[] args) {
		SpringApplication.run(SwesurveyApplication.class, args);
	}

}
