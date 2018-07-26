package com.edu.crown.dao;

import com.edu.crown.entity.Blogger;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Update;

import java.util.List;

/**
 * Created by Crown on 2018/7/16.
 */
public interface BloggerDao {
    @Insert("INSERT INTO t_blogger(blogger_name, blogger_desc) VALUES (#{bloggerName}, #{bloggerDesc})")
    int insertBlogger(Blogger user);
    @Delete("DELETE FROM t_blogger WHERE id = #{id}")
    int deleteBlogger(Integer id);
    @Update("UPDATE t_blogger SET blogger_name = #{bloggerName}, blogger_desc = #{bloggerDesc}  WHERE id = #{id}")
    int updateBlogger(Blogger user);

    Blogger selectOne(Integer id);

    List<Blogger> selectAll();
}
