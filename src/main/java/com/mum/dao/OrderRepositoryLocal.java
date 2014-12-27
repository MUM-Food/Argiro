/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mum.dao;

import com.mum.domain.Order;

/**
 *
 * @author sunil
 */
public interface OrderRepositoryLocal {
    Long saveOrder(Order order);
}
