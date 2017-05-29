<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ page import="pl.sdacademy.model.PersonsData" %>
<html>
  <head>
    <title>AddWorker</title>
  </head>

   <body>

    <form action="crud" method="get">
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

     </form>

    </body>
</html>