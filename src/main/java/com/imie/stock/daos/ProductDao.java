package com.imie.stock.daos;

import com.imie.stock.entities.Product;

import org.springframework.data.repository.CrudRepository;

public interface ProductDao extends CrudRepository<Product, Long> {

}