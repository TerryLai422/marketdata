package com.terrylai.application;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@EnableDiscoveryClient
@ComponentScan(basePackages = "com.terrylai")
public class ParserServiceApplication {	
	
	public static void main(String[] args) {
		SpringApplication.run(ParserServiceApplication.class, args);
	}
}
