package com.test.demo.utils;


import java.sql.*;

/**
 * @Description:
 * @author: HandSomeMaker
 * @date: 2020/3/3 22:12
 */
public class JdbcUtils {
    //加载DB驱动
    static {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }

    //获取Collection对象
    public static Connection getCollection() throws SQLException {
        String url = "jdbc:mysql//localhost:3306/studentweb";
        String user = "root";
        String password = "123456";
        return DriverManager.getConnection(url, user, password);
    }

    //关闭资源
    public static void close(Connection connection, Statement statement, ResultSet set) throws SQLException {
        if (set != null && set.isClosed()) {
            set.close();
        }
        if (statement != null && statement.isClosed()) {
            statement.close();
        }
        if (connection != null && connection.isClosed()) {
            connection.close();
        }
    }
}
