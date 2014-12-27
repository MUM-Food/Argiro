/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mum.domain;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 *
 * @author sunil
 */
public class Order implements Serializable {

    private static final long serialVersionUID = -3560539622417210365L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    private Integer id;
    private Long orderId;
    private Card card;
    private Customer customer;
    private ShippingDetail shippingDetail;

//    public Order() {
//        this.customer = new Customer();
//        this.shippingDetail = new ShippingDetail();
//    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Long getOrderId() {
        return orderId;
    }

    public void setOrderId(Long orderId) {
        this.orderId = orderId;
    }

    public Card getCard() {
        return card;
    }

    public void setCard(Card card) {
        this.card = card;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public ShippingDetail getShippingDetail() {
        return shippingDetail;
    }

    public void setShippingDetail(ShippingDetail shippingDetail) {
        this.shippingDetail = shippingDetail;
    }
    
}
