package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@EnableDiscoveryClient
@SpringBootApplication
@RibbonClient(name = "server", configuration = RibbonConfiguration.class)
public class Wk10RibbonClientApplication {

	public static void main(String[] args) {
		SpringApplication.run(Wk10RibbonClientApplication.class, args);
	}
}