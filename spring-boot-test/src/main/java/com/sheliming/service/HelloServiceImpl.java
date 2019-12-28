package com.sheliming.service;

import org.springframework.stereotype.Service;

@Service
public class HelloServiceImpl implements HelloService{
    @Override
    public String sayHello(String name) {
        System.out.println("hello " + name);
        return "hello " + name;
    }
}
