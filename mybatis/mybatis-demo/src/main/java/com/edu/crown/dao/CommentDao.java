package com.edu.crown.dao;

import com.edu.crown.entity.Comment;

import java.util.List;

/**
 * Created by Crown on 2018/7/16.
 */
public interface CommentDao {
    int insertComment(Comment user);

    int deleteComment(Integer id);

    int updateComment(Comment user);

    Comment selectOne(Integer id);

    List<Comment> selectAll();
}
