package com.yang;

import com.yang.controller.UserController;
import com.yang.entry.User;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;

/**
 * Created by ykm on 2021/10/4.
 */
public class TestMain {

    public static void main(String[] args) {

        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("spring_context.xml");

        UserController userController = (UserController) applicationContext.getBean("userController");

        List<User> users = userController.selectUsers(new User());

        users.stream().forEach(user -> System.out.println(user.toString()));

        User userCon = new User();
        userCon.setAddress("Washington");

        userCon.setName("Redskins");
        int flag1 = userController.updateUser(userCon);

        System.out.println(flag1);
        int flag2 = userController.deleteUser(userCon);
        System.out.println(flag2);
    }
}
