package com.blog.enums;

/**
 * @author cfun
 * @description
 * @date 2019-11-07
 */
public enum ArticleEnum {

//    文章添加成功
    ADD_SUCCESS(200,"文章添加成功"),
//    文章添加失败
    ADD_FAIl(200,"文章添加失败"),
    //文章查询成功
    ARTICLE_SUCCESS(200,"文章查询成功"),
    //文章查询失败
    ARTICLE_FAIL(500,"文章查询失败");


    public final int code;
    public final String message;

    ArticleEnum(int code, String message) {
        this.code = code;
        this.message = message;
    }
}
