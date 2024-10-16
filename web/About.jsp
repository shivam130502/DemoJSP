<%-- 
    Document   : About
    Created on : Oct 15, 2024, 7:11:29 PM
    Author     : shiva
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>About Us</title>
    </head>
    <body>
        
        <%
            if(session.getAttribute("username") == null)
                response.sendRedirect("Login.jsp");
        %>
        
        This is the about us page
    </body>
</html>
