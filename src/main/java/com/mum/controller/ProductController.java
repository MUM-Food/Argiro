/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mum.controller;

import com.mum.domain.Product;
import com.mum.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

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
    
    
    @RequestMapping("/products/product")
    public String getProductById(@RequestParam("id")String productId,Model model){
        System.out.println("Product  id is "+productId);
        model.addAttribute("product",productService.getProductById(productId));
        return "product";
    }
    
    @RequestMapping(value="/products/add",method = RequestMethod.GET)
    public String getAddNewProductForm(Model model){
        Product product=new Product();
        model.addAttribute("newProduct",product);
        return "addProduct";
    }
    
    @RequestMapping(value = "/products/add",method = RequestMethod.POST)
    public String processAddNewProductForm(@ModelAttribute("newProduct") Product product){
        productService.addProduct(product);
        //return "redirect:/products/add";
         return "redirect:/products";
    }
}

