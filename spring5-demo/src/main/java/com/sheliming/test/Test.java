package com.sheliming.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

public class Test {
    public static void main(String[] args) throws ClassNotFoundException {

        ApplicationContext ctx = new FileSystemXmlApplicationContext
                ("E:\\study\\springboot\\workspace2\\spring-boot-demo\\spring5-demo\\src\\main\\resources\\application.xml");
        System.out.println("number : " + ctx.getBeanDefinitionCount());
        ((Person) ctx.getBean(Person.class)).work();
    }
}
