package com.blog.service.impl;

import com.blog.dao.ArticleMapper;
import com.blog.entity.Article;
import com.blog.service.ArticleService;
import com.blog.util.HttpServletRequestUtil;
import com.blog.util.PageWrap;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tk.mybatis.mapper.entity.Example;

import javax.persistence.criteria.CriteriaBuilder;
import javax.servlet.http.HttpServletRequest;
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
    public PageWrap<List<Article>> getALLArticel(Integer is_hot, Integer page) {
        List<Article> articleList = articleMapper.selectByExampleWithBLOBs(is_hot);
        return PageWrap.createPageWrap(articleList, page, 10);
    }


    /**
     * @desc: 获取文章
     * @author: cfun
     * @date: 2019-11-08
     **/
    @Override
    public Article getArticel(Integer id) {
        Article article = articleMapper.getArticle(id);
        return article;
    }

    @Override
    public int addArticle(HttpServletRequest request) {
        // 获取输入的帐号
        String title = HttpServletRequestUtil.getString(request, "title");
        // 获取输入的密码
        String desc = HttpServletRequestUtil.getString(request, "desc");
        String content = HttpServletRequestUtil.getString(request, "content");
        String cover = HttpServletRequestUtil.getString(request, "cover");
        Integer category_id = HttpServletRequestUtil.getInt(request, "category_id");
        Article article = new Article();
        article.setId(null);
        article.setCategoryId(category_id);
        article.setCover(cover);
        article.setContent(content);
        article.setDesc(desc);
        article.setTitle(title);
        Integer i = articleMapper.insertSelective(article);
        return i;
    }
}
