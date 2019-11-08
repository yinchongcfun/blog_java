package com.blog.service.impl;

import com.blog.dao.ArticleMapper;
import com.blog.entity.Article;
import com.blog.service.ArticleService;
import com.blog.util.PageWrap;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

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
     * @date: 2019-11-08
     **/
    @Override
    public PageWrap<List<Article>> getALLArticel(Integer is_hot) {
        //判断账号是否已经存在
        List<Article> articleList = articleMapper.selectByExampleWithBLOBs(is_hot);
        return PageWrap.createPageWrap(articleList,1,10);
    }
}
