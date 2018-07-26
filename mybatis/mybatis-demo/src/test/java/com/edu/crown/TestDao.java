package com.edu.crown;

import com.edu.crown.dao.UserDao;
import com.edu.crown.entity.User;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Test;

import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by Crown on 2018/7/16.
 */
public class TestDao {
    @Test
    public void test0() throws Exception {
        InputStream inputStream = Resources.getResourceAsStream("mybatis-config.xml");
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
        SqlSession sqlSession = sqlSessionFactory.openSession();
        UserDao mapper = sqlSession.getMapper(UserDao.class);
        List<User> users = mapper.selectAll();
        for (User user:users
                ) {
            System.out.println(user);
        }
    }

    @Test
    public void test1() throws Exception {
        InputStream inputStream = Resources.getResourceAsStream("mybatis-config.xml");
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
        SqlSession sqlSession = sqlSessionFactory.openSession();
        UserDao userDao = sqlSession.getMapper(UserDao.class);
        User user = new User();
        user.setUsername("sssv");
        user.setPassword("vvvs");
        userDao.insertUser(user);
        sqlSession.commit();
    }

    @Test
    public void test2() throws Exception {
        InputStream inputStream = Resources.getResourceAsStream("mybatis-config.xml");
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
        SqlSession sqlSession = sqlSessionFactory.openSession();
        UserDao userDao = sqlSession.getMapper(UserDao.class);
        User user = userDao.selectOne(7);
        List<User> users = userDao.selectAll();

    }

    @Test
    public void test3() throws Exception {
        ArrayList<Integer> list = new ArrayList<>();
        for (int i =0;i<10;i++){
            list.add(i);
        }
    }
}
