/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mum.controller;

import com.mum.domain.FoodMenu;
import com.mum.domain.Student;
import com.mum.service.FoodMenuService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

/**
 *
 * @author sunil
 */
@Controller
public class HomeController {

    @Autowired
    public FoodMenuService foodMenuService;
    
    @RequestMapping("/")
    public String welcome(Model model) {
        model.addAttribute("greeting", "Welcome to Web Store!");
        model.addAttribute("tagline", "The one and only amazing web store");
        Student student = new Student("suniljoshi", "june", 2014);
        student.setBatch("oct");
        model.addAttribute("studentInfo", student);
        return "welcome";
    }

    @RequestMapping("/details")
    public String getDetails(@RequestParam("id") String detailId, Model model) {
        //public String getDetails(Model model) {
        System.out.println("Details " + detailId);
        return "details";
    }

    @RequestMapping(value = "/todaysMenu", method = RequestMethod.GET)
    public String addTodaysMenu(Model model) {
        System.out.println("Inside today menu");
        FoodMenu foodMenuForm = new FoodMenu();
        model.addAttribute("foodMenuForm", foodMenuForm);
        return "addTodaysMenu";
    }

    @RequestMapping(value ="addTodaysMenu" , method = RequestMethod.POST)
    public String processTodaysMenuRegistration(@ModelAttribute("foodMenuForm") FoodMenu foodMenu) {
        System.out.println("BreakFast " + foodMenu.getBreakFast()+" Tea Type "+foodMenu.getTeaType());
        foodMenuService.save(foodMenu);
        return "addTodaysMenu";
    }
//    @ModelAttribute("foodMenuForm")
//    public FoodMenu constructFoodMenuItem() {
//        return new FoodMenu();
//    }
//
//    @RequestMapping(value = "addTodaysMenu" ,method = RequestMethod.POST)
//    public String registerdMenuItem(@ModelAttribute("foodMenuForm") FoodMenu foodMenu) {
//        System.out.println("value is :: "+foodMenu.getBreakFast()+"::"+foodMenu.getTeaType());
//        return "addTodaysMenu";
//    }
//
//    @RequestMapping("/todaysMenu")
//    public String addTodaysMenu() {
//        return "addTodaysMenu";
//    }

}
