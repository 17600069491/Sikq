package com.dj.springboot.service;

import com.dj.springboot.pojo.User;

import java.util.List;

public interface UserService03 {
    List<User> testList();

    User test03(Integer id);

    void addTest(User test03);

    void updateTest(User test03);

    void deleteTest(Integer id);
}
