/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mum.controller;

import com.mum.domain.Card;
import com.mum.domain.CardItem;
import com.mum.domain.Product;
import com.mum.service.CardServiceImpl;
import com.mum.service.ProductServiceImpl;
import javax.servlet.http.HttpServletRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ExceptionHandler;
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
    public @ResponseBody
    Card create(@RequestBody Card card) {
        return cardServiceImpl.create(card);
    }

    @RequestMapping(value = "/{cardId}", method = RequestMethod.GET)
    public @ResponseBody
    Card read(@PathVariable(value = "cardId") String cardId) {
        return cardServiceImpl.read(cardId);
    }

    @RequestMapping(value = "/{cardId}", method = RequestMethod.PUT)
    @ResponseStatus(value = HttpStatus.NO_CONTENT)
    public void update(@PathVariable(value = "cardId") String cardId, @RequestBody Card card) {
        cardServiceImpl.update(cardId, card);

    }

    @RequestMapping(value = "/{cardId}", method = RequestMethod.DELETE)
    @ResponseStatus(value = HttpStatus.NO_CONTENT)
    public void delete(@PathVariable(value = "cardId") String cardId) {
        cardServiceImpl.delete(cardId);
    }

    @RequestMapping(value = "/add/{productId}", method = RequestMethod.PUT)
    @ResponseStatus(value = HttpStatus.NO_CONTENT)
    public void addItem(@PathVariable String productId, HttpServletRequest request) {
        String sessionId = request.getSession(true).getId();
        Card card = cardServiceImpl.read(productId);
        if (card == null) {
            card = cardServiceImpl.create(new Card(sessionId));
        }
        Product product = productServiceImpl.getProductById(productId);
        if (product == null) {
            //
            throw new IllegalArgumentException("some exception");
        }
        card.addCartItem(new CardItem(product));
        cardServiceImpl.update(sessionId, card);
    }

    @RequestMapping(value = "remove/{productId}", method = RequestMethod.PUT)
    @ResponseStatus(value = HttpStatus.NO_CONTENT)
    public void removeItem(@PathVariable String productId, HttpServletRequest request) {
        String sessionId = request.getSession(true).getId();
        Card card = cardServiceImpl.read(sessionId);
        if (card == null) {
            cardServiceImpl.create(new Card(sessionId));
        }
        Product product = productServiceImpl.getProductById(productId);
        if (product == null) {
            //
            throw new IllegalArgumentException("some exception");
        }
        card.removeCartItem(new CardItem(product));
        cardServiceImpl.update(sessionId, card);
      }
        @ExceptionHandler(IllegalArgumentException.class)
        @ResponseStatus(value = HttpStatus.BAD_REQUEST, reason = "Illegal request, please verify your payload")
        
        public void handleClientErrors(Exception ex) {
        }
        @ExceptionHandler(Exception.class)
        @ResponseStatus(value = HttpStatus.INTERNAL_SERVER_ERROR,reason = "Internal server error")
        public void handleServerErrors(Exception ex) {
        }


    
}
