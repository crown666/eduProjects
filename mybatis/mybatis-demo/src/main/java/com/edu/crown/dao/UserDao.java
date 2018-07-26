package com.edu.crown.dao;

import com.edu.crown.entity.User;
import org.apache.ibatis.annotations.*;

import java.util.Date;
import java.util.List;

/**
 * Created by Crown on 2018/7/16.
 */
public interface UserDao {
    @Insert("INSERT INTO t_user(username, password) VALUES (#{username,typeHandler=com.edu.crown.config.StringHandlerA}, #{password})")
    int insertUser(User user);
    @Delete("DELETE FROM t_user WHERE id = #{id}")
    int deleteUser(@Param("id") Integer id);
    @Update("UPDATE t_user SET username = #{username}, password = #{password} WHERE id = #{id}")
    int updateUser(User user);

    User selectOne(Integer id);

    List<User> selectAll();
    @Select("select now()")
    Date selectDate();

}