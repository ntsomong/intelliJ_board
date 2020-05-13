package com.example.board.controller;

import com.example.board.dto.Article;
import com.example.board.service.ArticleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
public class ArticleController {
    private final ArticleService articleService;

    @Autowired
    public ArticleController(ArticleService articleService) {
        this.articleService = articleService;
    }

    @RequestMapping("article/list")
    public String showList(Model model) {
        List<Article> articles = articleService.getArticles();
        model.addAttribute("articles", articles);

        return "article/list";
    }

/*    @RequestMapping("article/getArticles")
    @ResponseBody
    public List<Article> getArticles() {
        List<Article> articles = articleService.getArticles();

        return articles;
    }*/
}
