package yncrea.pw03.controller;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import yncrea.pw03.entity.Student;
import yncrea.pw03.service.StudentService;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

/**
 * Created by Emeric on 30/01/2018.
 */

@WebServlet(urlPatterns = "/students")
public class StudentServlet extends HttpServlet {

    private StudentService studentService;
    private ConfigurableApplicationContext configurableApplicationContext;

    @Override
    public void init() throws ServletException {
        configurableApplicationContext = new AnnotationConfigApplicationContext("yncrea.pw03.config");
        studentService = configurableApplicationContext.getBean(StudentService.class);
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        List<Student> students = studentService.findAll();
        req.setAttribute("students",students);
        req.getRequestDispatcher("Students.jsp").forward(req, resp);
    }

    @Override
    public void destroy() {
        configurableApplicationContext.close();
    }

}
