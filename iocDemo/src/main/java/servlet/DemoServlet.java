package servlet;


import factory.BeanFactory;
import service.DemoService;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * Created by：Estranger
 * Description：测试servlet
 * Date：2021/5/10 20:50
 */
@WebServlet(urlPatterns = "/demo1")
public class DemoServlet extends HttpServlet {

    DemoService demoService = (DemoService) BeanFactory.getBean("demoService");

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse resp)
            throws ServletException, IOException {
        resp.getWriter().println(demoService.findAll().toString());
    }

}