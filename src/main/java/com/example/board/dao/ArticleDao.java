package com.example.board.dao;

import com.example.board.dto.Article;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Component;

import java.util.List;

@Mapper
public interface ArticleDao {

    List<Article> getArticles();
}
