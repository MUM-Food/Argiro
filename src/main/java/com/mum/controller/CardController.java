/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mum.controller;

import javax.servlet.http.HttpServletRequest;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 *
 * @author sunil
 */
@Controller
@RequestMapping(value = "/card")
public class CardController {
    @RequestMapping
    public String get(HttpServletRequest request){
        System.out.println("Load here:: " +request.getSession(true).getId());
         return "redirect:/card/"+request.getSession(true).getId();
    }
    @RequestMapping(value = "/{cardId}",method = RequestMethod.GET)
    public String getCard(@PathVariable(value="cardId")String cardId,Model model){
        System.out.println("load get:: "+cardId);
        model.addAttribute("cardId",cardId);
        
        return "card";
    }
    
}
