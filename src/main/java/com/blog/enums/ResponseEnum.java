package com.blog.enums;

/**
 * @author cfun
 * @description 返回值类型
 * @date 2019-11-06
 */
public enum ResponseEnum {

    // 成功
    SUCCESS(200,"请求成功"),

    // 失败
    ERROR(500,"请求失败"),

    NOT_FOUN(400,"请求未发现");

    public final int code;
    public final String message;

    ResponseEnum(int code,String message) {
        this.code = code;
        this.message=message;
    }
}
