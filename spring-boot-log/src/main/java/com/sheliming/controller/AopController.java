package com.sheliming.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;


@RestController
public class AopController {
    @RequestMapping("/aopLog")
    public String aopLog(String result) {

        return result;
    }
}
