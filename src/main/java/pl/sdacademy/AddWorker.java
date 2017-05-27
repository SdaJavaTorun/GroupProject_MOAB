package pl.sdacademy;

import pl.sdacademy.model.PersonsData;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by Andrzej on 27.05.2017.
 */
public class AddWorker extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.setAttribute("personsData", new PersonsData(
                req.getParameter("name"),
                req.getParameter("lastName"),
                (Integer.parseInt(req.getParameter("age")))));



        //req.getRequestDispatcher("CRUDMain.jsp").forward(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.setAttribute("personsData", new PersonsData(
                req.getParameter("name"),
                req.getParameter("lastName"),
                (Integer.parseInt(req.getParameter("age")))));

        workerList.add(personData);
        resp.sendRedirect("CRUDMain.jsp");
    }

}