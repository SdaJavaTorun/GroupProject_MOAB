package pl.sdacademy;

import pl.sdacademy.model.Person;
import pl.sdacademy.controller.PersonDAO;

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
        PersonDAO personDAO = new PersonDAO();

        personDAO.clear();
        personDAO.addWorker(new Person("Andrzej", "Biczyk", 33));
        personDAO.addWorker(new Person("Marta", "Ostrowska", 18));

        req.setAttribute("workers", PersonDAO.getWorkerList());

        req.getRequestDispatcher("AddWorker.jsp").forward(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        req.setAttribute("personsData", new Person(
                                             req.getParameter("name"),
                                             req.getParameter("lastName"),
                                            (Integer.parseInt(req.getParameter("age")))));

        resp.sendRedirect("AddWorker.jsp");
    }
}