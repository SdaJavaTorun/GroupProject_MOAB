package pl.sdacademy;

import pl.sdacademy.controller.PersonDataController;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * Created by Andrzej on 29.05.2017.
 */
public class ShowWorkersServlet extends HttpServlet {

    @Override
    protected void doGet (HttpServletRequest req, HttpServletResponse resp)
            throws ServletException, IOException {

        resp.setContentType("text/html");

        PersonDataController personDataController = new PersonDataController();

        System.out.printf("" + personDataController.showWorkerList());
        req.setAttribute("workers", personDataController.showWorkerList());
        req.getRequestDispatcher("/showworkers.jsp").forward(req, resp);
    }

    public void doPost (HttpServletRequest req, HttpServletResponse resp)
            throws IOException, ServletException {

        resp.setContentType("text/html");
        PrintWriter out = resp.getWriter();

        out.close();
    }
}