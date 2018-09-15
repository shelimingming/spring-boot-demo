package com.sheliming.bean;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class MyBean implements InitializingBean, DisposableBean {
    @Override
    public void destroy() throws Exception {
        System.out.println("=========destory=========");
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println("==========afterPropertiesSet=============");
    }
}
