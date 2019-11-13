package com.blog.service;

import com.blog.entity.Article;
import com.blog.util.PageWrap;
import org.springframework.stereotype.Service;

import javax.servlet.http.HttpServletRequest;
import java.util.List;


public interface ArticleService {

    Article  getArticel(Integer id);

    int  addArticle(HttpServletRequest request);

    PageWrap<List<Article>> getALLArticel(Integer is_hot,Integer page);

}
