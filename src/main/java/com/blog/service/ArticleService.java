package com.blog.service;

import com.blog.entity.Article;
import org.springframework.stereotype.Service;

import java.util.List;


public interface ArticleService {

    List<Article>  getALLArticel();
}
