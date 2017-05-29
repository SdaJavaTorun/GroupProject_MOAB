package pl.sdacademy;

import pl.sdacademy.model.PersonsData;
import pl.sdacademy.controller.PersonDataController;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * Created by Andrzej on 27.05.2017.
 */
public class AddWorkerServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.setContentType("text/html");

        PersonDataController personDataController = new PersonDataController();

        personDataController.addWorker(new PersonsData("Andrzej", "Biczyk", 33));
        personDataController.addWorker(new PersonsData("Marta", "Ostrowska", 18));

        req.setAttribute("workers", PersonDataController.showWorkerList());

        req.getRequestDispatcher("AddWorker.jsp").forward(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        req.setAttribute("personsData", new PersonsData(
                                             req.getParameter("name"),
                                             req.getParameter("lastName"),
                                            (Integer.parseInt(req.getParameter("age")))));

        resp.sendRedirect("AddWorker.jsp");
    }
}