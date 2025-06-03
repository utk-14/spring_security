package com.example.springSecurity.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class Hellocontroller {
    @GetMapping("/")
    public String getHello(){
        return "hello";
    }
}
