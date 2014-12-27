/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mum.service;

import com.mum.dao.CardRepositoryLocal;
import com.mum.domain.Card;
import com.mum.exception.InvalidCardException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author sunil
 */
@Service
public class CardServiceImpl implements CardService {

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

    @Override
    public Card validate(String cardId) {
        Card card = cardRepositoryLocal.read(cardId);
        if (card == null || card.getCartItems().size() == 0) {
            throw new InvalidCardException(cardId);
        }
        return card;
    }

}
