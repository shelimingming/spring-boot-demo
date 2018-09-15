package com.sheliming.ioc;

import org.springframework.stereotype.Repository;

@Repository
public class TestDao {
    public String getHello(){
        return "Hello!!";
    }
}
