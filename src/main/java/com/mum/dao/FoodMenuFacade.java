/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mum.dao;

import com.mum.utils.SessionUtil;
import com.mum.domain.FoodMenu;
import org.springframework.stereotype.Repository;

/**
 *
 * @author sunil
 */
@Repository
  
public class FoodMenuFacade extends SessionUtil implements FoodMenuFacadeLocal{
    
     public void create(FoodMenu foodMenu){
         getSession().save(foodMenu);
    }

    
    
}
