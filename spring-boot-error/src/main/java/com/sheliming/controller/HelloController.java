package com.sheliming.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
    @RequestMapping("/hello")
    public String index() {
        int i = 1 / 0;
        return "Hello World";
    }

}
