/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mum.service;

import com.mum.domain.Product;

/**
 *
 * @author sunil
 */
public interface OrderService {
     public Product getProductById(String productID,long quantity);
}
