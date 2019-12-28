package com.sheliming.controller;

import com.sheliming.domain.User;
import com.sheliming.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

//表示修饰该Controller所有的方法返回JSON格式,
//如果使用@Controller就必须在每个方法中添加@ResponseBody
@RestController
@RequestMapping("user")
public class UserController {

    @Autowired
    private UserService userService;

    /**
     * 根据id查询用户信息
     *
     * @param id
     * @return
     */
    @RequestMapping("/queryUserById")
    public User queryUserById(String id){
        return userService.queryUserById(id);
    }

}
