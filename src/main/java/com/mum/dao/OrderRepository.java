/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mum.dao;

import com.mum.domain.Order;
import com.mum.utils.SessionUtil;
import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author sunil
 */
public class OrderRepository extends SessionUtil implements OrderRepositoryLocal{

    
    @Override
    public Long saveOrder(Order order) {    
        Long nextId= (Long) getSession().save(order);
        System.out.println("Next id is "+nextId);
        return (Long) getSession().save(order);
    }
    
}
