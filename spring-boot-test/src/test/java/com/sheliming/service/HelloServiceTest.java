package com.sheliming.service;

import com.sheliming.App;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = App.class)
public class HelloServiceTest {
    @Autowired
    private HelloService helloService;

    @Test
    public void test01() {
        helloService.sayHello("sheliming");
    }
}
