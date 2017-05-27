package pl.sdacademy;

import pl.sdacademy.model.PersonsData;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * Created by Andrzej on 27.05.2017.
 */
public class CRUDMain extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        resp.setContentType("text/html");
        PrintWriter out = resp.getWriter();
        String name = req.getParameter("name");
        String lastName = req.getParameter("lastName");
        String age = req.getParameter("age");


       // out.println("<h3>Data " + name + "  " + lastName + "  " +  age +"!</h3>");
      //  req.getRequestDispatcher("/CRUDMain.jsp").forward(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.setAttribute("personsData", new PersonsData(
                req.getParameter("name"),
                req.getParameter("lastName"),
                (Integer.parseInt(req.getParameter("age")))));

    }

}
