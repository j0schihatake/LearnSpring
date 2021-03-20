package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
		System.out.println("Hello world!");

		// in app-context var:
        //    <bean id="product" class="main.java.Product"></bean>
        //    <context:component-scan base-package="main"/>
	}

}
