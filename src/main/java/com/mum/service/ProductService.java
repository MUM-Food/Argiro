/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mum.service;

import com.mum.domain.Product;
import java.util.List;

/**
 *
 * @author sunil
 */
public interface ProductService {

    public List<Product> getAllProducts();

    public Product getProductById(String productID,long quantity);
    
    public List<Product> getAllProductsDetails(); 
    
    public List<Product> getProductsByCategory(String category);
}
