package com.imie.stock;

import com.imie.stock.daos.ProductDao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@EntityScan("com.imie.stock.entities")
@EnableJpaRepositories("com.imie.stock.daos")
@SpringBootApplication
public class Stock {
	@Autowired
	ProductDao productDao;
	
	public static void main(String[] args) {
		SpringApplication.run(Stock.class, args);
	}
}
