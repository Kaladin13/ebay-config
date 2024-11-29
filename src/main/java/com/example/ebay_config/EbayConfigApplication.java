package com.example.ebay_config;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@SpringBootApplication
@EnableConfigServer
public class EbayConfigApplication {

	public static void main(String[] args) {
		SpringApplication.run(EbayConfigApplication.class, args);
	}

}
