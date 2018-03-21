package com.dj.springboot.mapper;

import com.dj.springboot.pojo.User;
import org.apache.ibatis.annotations.*;

import java.util.List;


public interface UserMapper {

    @Select("select * from user")
    List<User> userList();

    @Select("select * from user where id = #{id}")
    User user01(Integer id);

    void deleteUser(Integer id);

    @Insert("insert into user (name) values (#{name})")
    @SelectKey(before = false, keyProperty="id",resultType = Integer.class, statement = "SELECT LAST_INSERT_ID()")
    void addUser(User user);

    @Update("update user set name = #{name} where id = #{id}")
    void updateUser(User user);

   /* @SelectProvider(type = UserMapperSQL.class,method = "findUserByIdd")
    User findUserByIdd(Integer id);*/

}
