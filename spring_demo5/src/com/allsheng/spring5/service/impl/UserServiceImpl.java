package com.allsheng.spring5.service.impl;

import com.allsheng.spring5.dao.UserDao;
import com.allsheng.spring5.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

/**
 * @author chenht
 * @date 2022/8/13
 */
@Service
public class UserServiceImpl implements UserService {

    // 根据类的类型进行注入
    // 相当于 <bean id="userDao" class="com.allsheng.spring5.dao.UserDao" autowire="byType"></bean>
    @Autowired
    // 根据类的类的名称属性注入
    // 相当于 <bean id="userDaoImpl" class="com.allsheng.spring5.dao.impl.UserDaoImpl" autowire="byName"></bean>
    @Qualifier(value = "userDaoImpl")
    private UserDao userDao;

    @Override
    public void add() {
        System.out.println("userService add()...");
        userDao.add();
    }
}
