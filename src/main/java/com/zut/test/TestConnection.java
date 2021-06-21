package com.zut.test;

import com.zut.utils.JDBCUtils;

import java.sql.Connection;

public class TestConnection {
    public static void main(String[] args) throws Exception{

        Connection connection = JDBCUtils.getConnection();
        System.out.println(connection);
        JDBCUtils.closeConnection(connection);
    }
}
