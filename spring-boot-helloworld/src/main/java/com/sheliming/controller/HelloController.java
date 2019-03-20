package com.sheliming.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

//表示修饰该Controller所有的方法返回JSON格式,
//如果使用@Controller就必须在每个方法中添加@ResponseBody
@RestController
public class HelloController {
    @RequestMapping("/hello")
    public String index() {
        return "Hello World";
    }

}
