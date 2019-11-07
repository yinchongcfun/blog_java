package com.blog.Vo;

import com.blog.enums.ResponseEnum;
import lombok.Data;

import java.io.Serializable;

/**
 * @author cfun
 * @description api返回接口数据包装类
 * @date 2019-11-06
 */
@Data
public class MyResponse<T> implements Serializable {
    private int code;
    private String msg;
    private T data;


    public MyResponse() {

    }

    /**
     * @desc 判断数据返回是否正常
     * @author ashui
     * @date 2018/11/22
     */
    public boolean hasSucc() {
        return ResponseEnum.SUCCESS.code == this.code;
    }

    private MyResponse(T data) {
        this.data = data;
    }

    private MyResponse(int code, String message) {
        this.code = code;
        this.msg = message;
    }

    private MyResponse(int code, String message, T data) {
        this.code = code;
        this.msg = message;
        this.data = data;
    }

    public static <T> MyResponse<T> createSuccessByMsg(String message) {
        return new MyResponse<T>(ResponseEnum.SUCCESS.code, message, null);
    }


    public static <T> MyResponse<T> createSuccess(T t) {
        return new MyResponse<T>(ResponseEnum.SUCCESS.code, ResponseEnum.SUCCESS.message, t);
    }

    public static <T> MyResponse<T> createSuccess(int code, String message) {
        return new MyResponse<T>(code, message);
    }

    public static <T> MyResponse<T> createSuccess() {
        return new MyResponse<T>(ResponseEnum.SUCCESS.code, ResponseEnum.SUCCESS.message, null);
    }

    public static <T> MyResponse<T> create(ResponseEnum ResponseEnum) {
        return new MyResponse<T>(ResponseEnum.code, ResponseEnum.message, null);
    }

    public static <T> MyResponse<T> create(ResponseEnum ResponseEnum, String message) {
        return new MyResponse<T>(ResponseEnum.code, message, null);
    }

    public static <T> MyResponse<T> create(ResponseEnum ResponseEnum, String message, T t) {
        return new MyResponse<T>(ResponseEnum.code, message, t);
    }

    public static <T> MyResponse<T> createSuccess(String message, T t) {
        return new MyResponse<T>(ResponseEnum.SUCCESS.code, message, t);
    }

    public static <T> MyResponse<T> createFail() {
        return new MyResponse<T>(ResponseEnum.ERROR.code, ResponseEnum.ERROR.message, null);
    }

    public static <T> MyResponse<T> createFail(String message, T t) {
        return new MyResponse<T>(ResponseEnum.ERROR.code, message, t);
    }

    public static <T> MyResponse<T> createFail(String message) {
        return new MyResponse<T>(ResponseEnum.ERROR.code, message, null);
    }

//    public static <T> MyResponse<T> createFail(Exception ex) {
//        String error= StringUtil.convertException(ex);
//        return new MyResponse<T>(ResponseEnum.ERROR.code, error, null);
//    }

    public static <T> MyResponse<T> createFailByData(T t) {
        return new MyResponse<T>(ResponseEnum.ERROR.code, ResponseEnum.ERROR.message, t);
    }
}
