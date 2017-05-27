<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ page import="pl.sdacademy.model.PersonsData" %>
<html>
  <head>
    <title>CRUDOkrutny</title>
  </head>

   <body>

    <form action="crud">
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
               <input type="submit"/>
     </form>

     Name: <c:out value="${personsData.name}" /><br />
     Last Name: <c:out value="${personsData.lastName}" /><br />
     Age: <c:out value="${personsData.age}" /><br />
  </body>
</html>