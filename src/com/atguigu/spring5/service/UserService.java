package com.atguigu.spring5.service;

import com.atguigu.spring5.dao.UserDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * @author Jesse 1094798816@qq.com
 * @create 2022-02-27 22:52
 */
@Service
@Transactional
public class UserService {
    @Autowired
    private UserDao userDao;

    //转账的方法
    public void accountMoney() {
        //lucy 少 100
        userDao.reduceMoney();
        int i = 10/0;
        //mary 多 100
        userDao.addMoney();
    }
}
