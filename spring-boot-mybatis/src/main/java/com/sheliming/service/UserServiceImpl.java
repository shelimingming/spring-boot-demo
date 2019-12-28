package com.sheliming.service;

import com.sheliming.dao.UserMapper;
import com.sheliming.domain.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserMapper userMapper;

    @Override
    public User queryUserById(String id) {
        return userMapper.queryUserById(id);
    }
}
