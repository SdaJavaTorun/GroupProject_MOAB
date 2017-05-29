<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<html>
  <head>
    <title>ShowWorker</title>
  </head>

   <body>

        <div>

        <h2>Lista pracownikow:</h2><br/><br/>

        <c:forEach var="i" begin="0" end="${workers.size()-1}" >
                            <tr>
                                <td><c:out value="${workers.get(i).name}"/></td>
                                <td><c:out value="  "/></td>
                                <td><c:out value="${workers.get(i).lastName}"/></td>
                                <td><c:out value="  "/></td>
                                <td><c:out value="${workers.get(i).age}"/></td>
                                <br/>
                            </tr>



        </div>
   </body>
</html>