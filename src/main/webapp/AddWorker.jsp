<%@ page contentType="text/html;charset=UTF-8" language="java" %>


<html>
  <head>
    <title>AddWorker</title>
  </head>

   <body>

        <table>

            <c:forEach var="i" begin="0" end="${workerList.size()-1}" >
                            <tr>
                                <td><c:out value="${workerList.get(i).name}"/></td>
                                <td><c:out value="  "/></td>
                                <td><c:out value="${workerList.get(i).lastName}"/></td>
                                <td><c:out value="  "/></td>
                                <td><c:out value="${workerList.get(i).age}"/></td>
                                <br/>
                            </tr>
            </c:forEach>
        </table>

    <form action="addworker" method="get">
               <h2>Enter data:</h2>
               <br/>
               Imie:
               <input type="text" size="20" name="name"/>
               <br/>
               Nazwisko:
               <input type="text" size="20" name="lastName"/>
               <br/>
               Wiek:
               <input type="text" size="5" name="age"/>
               <br/>
               <input type="submit" />
               <br/>
               <br/>
               <a href="CRUDMain.jsp">GO BACK!!!</a>
    </form>
  </body>
</html>