package com.blog.service;

import com.blog.entity.User;

/**
 * @author cfun
 * @description 用户服务
 * @date 2019-11-06
 */
public interface UserService {

    /**
     * @desc:通过帐号和密码获取平台帐号信息
     * @author:cfun
     * @date:2019-11-06
     **/
    User getUserByEmailAndPwd(String emial, String password);

    /**
     * @desc:通过帐号和密码获取平台帐号信息
     * @author:cfun
     * @date:2019-11-06
     **/
    User registerWithEmailAndPassword(String emial, String password);

}
