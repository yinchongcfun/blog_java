package com.blog.entity;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Date;
import javax.persistence.*;

public class Article {
    @Id
    @GeneratedValue(generator = "JDBC")
    private Integer id;

    /**
     * 分类id
     */
    @Column(name = "category_id")
    @JsonProperty("category_id")
    private Integer categoryId;

    /**
     * 文章标题
     */
    private String title;

    /**
     * 封面图
     */
    private String img;

    /**
     * 标签
     */
    private String tags;


    /**
     * 封面图
     */
    private String desc;

    /**
     * 标签
     */
    private String content;

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    /**
     * 封面图
     */
    private String cover;

    /**
     * 排序
     */
    private Integer sort;

    private Integer star;

    /**
     * 0删除，1存在
     */
    private Integer status;

    /**
     * 0非热门，1热门
     */
    @Column(name = "is_hot")
    @JsonProperty("is_hot")
    private Integer isHot;

    @Column(name = "created_at")
    @JsonProperty("created_at")
    private Date createdAt;

    @Column(name = "updated_at")
    @JsonProperty("updated_at")
    private Date updatedAt;

    /**
     * @return id
     */
    public Integer getId() {
        return id;
    }

    /**
     * @param id
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * 获取分类id
     *
     * @return category_id - 分类id
     */
    public Integer getCategoryId() {
        return categoryId;
    }

    /**
     * 设置分类id
     *
     * @param categoryId 分类id
     */
    public void setCategoryId(Integer categoryId) {
        this.categoryId = categoryId;
    }

    /**
     * 获取文章标题
     *
     * @return title - 文章标题
     */
    public String getTitle() {
        return title;
    }

    /**
     * 设置文章标题
     *
     * @param title 文章标题
     */
    public void setTitle(String title) {
        this.title = title == null ? null : title.trim();
    }

    /**
     * 获取封面图
     *
     * @return img - 封面图
     */
    public String getImg() {
        return img;
    }

    /**
     * 设置封面图
     *
     * @param img 封面图
     */
    public void setImg(String img) {
        this.img = img == null ? null : img.trim();
    }

    /**
     * 获取标签
     *
     * @return tags - 标签
     */
    public String getTags() {
        return tags;
    }

    /**
     * 设置标签
     *
     * @param tags 标签
     */
    public void setTags(String tags) {
        this.tags = tags == null ? null : tags.trim();
    }

    /**
     * 获取封面图
     *
     * @return cover - 封面图
     */
    public String getCover() {
        return cover;
    }

    /**
     * 设置封面图
     *
     * @param cover 封面图
     */
    public void setCover(String cover) {
        this.cover = cover == null ? null : cover.trim();
    }

    /**
     * 获取排序
     *
     * @return sort - 排序
     */
    public Integer getSort() {
        return sort;
    }

    /**
     * 设置排序
     *
     * @param sort 排序
     */
    public void setSort(Integer sort) {
        this.sort = sort;
    }

    /**
     * @return star
     */
    public Integer getStar() {
        return star;
    }

    /**
     * @param star
     */
    public void setStar(Integer star) {
        this.star = star;
    }

    /**
     * 获取0删除，1存在
     *
     * @return status - 0删除，1存在
     */
    public Integer getStatus() {
        return status;
    }

    /**
     * 设置0删除，1存在
     *
     * @param status 0删除，1存在
     */
    public void setStatus(Integer status) {
        this.status = status;
    }

    /**
     * 获取0非热门，1热门
     *
     * @return is_hot - 0非热门，1热门
     */
    public Integer getIsHot() {
        return isHot;
    }

    /**
     * 设置0非热门，1热门
     *
     * @param isHot 0非热门，1热门
     */
    public void setIsHot(Integer isHot) {
        this.isHot = isHot;
    }

    /**
     * @return created_at
     */
    public Date getCreatedAt() {
        return createdAt;
    }

    /**
     * @param createdAt
     */
    public void setCreatedAt(Date createdAt) {
        this.createdAt = createdAt;
    }

    /**
     * @return updated_at
     */
    public Date getUpdatedAt() {
        return updatedAt;
    }

    /**
     * @param updatedAt
     */
    public void setUpdatedAt(Date updatedAt) {
        this.updatedAt = updatedAt;
    }
}