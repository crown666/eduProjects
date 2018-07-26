package com.edu.crown.mybatis.version1;

/**
 * Created by Crown on 2018/7/25.
 */
public class SqlSession {
    private Configuration configuration;

    private Executor executor;

    public SqlSession(Configuration configuration, Executor executor) {
        this.configuration = configuration;
        this.executor = executor;
    }
}
