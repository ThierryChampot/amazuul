package com.imie.stock.daos;

import java.util.List;

import com.imie.stock.entities.Product;

import org.springframework.data.repository.CrudRepository;

public interface ProductDao extends CrudRepository<Product, Long> {

	List<Product> findByQuantity(int quantity);

}