package com.edu.crown.entity;

import java.util.List;

/**
 * Created by Crown on 2018/7/16.
 */
public class Article {
    private Integer id;

    private String articleName;

    private String articleDesc;

    private List<Comment> commentList;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getArticleName() {
        return articleName;
    }

    public void setArticleName(String articleName) {
        this.articleName = articleName;
    }

    public String getArticleDesc() {
        return articleDesc;
    }

    public void setArticleDesc(String articleDesc) {
        this.articleDesc = articleDesc;
    }

    public List<Comment> getCommentList() {
        return commentList;
    }

    public void setCommentList(List<Comment> commentList) {
        this.commentList = commentList;
    }

    @Override
    public String toString() {
        return "Article{" +
                "id=" + id +
                ", articleName='" + articleName + '\'' +
                ", articleDesc='" + articleDesc + '\'' +
                ", commentList=" + commentList +
                '}';
    }
}
