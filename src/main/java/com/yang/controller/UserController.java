package com.yang.controller;

import com.yang.entry.User;
import com.yang.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.io.IOException;
import java.util.List;

/**
 * Created by ykm on 2021/10/4.
 */
@Component
public class UserController {

    @Autowired
    private UserService userService;

    public List<User> selectUsers(User user) {
        return userService.selectUsers(user);
    }

    public int updateUser(User user) {
        return userService.updateUser(user);
    }

    public int deleteUser(User user) {
        return userService.deleteUser(user);
    }
}
