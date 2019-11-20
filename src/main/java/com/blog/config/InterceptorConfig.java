package com.blog.config;

import com.blog.interceptor.CommonInterceptor;
import com.blog.interceptor.UserLoginInterceptor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

/**
 * @author cfun
 * @description 登录拦截器配置
 * @date 2019-11-07
 */
@Configuration
public class InterceptorConfig implements WebMvcConfigurer {
    @Autowired
    private UserLoginInterceptor userLoginInterceptor;

    @Autowired
    private CommonInterceptor commonInterceptor;

    public void addInterceptors(InterceptorRegistry registry) {
        //跨域设置
        registry.addInterceptor(commonInterceptor).addPathPatterns("/**");

        //登录拦截
        registry.addInterceptor(userLoginInterceptor).addPathPatterns("/**")
                .excludePathPatterns("/blog/admin/login",
                        "/blog/admin/add",
                        "/blog/register",
                        "/blog/article/list",
                        "/blog/article/detail"
                );
    }


}