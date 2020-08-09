package com.renanzulian.helloworld.controller;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;


@RestController
public class HelloWorld {
    
    @GetMapping(value="/")
    public String getAll() {
        return "HelloWorld Spring";
    }
    
}