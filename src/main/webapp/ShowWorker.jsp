<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<html>
  <head>
    <title>ShowWorker</title>
  </head>
    <body>

        <div>
            <h2>Lista pracownikow:</h2><br/><br/>
                <table>

                     <c:forEach items="${workers}" var="worker">
                            <tr>
                                <td><c:out value="${worker.name}"/></td>
                                <td><c:out value="  "/></td>
                                <td><c:out value="${worker.lastName}"/></td>
                                <td><c:out value="  "/></td>
                                <td><c:out value="${worker.age}"/></td>
                                <br/>
                            </tr>
                     </c:forEach>
                </table>
        </div>

    </body>
</html>