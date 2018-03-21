package com.dj.springboot.service;

import com.dj.springboot.mapper.UserMapper03;
import com.dj.springboot.pojo.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl03 implements UserService03{

    @Autowired
    private UserMapper03 UserMapper03;

    @Override
    public List<User> testList() {
        return UserMapper03.testList();
    }

    @Override
    public User test03(Integer id) {
        return UserMapper03.test03(id);
    }

    @Override
    public void addTest(User test03) {
        UserMapper03.addTest(test03);
    }

    @Override
    public void updateTest(User test03) {
        UserMapper03.updateTest(test03);
    }

    @Override
    public void deleteTest(Integer id) {
        UserMapper03.deleteTest(id);
    }
}
