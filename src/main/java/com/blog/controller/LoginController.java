package com.blog.controller;

import com.blog.Vo.MyResponse;
import com.blog.entity.User;
import com.blog.service.UserService;
import com.blog.util.ChekParams;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import java.util.Map;

/**
 * @author cfun
 * @description 登录
 * @date 2019-11-06
 */
@Controller
@RequestMapping("/blog")
public class LoginController extends ChekParams {

    @Autowired
    private UserService userService;

    @RequestMapping(value = "/login", method = RequestMethod.GET)
    public MyResponse<Object> login(@RequestParam(value = "password") String password, @RequestParam(value = "emial") String emial) {
        checkParamNull(password, "参数不正确");
        checkParamNull(emial, "参数不正确");
        User user =userService.getUserByEmailAndPwd(emial,password);
        if(user!=null){
            return MyResponse.createSuccess();
        }else{
            return MyResponse.createFail();
        }
    }

    @RequestMapping(value = "/register", method = RequestMethod.GET)
    public MyResponse<Object> register(@RequestParam(value = "password") String password, @RequestParam(value = "emial") String emial) {
        checkParamNull(password, "参数不为空");
        checkParamNull(emial, "参数不为空");
        User user =userService.getUserByEmailAndPwd(emial,password);
        if(user!=null){
            return MyResponse.createSuccess();
        }else{
            return MyResponse.createFail();
        }
    }
}
