package com.test.demo.servlet;

import com.test.demo.beans.Student;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;

/**
 * @Description: ${todo}
 * @author: HandSomeMaker
 * @date: 2020/3/3 21:40
 */
@WebServlet(name = "LoginServlet", urlPatterns = "/LoginServlet")
public class LoginServlet extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        //获取Session
        HttpSession session = request.getSession();
        //接受请求参数
        String num = request.getParameter("num");
        String password = request.getParameter("password");
        if (num == null || "".equals(num.trim()) || password == null || "".equals(password.trim())) {
            session.setAttribute("message", "账号或密码错误，检查后重试");
            response.sendRedirect(request.getContextPath() + "/login.jsp");
        } else {
            //创建Service对象
            IStudentService service = new StudentServiceImpl();
            //调用Service对象的checkUser方法对用户进行验证
            Student student = service.checkUser(num.trim(), password.trim());
            //验证未通过，跳转到登录页面。重新输入登录信息
            if (student == null) {
                session.setAttribute("message", "账号或密码错误，检查后重试");
                response.sendRedirect(request.getContextPath() + "/login.jsp");
            } else {
                //验证通过跳转到系统主页，index.html
                response.sendRedirect(request.getContextPath() + "/index.html");
            }
        }
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doPost(request, response);
    }
}
