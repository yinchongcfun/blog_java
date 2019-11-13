package com.blog.controller;

import com.blog.Vo.MyResponse;

import com.blog.entity.Article;
import com.blog.enums.ArticleEnum;
import com.blog.service.ArticleService;
import com.blog.util.ChekParams;
import com.blog.util.PageWrap;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
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
    public MyResponse<PageWrap<List<Article>>> list(@RequestParam(value = "is_hot") Integer is_hot, @RequestParam(value = "page") Integer page) {
        PageWrap<List<Article>> articleList = articleService.getALLArticel(is_hot, page);
        return MyResponse.createSuccess(ArticleEnum.ARTICLE_SUCCESS.message, articleList);
    }


    /**
     * @desc: 文章列表带分页
     * @author: cfun
     * @date: 2019-11-08
     **/
    @RequestMapping(value = "/article/detail", method = RequestMethod.GET)
    public MyResponse<Article> getArticle(@RequestParam(value = "id") Integer id) {
        checkParamNull(id, "参数不为空");
        Article article = articleService.getArticel(id);
        return MyResponse.createSuccess(ArticleEnum.ARTICLE_SUCCESS.message, article);
    }


    /**
     * @desc: 文章列表带分页
     * @author: cfun
     * @date: 2019-11-08
     **/
    @RequestMapping(value = "/admin/add", method = RequestMethod.POST)
    public MyResponse<Article> addArticle(HttpServletRequest request) {
        Integer add = articleService.addArticle(request);
        if (add == 1) {
            return MyResponse.createSuccess();
        } else {
            return MyResponse.createFail(ArticleEnum.ADD_FAIl.message);
        }
    }
}
