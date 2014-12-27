/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mum.exception;

/**
 *
 * @author sunil
 */
public class InvalidCardException extends RuntimeException {

    private static final long serialVersionUID = -5192041563033358491L;
    private String cardId;

    public InvalidCardException(String cartId) {
        this.cardId = cartId;
    }

    public String getCartId() {
        return cardId;
    }
}
