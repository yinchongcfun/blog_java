package com.blog.dao;

import com.blog.TkMapper;
import com.blog.entity.Article;
import org.springframework.stereotype.Repository;

@Repository
public interface ArticleMapper extends TkMapper<Article> {
}