package com.imie.stock;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@EntityScan("com.imie.stock.entities")
@EnableJpaRepositories("com.imie.stock.dao")
@SpringBootApplication
public class Stock {

	public static void main(String[] args) {
		SpringApplication.run(Stock.class, args);
	}
}
