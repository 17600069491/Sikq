package com.dj.springboot.controller;

import com.dj.springboot.pojo.User;
import com.dj.springboot.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
public class UserController {
    @Autowired
    private UserService userService;



    @RequestMapping("userTeamAll")
    public String userTeamAll(Model model){
        List<User> userList =  userService.userList();
        model.addAttribute("userList",userList);
        return "userList";
    }






    @RequestMapping("user1")
    @ResponseBody
    public List<User> user1(){

        List<User> users = userService.userList();
        return users;
    }


    @RequestMapping("addUser1")
    @ResponseBody
    public Integer addUser(User user){
        userService.addUser(user);
        Integer id = user.getId();
        return id;
    }
    @RequestMapping("deleteUser")
    @ResponseBody
    public String deleteUser( Integer id){
        userService.deleteUser(id);
        return "success";
    }


    @RequestMapping("updateUser")
    @ResponseBody
    public String updateUser( User user){
        userService.updateUser(user);
        return "success";
    }





}
