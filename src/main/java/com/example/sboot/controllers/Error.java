package com.example.sboot.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@Controller
public class Error {
    @RequestMapping(method = RequestMethod.GET, value = "/")
    public String get(){
        return "index";
    }
}
