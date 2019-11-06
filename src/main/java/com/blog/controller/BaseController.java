package com.blog.controller;

import org.springframework.beans.factory.annotation.Autowired;

import javax.servlet.http.HttpServletRequest;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.Map;

/**
 * @author cfun
 * @description 基类
 * @date 2019-11-06
 */
public class BaseController
{
    @Autowired
    protected HttpServletRequest request;

    /** 获取参数map
     * @return
     */
    protected Map<String, String> getParams() {

        Enumeration<String> parameterNames = request.getParameterNames();
        Map<String, String> params = new HashMap<>();

        while (parameterNames.hasMoreElements()) {
            String key = parameterNames.nextElement();
            params.put(key, request.getParameter(key));
        }

        return params;
    }
}
