package com.imie.stock;

import com.imie.stock.daos.ProductDao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


@SpringBootApplication
public class Stock {
	@Autowired
	ProductDao productDao;
	
	public static void main(String[] args) {
		SpringApplication.run(Stock.class, args);
	}
}
