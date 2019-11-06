package com.blog.exceptions;

import com.blog.Vo.MyResponse;
import com.blog.enums.ResponseEnum;

/**
 * @author cfun
 * @description api异常类
 * @date 2019-11-06
 */
public class ApiException extends RuntimeException {
    private final static String DEF_MSG = "非法请求";
    private ResponseEnum code;
    private Object object;

    public ResponseEnum getCode() {
        return code;
    }

    public Object getObject() {
        return object;
    }

    public ApiException(ResponseEnum code) {
        super(code.message);
        this.code = code;
    }

    public ApiException(ResponseEnum code, String message) {
        super(message);
        this.code = code;
    }

    public ApiException(ResponseEnum code, String message,Object object) {
        super(message);
        this.code = code;
        this.object=object;
    }

    public static void throwException(String msg) throws ApiException {
        throw new ApiException(ResponseEnum.ERROR, DEF_MSG);
    }
}
