package com.edu.crown.dao;

import com.edu.crown.entity.Article;

import java.util.List;

/**
 * Created by Crown on 2018/7/16.
 */
public interface ArticleDao {
    int insertArticle(Article user);

    int deleteArticle(Integer id);

    int updateArticle(Article user);

    Article selectOne(Integer id);

    List<Article> selectAll();

}
