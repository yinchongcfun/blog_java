package com.blog.dao;

import com.blog.TkMapper;
import com.blog.entity.User;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface UserMapper extends TkMapper<User> {
    /**
     * @desc: 通过账号和密码查询对应信息, 登录用
     * @author:cfun
     * @date:2019-11-06
     **/
    User queryUserByEmailAndPwd(@Param("email") String email, @Param("password") String password);

    /**
     * @desc: 注册账号
     * @author:cfun
     * @date:2019-11-06
     **/
    User registerWithEmailAndPassword(@Param("email") String email, @Param("password") String password);
}