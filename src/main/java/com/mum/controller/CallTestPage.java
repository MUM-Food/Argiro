/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mum.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 *
 * @author sunil
 */
@Controller
 @RequestMapping(value = "/test")
public class CallTestPage {

//    @RequestMapping(value = "/test")
    public String showTestPage(Model model) {
        System.out.println("Message");
        model.addAttribute("message", "this is message");
        return "test";
    }
}
