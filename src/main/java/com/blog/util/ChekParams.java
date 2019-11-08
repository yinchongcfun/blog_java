package com.blog.util;

import com.blog.exceptions.ApiException;

/**
 * @author cfun
 * @description 参数检查工具类
 * @date 2019-11-06
 */
public  abstract class ChekParams {

    protected void checkParamNull(Integer param, String msg) {
        if (IntegerUtil.isNullOrZero(param)) {
            ApiException.throwException(msg);
        }
    }


    protected void checkParamNull(Long param, String msg) {
        if (IntegerUtil.isNullOrZero(param)) {
            ApiException.throwException(msg);
        }
    }


    protected void checkParamNull(String param, String msg) {
        if (StringUtil.isEmptyOrNull(param)) {
            ApiException.throwException(msg);
        }
    }


    protected void checkParamNull(Object param, String msg) {
        if (param == null) {
            ApiException.throwException(msg);
        }
    }
}
