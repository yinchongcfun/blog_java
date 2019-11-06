package com.blog.util;

import java.math.BigDecimal;

/**
 * @author cfun
 * @description int工具类
 * @date 2019-11-06
 */
public class IntegerUtil {

    /**
     * 判断数字是否为null或者0
     *
     * @param integer
     * @return
     */
    public static boolean isNullOrZero(Integer integer) {
        return integer == null || integer == 0;

    }

    /**
     * 判断数字是否为null或者0
     *
     * @param number
     * @return
     */
    public static boolean isNullOrZero(Long number) {
        return number == null || number == 0;

    }

    /**
     * 判断数字是否为null或者0
     *
     * @param number
     * @return
     */
    public static boolean isNotNullOrZero(Long number) {
        return !isNullOrZero(number);

    }

    /**
     * 判断数字是否为null或者0
     *
     * @param integer
     * @return
     */
    public static boolean isNotNullOrZero(Integer integer) {
        return !isNullOrZero(integer);

    }

    /**
     * 将BigDecimal 转换int
     *
     * @param decimal
     * @return
     */
    public static int parseInt(BigDecimal decimal) {
        return parseInt(decimal, 0);
    }

    /**
     * @desc 将 object 转换 int
     * @author ashui
     * @date 2018/9/23
     */
    public static int parseInt(Object value) {
        if (value == null) {
            return 0;
        } else if (value instanceof Integer) {
            return (Integer) value;
        } else if (value instanceof Number) {
            return ((Number) value).intValue();
        } else if (value instanceof String) {
            return StringUtil.parseInt(value+"");
        } else if (value instanceof Boolean) {
            return ((Boolean) value).booleanValue() ? 1 : 0;
        } else {
            return 0;
        }
    }


    /**
     * Long 转换int
     *
     * @param num
     * @return
     */
    public static int parseInt(Long num) {
        if (num == null) {
            return 0;
        }
        return num.intValue();
    }

    /**
     * Float 转换int
     *
     * @param num
     * @return
     */
    public static int parseInt(Float num) {
        if (num == null) {
            return 0;
        }
        return num.intValue();
    }

    /**
     * 将BigDecimal 转换int
     *
     * @param decimal
     * @param defaultVal
     * @return
     */
    public static int parseInt(BigDecimal decimal, int defaultVal) {
        if (decimal == null) {
            return defaultVal;
        }
        return decimal.intValue();
    }


    /**
     * Byte 转换int
     *
     * @param val
     * @return
     */
    public static int parseInt(Byte val) {
        if (val == null) {
            return 0;
        }
        return val.intValue();
    }

    /**
     * Integer 转换int
     *
     * @param integer
     * @return
     */
    public static int parseInt(Integer integer) {
        if (integer == null) {
            return 0;
        }
        return integer.intValue();
    }

    /**
     * Integer 转换int
     *
     * @param integer
     * @return
     */
    public static int parseInt(Integer integer, int defaultVal) {
        if (integer == null) {
            return defaultVal;
        }
        return integer.intValue();
    }
}
