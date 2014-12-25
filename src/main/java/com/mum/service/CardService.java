/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mum.service;

import com.mum.dao.CardRepositoryLocal;
import com.mum.domain.Card;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author sunil
 */
@Service
public class CardService implements CardServiceImpl{
    
    @Autowired
    private CardRepositoryLocal cardRepositoryLocal;

    @Override
    public Card create(Card card) {
        return cardRepositoryLocal.create(card);
    }

    @Override
    public Card read(String cardId) {
        return cardRepositoryLocal.read(cardId);
    }

    @Override
    public void update(String cardId, Card card) {
        cardRepositoryLocal.update(cardId, card);
    }

    @Override
    public void delete(String cardId) {
        cardRepositoryLocal.delete(cardId);
    }
    
}
