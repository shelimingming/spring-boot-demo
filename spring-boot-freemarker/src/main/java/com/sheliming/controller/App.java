package com.sheliming.controller;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication  //等同于@EnableAutoConfiguration+ @ComponentScan("com.sheliming")
public class App {
    public static void main(String[] args) {
        SpringApplication.run(App.class, args);
    }

}
