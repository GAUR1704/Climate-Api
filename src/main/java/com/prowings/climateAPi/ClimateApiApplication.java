package com.prowings.climateAPi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class ClimateApiApplication {

	public static void main(String[] args) {
		SpringApplication.run(ClimateApiApplication.class, args);
	}

}
