package com.allsheng.spring5.controller;

import com.allsheng.spring5.service.UserService;
import org.springframework.stereotype.Controller;

import javax.annotation.Resource;

/**
 * @author chenht
 * @date 2022/8/13
 */
@Controller
public class UserController {

    @Resource
    private UserService userService;

    public void userAdd() {
        System.out.println("userAdd()...");
        userService.add();
    }
}
