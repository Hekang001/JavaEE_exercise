package com.kang.service;

import com.kang.dao.UserDao;
import com.kang.dao.UserDaoImpl;
import com.kang.dao.UserDaoMysqlImpl;
import com.kang.dao.UserDaoOracleImpl;

public class UserServiceImpl implements UserService {

//     对于每一个用户的不同要求，程序必须改变代码适应用户的需要
//     在编程中就变得异常麻烦
//     private UserDao userDao=new UserDaoOracleImpl();
//     private UserDao userDao=new UserDaoImpl();
//     private UserDao userDao=new UserDaoMysqlImpl();

    private UserDao userDao;

    //    利用set进行动态实现值的输入
    public void setUserDao(UserDao userDao){
        this.userDao=userDao;
    }

    public void getUser() {
        userDao.getUser();
    }
}
