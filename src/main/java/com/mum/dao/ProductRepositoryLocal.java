/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mum.dao;

import com.mum.domain.Product;
import java.util.List;

/**
 *
 * @author sunil
 */
public interface ProductRepositoryLocal {

    List<Product> getAllProducts();

    public Product getProductById(String productID);
    
      List<Product> getAllProductsDetails();
    
}
