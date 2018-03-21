package com.dj.springboot.service;

import com.dj.springboot.mapper.UserMapper02;
import com.dj.springboot.pojo.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class UserServiceImpl02 implements UserService02{

    @Autowired
    private UserMapper02 userMapper02;

    @Override
    public List<User> testList() {
        return userMapper02.testList();
    }

    @Override
    public User test01(Integer id) {
        return userMapper02.test01(id);
    }

    @Override
    public void addTest(User test01) {
        userMapper02.addTest(test01);
    }

    @Override
    public void updateTest(User test01) {
        userMapper02.updateTest(test01);
    }

    @Override
    public void deleteTest(Integer id) {
        userMapper02.deleteTest(id);
    }


}
