package com.sheliming.ioc;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

@Controller
public class TestController {
    @Autowired
    private TestService testService;

    public String getHello() {
        return testService.getHello();
    }
}
