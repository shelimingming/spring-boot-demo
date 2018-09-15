package com.sheliming;

import com.sheliming.bean.Car;
import com.sheliming.bean.Jeep;
import com.sheliming.bean.JeepFactoryBean;
import com.sheliming.bean.MyBean;
import com.sheliming.config.MyConfig;
import com.sheliming.ioc.TestController;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(MyConfig.class, Car.class);
        System.out.println(context.getBean(MyBean.class));
        //System.out.println(context.getBean("createMyBean"));
        System.out.println(context.getBean("MyBean"));

        System.out.println(context.getBean(JeepFactoryBean.class));
        System.out.println(context.getBean("&createRunableFactoryBean"));

        System.out.println(context.getBean(Jeep.class));
        System.out.println(context.getBean("createRunableFactoryBean"));

        System.out.println(context.getBean(Car.class));
        System.out.println(context.getBean("car"));

        TestController testController = (TestController)context.getBean("testController");
        String hello = testController.getHello();
        System.out.println(hello);

        context.close();
    }
}
