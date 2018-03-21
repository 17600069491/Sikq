package com.dj.springboot.service;

import com.dj.springboot.pojo.User;

import java.util.List;

public interface UserService {

    List<User> userList();

    User user01(Integer id);

    Integer addUser(User test01);

    void updateUser(User test01);

    void deleteUser(Integer id);


}
