package com.edu.crown.demo;

import org.junit.Test;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

/**
 * Created by Crown on 2018/7/9.
 */
public class JDBCDemo {
    @Test
    public void testInsert(){
        Connection connection = null;
        PreparedStatement preparedStatement = null;
        try {
            //加载驱动
            Class.forName("com.mysql.cj.jdbc.Driver");
            //创建链接
            String url = "jdbc:mysql://localhost:3306/edu?useUnicode=true&characterEncoding=utf-8&useSSL=false&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC";
            String username = "root";
            String password = "root";
            connection = DriverManager.getConnection(url, username, password);
            //
            connection.setAutoCommit(false);
            preparedStatement = connection.prepareStatement("INSERT INTO t_test VALUES (?,?,?)");
            preparedStatement.setInt(1, 1);
            preparedStatement.setString(2,"Corwn");
            preparedStatement.setString(3,"北京");

            int i = preparedStatement.executeUpdate();
            connection.commit();
            System.out.println(i);
        } catch (Exception e) {
            e.printStackTrace();
        }finally {
            try {
                if (preparedStatement!=null)preparedStatement.close();
                if(connection!=null)connection.close();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    @Test
    public void testQuery(){
        Connection connection = null;
        PreparedStatement preparedStatement = null;
        ResultSet resultSet = null;
        try {
            //加载驱动
            Class.forName("com.mysql.cj.jdbc.Driver");
            //创建链接
            String url = "jdbc:mysql://localhost:3306/edu?useUnicode=true&characterEncoding=utf-8&useSSL=false&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC";
            String username = "root";
            String password = "root";
            connection = DriverManager.getConnection(url, username, password);
            //
            preparedStatement = connection.prepareStatement("SELECT * FROM t_test");
            resultSet = preparedStatement.executeQuery();
            while (resultSet.next()){
                System.out.println(resultSet.getInt(1));
                System.out.println(resultSet.getString(2));
                System.out.println(resultSet.getString(3));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }finally {
            try {
                if (preparedStatement!=null)preparedStatement.close();
                if(connection!=null)connection.close();
                if(resultSet!=null)resultSet.close();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
}
