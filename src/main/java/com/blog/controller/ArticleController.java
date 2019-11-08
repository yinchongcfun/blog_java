package com.blog.controller;

import com.blog.Vo.MyResponse;

import com.blog.entity.Article;
import com.blog.enums.ArticleEnum;
import com.blog.service.ArticleService;
import com.blog.util.ChekParams;
import com.blog.util.PageWrap;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @author cfun
 * @description 登录
 * @date 2019-11-06
 */
@RestController
@RequestMapping("/blog")
public class ArticleController extends ChekParams {

    @Autowired
    private ArticleService articleService;

    /**
     * @desc: 文章列表带分页
     * @author: cfun
     * @date: 2019-11-08
     **/
    @RequestMapping(value = "/article/list", method = RequestMethod.GET)
    public MyResponse<PageWrap<List<Article>>> list(@RequestParam(value = "is_hot") Integer is_hot) {
      PageWrap<List<Article>> articleList = articleService.getALLArticel(is_hot);
      return MyResponse.createSuccess(ArticleEnum.ARTICLE_SUCCESS.message,articleList);
    }

}
