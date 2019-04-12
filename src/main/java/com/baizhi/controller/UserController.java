package com.baizhi.controller;

import com.baizhi.entity.User;
import com.baizhi.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RequestMapping("user")
@RestController
public class UserController {
    @Autowired
    private UserService userService;


    @RequestMapping("selectall")
    public String selectall() {
        List<User> a = userService.selectall();

        System.out.println("*************");
        //saddddddddddddddddddddddddddddddd
        System.out.println("sssssssssssssssss");
        //sssssssssssssss
        return "index";
    }


}
