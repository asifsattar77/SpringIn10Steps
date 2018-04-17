package com.in28Minutes.springboot.basics.springbootin10steps;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class SpringbootIn10StepsApplication {

	public static void main(String[] args) {
		ApplicationContext appContext =  SpringApplication.run(SpringbootIn10StepsApplication.class, args);
		
		for (String name : appContext.getBeanDefinitionNames()) {
			System.out.println(name);
		}
	}
}
