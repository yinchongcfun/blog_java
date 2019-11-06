package com.blog.dao;

import com.blog.entity.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

/**
 * @author cfun
 * @description 用户dao
 * @date 2019-11-06
 */

@Repository
public interface UserDao {

    /**
     * @desc: 通过账号和密码查询对应信息,登录用
     * @author:cfun
     * @date:2019-11-06
     **/
    User queryUserByEmailAndPwd(@Param("emial") String emial, @Param("password") String password);

    /**
     * @desc: 注册账号
     * @author:cfun
     * @date:2019-11-06
     **/
    User registerWithEmailAndPassword(@Param("emial") String emial, @Param("password") String password);
}
