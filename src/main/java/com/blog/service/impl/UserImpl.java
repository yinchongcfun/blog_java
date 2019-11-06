package com.blog.service.impl;

import com.blog.dao.UserDao;
import com.blog.entity.User;
import com.blog.service.UserService;
import com.blog.util.MD5;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author cfun
 * @description 用户服务实现
 * @date 2019-11-06
 */
@Service
public class UserImpl implements UserService {

    @Autowired
    private UserDao userDao;

    @Override
    public User getUserByEmailAndPwd(String emial, String password) {
        return userDao.queryUserByEmailAndPwd(emial, MD5.getMd5(password));
    }

    @Override
    public User registerWithEmailAndPassword(String emial, String password) {
        return userDao.registerWithEmailAndPassword(emial, MD5.getMd5(password));

    }
}
