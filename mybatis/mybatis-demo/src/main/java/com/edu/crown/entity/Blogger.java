package com.edu.crown.entity;

import java.util.List;

/**
 * Created by Crown on 2018/7/16.
 */
public class Blogger {
    private Integer id;

    private String bloggerName;

    private String bloggerDesc;

    private List<Article> articleList;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getBloggerName() {
        return bloggerName;
    }

    public void setBloggerName(String bloggerName) {
        this.bloggerName = bloggerName;
    }

    public String getBloggerDesc() {
        return bloggerDesc;
    }

    public void setBloggerDesc(String bloggerDesc) {
        this.bloggerDesc = bloggerDesc;
    }

    public List<Article> getArticleList() {
        return articleList;
    }

    public void setArticleList(List<Article> articleList) {
        this.articleList = articleList;
    }

    @Override
    public String toString() {
        return "Blogger{" +
                "id=" + id +
                ", bloggerName='" + bloggerName + '\'' +
                ", bloggerDesc='" + bloggerDesc + '\'' +
                ", articleList=" + articleList +
                '}';
    }
}
