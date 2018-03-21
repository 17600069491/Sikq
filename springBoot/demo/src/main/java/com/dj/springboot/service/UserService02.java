package com.dj.springboot.service;

import com.dj.springboot.pojo.User;

import java.util.List;

public interface UserService02 {


    List<User> testList();

    User test01(Integer id);

    void addTest(User test01);

    void updateTest(User test01);

    void deleteTest(Integer id);
}
