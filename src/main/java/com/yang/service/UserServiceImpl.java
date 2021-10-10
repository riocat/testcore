package com.yang.service;

import com.yang.dao.UserDaoMapper;
import com.yang.entry.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * Created by ykm on 2021/10/4.
 */
@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserDaoMapper userDao;

    public List<User> selectUsers(User user) {
        return userDao.selectUsers(user);
    }

    public int updateUser(User user) {
        return userDao.updateUser(user);
    }

    @Transactional(propagation = Propagation.REQUIRED)
    public int deleteUser(User user) {
        int i = userDao.deleteUser(user);
        if (i != 0) {
            throw new RuntimeException();
        }
        return i;
    }
}
