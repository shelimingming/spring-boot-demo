package com.sheliming.config;

import com.sheliming.bean.JeepFactoryBean;
import com.sheliming.bean.MyBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

@Configuration
@ComponentScan(basePackages="com.sheliming.ioc")
public class MyConfig {
    @Bean(name = "MyBean")
    @Scope("prototype")//默认单例，指定为非单例
    public MyBean createMyBean() {
        return new MyBean();
    }

    @Bean
    public JeepFactoryBean createRunableFactoryBean() {
        return new JeepFactoryBean();
    }
}
