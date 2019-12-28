package com.sheliming.service;

import com.sheliming.dao.UserMapper;
import com.sheliming.domain.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Date;

/**
 * 测试事务
 */
@Service
public class TransactionService {
    @Autowired
    private UserMapper userMapper;

    /**
     * 不带事务
     */
    public void insertUserNoTransaction() {
        userMapper.insertUser(new User("111",new Date()));
        int i = 1 / 0;
        userMapper.insertUser(new User("222",new Date()));
    }

    /**
     * 带事务
     */
    @Transactional
    public void insertUserWithTransaction() {
        userMapper.insertUser(new User("333",new Date()));
        int i = 1 / 0;
        userMapper.insertUser(new User("444",new Date()));
    }
}
