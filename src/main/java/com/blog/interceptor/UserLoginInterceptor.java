package com.blog.interceptor;

import com.blog.Vo.MyResponse;
import com.blog.entity.User;
import com.blog.enums.UserEnum;
import org.springframework.stereotype.Component;
import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * @author cfun
 * @description 用户登陆拦截器
 * @date 2019-11-07
 */
@Component
public class UserLoginInterceptor extends HandlerInterceptorAdapter {
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
        Object userObj = request.getSession().getAttribute("user");
        if (userObj != null) {
            User user = (User) userObj;
            // 判断用户是否是登录状态
            if (user != null && user.getId() != null)
                return true;
        }
        // 不满足条件的话，则退回到登录界面
        System.out.println("请登录");
        return false;
    }
}
