package com.ynz.actuator.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class FrontController {

    @GetMapping("/login")
    public String login(){
        return "login";
    }
}
