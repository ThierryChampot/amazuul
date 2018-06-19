package com.imie.stock.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/stock")
public class StockCtrl {

    @GetMapping("/list")
    public List list(Product product) {
        return product;
    }

}