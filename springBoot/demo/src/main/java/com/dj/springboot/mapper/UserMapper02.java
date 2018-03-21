package com.dj.springboot.mapper;

import com.dj.springboot.pojo.User;
import org.apache.ibatis.annotations.DeleteProvider;
import org.apache.ibatis.annotations.InsertProvider;
import org.apache.ibatis.annotations.SelectProvider;
import org.apache.ibatis.annotations.UpdateProvider;

import java.util.List;

public interface UserMapper02 {


    List<User> testList();

    User test01(Integer id);

    void updateTest(User test01);

    void deleteTest(Integer id);

    void addTest(User test01);
}
