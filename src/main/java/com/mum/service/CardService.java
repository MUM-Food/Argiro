/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mum.service;

import com.mum.domain.Card;

/**
 *
 * @author sunil
 */
public interface CardService {

    Card create(Card card);

    Card read(String cardId);

    void update(String cardId, Card card);

    void delete(String cardId);
    
    Card validate(String cartId);
}
