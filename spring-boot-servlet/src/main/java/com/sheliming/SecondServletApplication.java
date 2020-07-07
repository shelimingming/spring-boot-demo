package com.sheliming;

import com.sheliming.servlet.SecondServlet;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletRegistrationBean;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class SecondServletApplication {
    public static void main(String[] args) {
        SpringApplication.run(SecondServletApplication.class, args);
    }

    @Bean
    public ServletRegistrationBean getServletRegistrationBean() {  //一定要返回ServletRegistrationBean
        ServletRegistrationBean bean = new ServletRegistrationBean(new SecondServlet());     //放入自己的Servlet对象实例
        bean.addUrlMappings("/secondServlet");  //访问路径值
        return bean;
    }
}
