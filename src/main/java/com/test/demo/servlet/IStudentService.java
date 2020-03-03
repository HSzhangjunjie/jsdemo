package com.test.demo.servlet;

import com.test.demo.beans.Student;

/**
 * @Description:
 * @author: HandSomeMaker
 * @date: 2020/3/3 22:04
 */
public interface IStudentService {
    /**
     * 检查是否正确
     * @param num 学号
     * @param password 密码
     * @return 是否含有该对象
     */
    Student checkUser(String num, String password);

    boolean saveStudent(Student student);
}
