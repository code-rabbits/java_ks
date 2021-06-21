package com.zut.utils;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.*;
import java.util.Properties;

/**
 * 工具类
 * 提供获取连接及释放资源的方法
*/

public class JDBCUtils {

    static {
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static Connection getConnection(){
        Connection connection=null;
        try{

            String url="jdbc:mysql://localhost:3306/xuanke_system?characterEncoding=utf8&useSSL=false&serverTimezone=UTC&rewriteBatchedStatements=true";
            String username="root";
            String password="123456";
            connection= DriverManager.getConnection(url,username,password);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return connection;
    }

    /**
     * 关闭数据库资源
     * @param conn
     * @param statement
     * @param resultSet
     */
    public static void closeResource(Connection conn,Statement statement,ResultSet resultSet){
        closeResultSet(resultSet);
        closeStatement(statement);
        closeConnection(conn);

    }

    public static void closeResultSet(ResultSet set){
        if(set!=null){
            try {
                set.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }

    public static void closeStatement(Statement statement){
        if(statement!=null){
            try {
                statement.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }
    public static void closeConnection(Connection connection){
        if(connection!=null){
            try {
                connection.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }

}
