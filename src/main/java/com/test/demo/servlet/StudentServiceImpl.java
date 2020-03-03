package com.test.demo.servlet;

import com.test.demo.beans.Student;
import com.test.demo.dao.IStudentDao;
import com.test.demo.dao.IStudentDaoImpl;

/**
 * @Description:
 * @author: HandSomeMaker
 * @date: 2020/3/3 22:06
 */
public class StudentServiceImpl implements IStudentService {
    private IStudentDao dao;

    public StudentServiceImpl() {
        dao = new IStudentDaoImpl();
    }

    @Override
    public Student checkUser(String num, String password) {
        return dao.selectUserLogin(num, password);
    }

    @Override
    public boolean saveStudent(Student student) {
        return dao.insertStudent(student);
    }
}
