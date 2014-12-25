/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mum.controller;

import com.mum.domain.Card;
import com.mum.service.CardServiceImpl;
import com.mum.service.ProductServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;

/**
 *
 * @author sunil
 */
@Controller
@RequestMapping(value = "rest/card")
public class CardRestController {

    @Autowired
    private CardServiceImpl cardServiceImpl;
    @Autowired
    private ProductServiceImpl productServiceImpl;

    @RequestMapping(method = RequestMethod.POST)
    public @ResponseBody Card create(@RequestBody Card card) {
        return cardServiceImpl.create(card);
    }

    @RequestMapping(value = "/{cardId}",method = RequestMethod.GET)
    public @ResponseBody Card read(@PathVariable(value = "cardId") String cardId){
        return cardServiceImpl.read(cardId);
    }
    
    @RequestMapping(value = "/{cardId}",method = RequestMethod.PUT)
    @ResponseStatus(value = HttpStatus.NO_CONTENT)
    public void update(@PathVariable(value = "cardId")String cardId,@RequestBody Card card){
        cardServiceImpl.update(cardId, card);
        
    }
}
