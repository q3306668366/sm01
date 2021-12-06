package edu.soft2.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import edu.soft2.pojo.User;

@Controller
@RequestMapping(value = "param2")
public class MyController2 {
    @RequestMapping(value = "test3")
    public String test3() {
        System.out.println("----test3()----");
        return "hello";
    }

    @RequestMapping(value = "reg")
    public String reg(User user) {
        System.out.println("用户名=" + user.getUsername());
        System.out.println("密码=" + user.getPwd());
        System.out.println("年龄=" + user.getAge());
        return "hello";
    }
}


