/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mum.controller;

import com.mum.domain.Product;
import com.mum.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 *
 * @author sunil
 */
@Controller
public class OrderController {
    @Autowired
    private OrderService orderService;
    
    
   // @RequestMapping("/products/P1234/2")
    @RequestMapping("/products/P1234/1")
   // public String processorOrder(Model model){
     public String processorOrder(){
        System.out.println("Inside processor order");
        Product p=orderService.getProductById("P1234",1);
       // model.addAttribute("products",p);
   
        return "redirect:/products";
    }
}
