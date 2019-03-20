package com.sheliming.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LogController {
    private static final Logger logger = LoggerFactory.getLogger(LogController.class);

    @RequestMapping("/log4j")
    public String log4j() {
        logger.error("log4j日志！！！");
        return "Hello World";
    }
}
