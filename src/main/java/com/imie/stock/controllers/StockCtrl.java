package com.imie.stock.controllers;

import com.imie.stock.entities.Product;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Optional;

import com.imie.stock.daos.ProductDao;

@RestController
@RequestMapping(StockCtrl.STRING)
public class StockCtrl {
	static final String STRING = "/";
	private static final String LIST = "/list";
    private static final String NEW = "/new";
    private static final String FIND_BY_ID = "/:id";

	@Autowired
    private ProductDao productDao;
    
	@GetMapping(LIST) 
    Iterable<Product> list() {
        return this.productDao.findAll();
    }

    @GetMapping(FIND_BY_ID)
    Optional<Product> findById(Long id) {
        return this.productDao.findById(id);
    }
    
    @PostMapping(NEW)
    Product create(Product product) {
        return this.productDao.save(product);
    }
}