package com.edu.crown.config;

import org.apache.ibatis.type.BaseTypeHandler;
import org.apache.ibatis.type.JdbcType;

import java.sql.CallableStatement;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Date;

/**
 * Created by Crown on 2018/7/24.
 */
public class StringHandlerA extends BaseTypeHandler<String> {
    //插入
    @Override
    public void setNonNullParameter(PreparedStatement preparedStatement, int i, String s, JdbcType jdbcType) throws SQLException {
        System.err.println(i+"---"+s);
        preparedStatement.setString(i,s+"-with handlers");
    }
    //查询
    @Override
    public String getNullableResult(ResultSet resultSet, String s) throws SQLException {
        System.err.println(resultSet.getString(s));
        return resultSet.getString(s)+"--------";
    }

    @Override
    public String getNullableResult(ResultSet resultSet, int i) throws SQLException {
        System.err.println(i);
        return resultSet.getString(i);
    }

    @Override
    public String getNullableResult(CallableStatement callableStatement, int i) throws SQLException {
        System.err.println(i);
        return callableStatement.getString(i);
    }
}
