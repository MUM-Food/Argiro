/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mum.service;

import com.mum.dao.FoodMenuFacadeLocal;
import com.mum.domain.FoodMenu;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 *
 * @author sunil
 */
@Service
@Transactional
public class FoodMenuServiceImpl implements FoodMenuService{

    @Autowired
    public FoodMenuFacadeLocal facadeLocal;
     
    @Override
    public void save(FoodMenu foodMenu) {
        facadeLocal.create(foodMenu);
    }

    
    

    
    
}
