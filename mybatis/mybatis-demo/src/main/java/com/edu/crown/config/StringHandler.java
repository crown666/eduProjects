package com.edu.crown.config;

import org.apache.ibatis.type.JdbcType;
import org.apache.ibatis.type.MappedJdbcTypes;
import org.apache.ibatis.type.TypeHandler;

import java.sql.CallableStatement;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 * Created by Crown on 2018/7/24.
 */
@MappedJdbcTypes(JdbcType.VARCHAR)
public class StringHandler implements TypeHandler<String> {
    //插入操作
    @Override
    public void setParameter(PreparedStatement preparedStatement, int i, String s, JdbcType jdbcType) throws SQLException {
        System.err.println(i+"---"+s);
        preparedStatement.setString(i,s+"-with handlers");
    }
    //查询操作
    @Override
    public String getResult(ResultSet resultSet, String s) throws SQLException {
        System.err.println(resultSet.getString(s));
        return resultSet.getString(s);
    }

    @Override
    public String getResult(ResultSet resultSet, int i) throws SQLException {
        System.err.println(i);
        return resultSet.getString(i);
    }

    @Override
    public String getResult(CallableStatement callableStatement, int i) throws SQLException {
        System.err.println(i);
        return callableStatement.getString(i);
    }
}
