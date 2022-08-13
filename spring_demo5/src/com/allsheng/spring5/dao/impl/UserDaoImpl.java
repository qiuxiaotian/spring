package com.allsheng.spring5.dao.impl;

import com.allsheng.spring5.dao.UserDao;
import org.springframework.stereotype.Repository;

/**
 * @author chenht
 * @date 2022/8/13
 */
@Repository
public class UserDaoImpl implements UserDao {

    @Override
    public void add() {
        System.out.println("userDao add()...");
    }
}
