package com.blog.dao;

import com.blog.TkMapper;
import com.blog.entity.Article;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ArticleMapper extends TkMapper<Article> {
    /**
     * @desc: 文章列表
     **/
    List<Article> getALLArticel();

    List<Article> selectByExampleWithBLOBs(@Param(value = "is_hot") Integer is_hot);
}