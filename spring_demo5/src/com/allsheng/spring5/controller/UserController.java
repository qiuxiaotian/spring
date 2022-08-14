package com.allsheng.spring5.controller;

import com.allsheng.spring5.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import javax.annotation.Resource;

/**
 * @author chenht
 * @date 2022/8/13
 */
@Controller
public class UserController {

    @Autowired
    private UserService userService;

    public void userAdd() {


        System.out.println("aaa");
        System.out.println("userAdd()...");
        userService.add();
    }
}
