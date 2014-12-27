/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mum.controller;

import com.mum.domain.Product;
import com.mum.service.ProductService;
import com.mum.service.ProductServiceImpl;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 *
 * @author sunil
 */
@Controller
public class ProductController {

    @Autowired
    private ProductService productService;

    @RequestMapping("/products")
    public String list(Model model) {    
        model.addAttribute("products",productService.getAllProductsDetails());
        return "products";
    }
    
    @RequestMapping("/products/{category}")
    public String getProductsByCategory(Model model,@PathVariable("category")String productCategory){
        System.out.println("Category");
        model.addAttribute("products", productService.getProductsByCategory(productCategory));
        return "products";
    }
}

