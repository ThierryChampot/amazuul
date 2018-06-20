package com.imie.stock.controllers;

import com.imie.stock.entities.Product;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Optional;

import com.imie.stock.daos.ProductDao;

@Controller
@RequestMapping("/stock")
public class StockCtrl {
    @Autowired
	private static final String LIST = "/list";
    private static final String NEW = "/new";
    private static final String FIND_BY_ID = "/:id";
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