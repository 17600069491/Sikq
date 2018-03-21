package com.example.demo.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class TestController {

    @RequestMapping("test1")
    @ResponseBody
    public String test(){

        return "hello worf";
    }
    @RequestMapping("test2")
    public String test2(){
        return "test";
    }
}
