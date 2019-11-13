package com.blog.controller;

import com.blog.Vo.MyResponse;
import com.blog.entity.User;
import com.blog.enums.UserEnum;
import com.blog.service.UserService;
import com.blog.util.ChekParams;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import java.util.Map;

/**
 * @author cfun
 * @description 登录
 * @date 2019-11-06
 */
@RestController
@RequestMapping("/blog")
public class LoginController extends ChekParams {

    @Autowired
    private UserService userService;

    @Autowired HttpServletRequest request;
    /**
     * @desc:登录
     * @author:cfun
     * @date:2019-11-07
     **/
    @RequestMapping(value = "/admin/login", method = RequestMethod.POST)
    @ResponseBody
    public MyResponse<Object> login(@RequestParam(value = "password") String password, @RequestParam(value = "email") String email) {
        checkParamNull(password, "参数不正确");
        checkParamNull(email, "参数不正确");
        User user = userService.getUserByEmailAndPwd(email, password);
        if (user != null) {
            //登录成功,设置session信息
            request.getSession().setAttribute("user",user);
            return MyResponse.createSuccess(UserEnum.LOGIN_SUCCESS.message);
        } else {
            return MyResponse.createFail(UserEnum.LOGIN_FAIL.message);
        }
    }

    /**
     * @desc:注册
     * @author:cfun
     * @date:2019-11-07
     **/
    @RequestMapping(value = "/register", method = RequestMethod.POST)
    public MyResponse<Object> register(@RequestParam(value = "password") String password, @RequestParam(value = "email") String email) {
        checkParamNull(password, "参数不为空");
        checkParamNull(email, "参数不为空");
        Integer insert = userService.registerWithEmailAndPassword(email, password);
        if (insert == 1) {
            return MyResponse.createSuccess(UserEnum.REGISTER_SUCCESS.message);
        }else if(insert == 2){
            return MyResponse.createFail(UserEnum.HAS_REGISTER.message);
        }else {
            return MyResponse.createFail(UserEnum.REGISTER_FAIL.message);
        }
    }
}
