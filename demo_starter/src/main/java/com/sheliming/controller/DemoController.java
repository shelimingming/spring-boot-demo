package com.sheliming.controller;

import com.sheliming.service.DemoService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
public class DemoController {
    @Resource(name = "demo")
    private DemoService demoService;

    @GetMapping("/say")
    public String sayWhat(){
        return demoService.say();
    }

}