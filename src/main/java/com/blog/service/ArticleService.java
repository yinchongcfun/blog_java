package com.blog.service;

import com.blog.entity.Article;
import com.blog.util.PageWrap;
import org.springframework.stereotype.Service;

import java.util.List;


public interface ArticleService {

//    List<Article>  getALLArticel(Integer is_hot);

    PageWrap<List<Article>> getALLArticel(Integer is_hot);
}
