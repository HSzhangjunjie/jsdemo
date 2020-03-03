package com.test.demo.servlet;

import com.test.demo.beans.Student;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * @Description: ${todo}
 * @author: HandSomeMaker
 * @date: 2020/3/3 23:31
 */
@WebServlet(name = "RegisterServlet", urlPatterns = "/RegisterServlet")
public class RegisterServlet extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        //获取表单参数
        String name=request.getParameter("name");
        String age=request.getParameter("age");
        String password=request.getParameter("password");
        String score=request.getParameter("score");
        String num=request.getParameter("num");

        assert name!=null;
        assert age!=null;
        assert password!=null;
        assert score!=null;
        assert num!=null;

        //创建Student对象
        Student student=new Student();
        student.setName(name.trim());
        student.setPassword(password.trim());
        student.setScore(Double.parseDouble(score.trim()));
        student.setNum(num.trim());
        student.setAge(Integer.parseInt(age.trim()));
        //创建Service对象
        IStudentService service=new StudentServiceImpl();
        //调用Service对象的saveStudent方法存入数据库
        boolean result=service.saveStudent(student);
        if (result){
            //写入成功跳转到index.html
            response.sendRedirect(request.getContextPath() + "login.jsp");
        }else {
            //写入失败跳转到注册页面
            response.sendRedirect(request.getContextPath() + "register.jsp");
        }
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doPost(request, response);
    }
}
