<%-- 
    Document   : Home
    Created on : 02/09/2019, 03:45:59 PM
    Author     : Usuario
--%>


<%@page import="controlador.Operaciones"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Bienvenidos a Tiendas "PLAZA BEA" </h1>
        <form name = "calcular" action="Home.jsp">
            Operación:
            <input type="text" name="a" id="a" ><br />
            <br />
            
            <input type="button" value="Calcular" onclick="document.calcular.a.value=eval(document.calcular.a.value)" name="Calcular"/><br />

        </form>
        
        
    </body>
</html>
