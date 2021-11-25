package hu.app.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import hu.app.service.UserValidationService;

@WebServlet(urlPatterns = "/login.do.jsp")
public class LoginServletWithJsp extends HttpServlet {

    private final UserValidationService userValidationService = new UserValidationService();

    //http://localhost:8080/login.do.jsp?name=LoginServletWithJsp&type=javaServlet
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        request.setCharacterEncoding("UTF-8");

        request.setAttribute("name", request.getParameter("name"));
        request.setAttribute("type", request.getParameter("type"));

        request.getRequestDispatcher("/WEB-INF/views/login.jsp").forward(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        request.setCharacterEncoding("UTF-8");

        String name = request.getParameter("name");
        String password = request.getParameter("password");

        if(userValidationService.isUserValid(name, password)){
            request.setAttribute("name", name);
            request.getRequestDispatcher("/WEB-INF/views/welcome.jsp").forward(request, response);
        }else{
            request.setAttribute("errorMessage", "Invalid Credentials!");
            request.getRequestDispatcher("/WEB-INF/views/login.jsp").forward(request, response);
        }
    }
}
