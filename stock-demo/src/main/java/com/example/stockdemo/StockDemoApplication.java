package com.example.stockdemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@EnableEurekaClient
@SpringBootApplication
public class StockDemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(StockDemoApplication.class, args);
	}
}
