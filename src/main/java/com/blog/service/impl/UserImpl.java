package com.blog.service.impl;

import com.blog.Vo.MyResponse;
import com.blog.dao.UserMapper;
import com.blog.entity.User;
import com.blog.service.UserService;
import com.blog.util.MD5;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tk.mybatis.mapper.entity.Example;

import java.util.List;

/**
 * @author cfun
 * @description 用户服务实现
 * @date 2019-11-06
 */
@Service
public class UserImpl implements UserService {

    @Autowired
    private UserMapper userMapper;

    @Override
    public User getUserByEmailAndPwd(String email, String password) {
        return userMapper.queryUserByEmailAndPwd(email, MD5.getMd5(password));
    }

    @Override
    public int registerWithEmailAndPassword(String email, String password) {
        Example example = new Example(User.class);
        Example.Criteria criteria = example.createCriteria();
        criteria.andEqualTo("email", email);
        //判断账号是否已经存在
        int user = userMapper.selectCountByExample(example);
        if (user >= 1) {
            return 2;//2代表账号已经注册了
        }
        return userMapper.registerWithEmailAndPassword(email, MD5.getMd5(password));
    }
}
