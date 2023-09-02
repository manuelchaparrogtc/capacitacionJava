package com.example.capacitacionJava.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class AppController {

    @GetMapping("/")
    public String root(){
        return "login";
    }

    @GetMapping("/login")
    public String login(){
        return "login";
    }

    @GetMapping("/createAccount")
    public String createAccount(){
        return "createAccount";
    }

    @GetMapping("/home")
    public String home(){
        return "home";
    }
}