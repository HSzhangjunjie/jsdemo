package com.test.demo.dao;

import com.test.demo.beans.Student;
import com.test.demo.utils.JdbcUtils;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 * @Description:
 * @author: HandSomeMaker
 * @date: 2020/3/3 22:09
 */
public class IStudentDaoImpl implements IStudentDao {
    private Connection connection;
    private PreparedStatement statement;
    private ResultSet set;

    @Override
    public Student selectUserLogin(String num, String password) {
        Student student = null;
        try {
            connection = JdbcUtils.getCollection();
            String sql = "SELECT * from student where num=? and password=?";
            statement = connection.prepareStatement(sql);
            statement.setString(1, num);
            statement.setString(2, password);
            set = statement.executeQuery();
            if (set.next()) {
                student = new Student();
                student.setAge(set.getInt("age"));
                student.setId(set.getInt("id"));
                student.setName(set.getString("name"));
                student.setNum(set.getString("num"));
                student.setScore(set.getDouble("score"));
                student.setPassword(set.getString("password"));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            try {
                JdbcUtils.close(connection, statement, set);
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
        return student;
    }

    @Override
    public boolean insertStudent(Student student) {
        boolean isOk=true;
        try {
            connection = JdbcUtils.getCollection();
            String sql = "INSTER INTO student(num,password,name,age,score) values (?,?,?,?,?)";
            statement = connection.prepareStatement(sql);
            statement.setString(1, student.getNum());
            statement.setString(2, student.getPassword());
            statement.setString(3, student.getName());
            statement.setInt(4, student.getAge());
            statement.setDouble(5, student.getScore());
        } catch (SQLException e) {
            e.printStackTrace();
            isOk=false;
        } finally {
            try {
                JdbcUtils.close(connection, statement, set);
            } catch (SQLException ex) {
                ex.printStackTrace();
            }
        }
        return isOk;
    }
}
