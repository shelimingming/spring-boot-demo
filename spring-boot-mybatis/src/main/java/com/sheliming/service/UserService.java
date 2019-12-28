package com.sheliming.service;

import com.sheliming.domain.User;

public interface UserService {
    /**
     * 根据id查询用户信息
     *
     * @param id
     * @return
     */
    public User queryUserById(String id);
}
