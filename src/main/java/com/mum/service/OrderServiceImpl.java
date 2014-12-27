/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mum.service;

import com.mum.dao.ProductRepositoryLocal;
import com.mum.domain.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 *
 * @author sunil
 */
@Service
@Transactional
public class OrderServiceImpl implements OrderService{
    @Autowired
    private ProductRepositoryLocal productRepositoryLocal;

    @Override
    public Product getProductById(String productID,long quantity) {
        return productRepositoryLocal.getProductById(productID,quantity);
    }
    
}
