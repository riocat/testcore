package com.yang.dao;

import com.yang.entry.User;

import java.util.List;

/**
 * Created by ykm on 2021/10/4.
 */
public interface UserDaoMapper {

    List<User> selectUsers(User user);

    int updateUser(User user);

    int deleteUser(User user);
}
