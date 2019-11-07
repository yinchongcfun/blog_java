package com.blog.enums;

/**
 * @author cfun
 * @description
 * @date 2019-11-07
 */
public enum UserEnum {

    //请登录
    LOGIN_NEED(500,"请登录后再进行其他操作"),
    //登录成功了
    LOGIN_SUCCESS(200,"恭喜你登录成功了"),
    //登录失败了
    LOGIN_FAIL(500,"不好意思登录失败了,请检查网络"),
    // 注册成功了
    REGISTER_SUCCESS(200, "恭喜你注册成功了"),
    // 已经注册了
    HAS_REGISTER(500, "该账号已经注册了"),
    // 注册失败了
    REGISTER_FAIL(500, "不好意思注册失败了");
    public final int code;
    public final String message;

    UserEnum(int code, String message) {
        this.code = code;
        this.message = message;
    }
}
