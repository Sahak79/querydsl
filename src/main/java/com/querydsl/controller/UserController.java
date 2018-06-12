package com.querydsl.controller;

import com.querydsl.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class UserController {

    @Autowired
    private UserService userService;

    @RequestMapping(name = "/user", method = RequestMethod.GET)
    public String getUser(){
        System.out.println(userService.getUser());
        return "user";
    }

}
