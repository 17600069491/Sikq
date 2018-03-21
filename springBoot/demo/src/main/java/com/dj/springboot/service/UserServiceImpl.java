package com.dj.springboot.service;


import com.dj.springboot.mapper.UserMapper;
import com.dj.springboot.pojo.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService{
    @Autowired
    private UserMapper userMapper;


    @Override
    public List<User> userList() {
        return userMapper.userList();
    }

    @Override
    public User user01(Integer id) {
        return userMapper.user01(id);
    }

    @Override
    public Integer addUser(User test01) {
        userMapper.addUser(test01);
        return null;
    }

    @Override
    public void updateUser(User test01) {
        userMapper.updateUser(test01);
    }

    @Override
    public void deleteUser(Integer id) {
        userMapper.deleteUser(id);
    }
}
