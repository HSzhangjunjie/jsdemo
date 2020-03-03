package com.test.demo.servlet;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * @Description: ${todo}
 * @author: HandSomeMaker
 * @date: 2020/3/3 23:33
 */
@WebServlet(name = "ToRegisterServlet", urlPatterns = "/ToRegisterServlet")
public class ToRegisterServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.sendRedirect(request.getContextPath() + "register.jsp");
    }
}
