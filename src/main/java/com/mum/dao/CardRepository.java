/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mum.dao;

import com.mum.domain.Card;
import java.util.HashMap;
import java.util.Map;
import org.springframework.stereotype.Repository;

/**
 *
 * @author sunil
 */
@Repository
public class CardRepository implements CardRepositoryLocal{

    private Map<String,Card> listOfCards;
    
    public CardRepository(){
        this.listOfCards=new HashMap<>();
    }
    
    @Override
    public Card create(Card card) {
        if(listOfCards.keySet().contains(card.getCartId())){
            throw new IllegalArgumentException(String.format("Can not create a cart. A cart with the give id (%) aldrady exist",
                    card.getCartId()));
        }
        listOfCards.put(card.getCartId(), card);
        return card;
    }

    @Override
    public Card read(String cardId) {
        return listOfCards.get(cardId);
    }

    @Override
    public void update(String cardId, Card card) {
        if(!listOfCards.keySet().contains(card.getCartId())){
            throw new IllegalArgumentException(String.format("Can not update cart. The cart with the give id (%) does not does not exist"
                    ,cardId));
        }
        listOfCards.put(cardId, card);
    }

    @Override
    public void delete(String cardId) {
        if(!listOfCards.keySet().contains(cardId)){
            throw new IllegalArgumentException(String.format("Can not update cart. The cart with the give id (%) does not does not exist"
                    ,cardId));
        }
        listOfCards.remove(cardId);
    }
    
}
