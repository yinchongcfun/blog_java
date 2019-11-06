package com.blog.entity;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.util.Date;

/**
 * @author cfun
 * @description 文章表
 * @date 2019-11-06
 */
@Data
@Entity
public class Article {
    @Id
    @GeneratedValue
    private Integer id;
    private Integer category_id;
    private String title;
    private String desc;
    private String content;
    private String img;
    private String tags;
    private String cover;
    private String sort;
    private String star;
    private Boolean is_hot;
    private Date created_at;
    private Date updated_at;


}
