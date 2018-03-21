package com.dj.springboot.mapper;

import com.dj.springboot.pojo.User;

public class UserMapperSQL {

    public String testList(){
        return "select * from user";
    }

    public String test03(Integer id){
        return "select * from user where id = " + id;
    }

    public String deleteTest(Integer id){
        return "DELETE FROM user WHERE id = " + id;
    }

    public String addTest(User test03){
        return "insert into user (name) values (#{name})";
    }

    public String updateTest(User test03){
        return "update user set name = #{name} where id = " + test03.getId();
    }
}
