package com.dj.springboot.mapper;

import com.dj.springboot.pojo.User;
import org.apache.ibatis.annotations.DeleteProvider;
import org.apache.ibatis.annotations.InsertProvider;
import org.apache.ibatis.annotations.SelectProvider;
import org.apache.ibatis.annotations.UpdateProvider;

import java.util.List;

public interface UserMapper03 {


    @SelectProvider(type = UserMapperSQL.class,method = "testList")
    List<User> testList();

    @SelectProvider(type = UserMapperSQL.class,method = "test03")
    User test03(Integer id);

    @DeleteProvider(type = UserMapperSQL.class,method = "deleteTest")
    void deleteTest(Integer id);

    @InsertProvider(type = UserMapperSQL.class,method = "addTest")
    void addTest(User test03);

    @UpdateProvider(type = UserMapperSQL.class,method = "updateTest")
    void updateTest(User test03);
}
