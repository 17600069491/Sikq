package com.example.demo.controller;

import com.example.demo.domian.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;


@Controller
public class TestController {

    @RequestMapping("/test1")
    public String test1(){
        return "test";
    }

    @Autowired
    private User user;
    @RequestMapping("/getUsers")
    @ResponseBody
    public String getUsers(){
        return "Hello Spring Boot, name is " + user.getName() + ", sex is "+ user.getSex() + ", classname is "+ user.getClassroom()+ ", num is "+ user.getNum();
    }


}
