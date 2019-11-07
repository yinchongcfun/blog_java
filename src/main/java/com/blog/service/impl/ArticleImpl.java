package com.blog.service.impl;

import com.blog.dao.ArticleMapper;
import com.blog.entity.Article;
import com.blog.entity.User;
import com.blog.service.ArticleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tk.mybatis.mapper.entity.Example;

import java.util.List;

/**
 * @author cfun
 * @description 文章实现类
 * @date 2019-11-07
 */
@Service
public class ArticleImpl implements ArticleService {
    @Autowired
    private ArticleMapper articleMapper;


    /**
     * @desc: 获取文章列表
     * @author: cfun
     * @date: 2019-11-07
     **/
    @Override
    public List<Article> getALLArticel() {
        //判断账号是否已经存在
        List<Article> articleList= articleMapper.selectAll();
        return  articleList;
    }
}
