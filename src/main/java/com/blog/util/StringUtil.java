package com.blog.util;

/**
 * @author cfun
 * @description 字符传工具类
 * @date 2019-11-06
 */
public class StringUtil {
    /**
     * 字符串转化int
     *
     * @param str
     * @return
     */
    public static int parseInt(String str) {
        return parseInt(str);
    }


    /**
     * @param
     * @return
     * @desc 判断字符串是否为空
     */
    public static boolean isEmptyOrNull(String s) {
        if (s == null || s.trim().length() <= 0) {
            return true;
        }
        return false;
    }

}
