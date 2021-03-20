package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {

	    //ApplicationContext context = new ClassPathXmlApplicationContext("app-context.xml");

		SpringApplication.run(DemoApplication.class, args);
		System.out.println("Hello world!");

		// In app-context var:
        // <bean id="product" class="main.java.Product"></bean>
        // <context:component-scan base-package="main"/>
	}

}
