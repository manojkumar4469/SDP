package com.klef.jfsd.springboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = "com.klef.jfsd.springboot")
public class SDP_Project {

	public static void main(String[] args) {
		SpringApplication.run(SDP_Project.class, args);
		System.out.println("Car Show Room Management System");
	}

}
