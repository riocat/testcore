package com.yang.service;

import com.yang.entry.User;

import java.io.IOException;
import java.util.List;

/**
 * Created by ykm on 2021/10/4.
 */
public interface UserService {

    List<User> selectUsers(User user);

    int updateUser(User user);

    int deleteUser(User user);
}
