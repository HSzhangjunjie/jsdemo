package com.test.demo.dao;

import com.test.demo.beans.Student;

/**
 * @Description:
 * @author: HandSomeMaker
 * @date: 2020/3/3 22:09
 */
public interface IStudentDao {
    /**
     * 查询学号密码
     * @param num 学号
     * @param password 密码
     * @return student对象
     */
    Student selectUserLogin(String num, String password);

    boolean insertStudent(Student student);
}
