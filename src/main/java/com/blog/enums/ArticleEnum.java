package com.blog.enums;

/**
 * @author cfun
 * @description
 * @date 2019-11-07
 */
public enum ArticleEnum {

    //登录成功了
    ARTICLE_SUCCESS(200,"文章查询成功"),
    //登录失败了
    ARTICLE_FAIL(500,"文章查询失败");
    public final int code;
    public final String message;

    ArticleEnum(int code, String message) {
        this.code = code;
        this.message = message;
    }
}
