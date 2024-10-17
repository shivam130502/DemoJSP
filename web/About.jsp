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

           response.setHeader("Cache-Control", "no-cache, no-store, must-revalidate");

        %>
        
        <%  
            String username = null;
            if(session.getAttribute("username") == null)
                response.sendRedirect("Login.jsp");
            username = (String) session.getAttribute("username");
        %>
        
        Hi ${username}, This is the about us page
        
        <form action="Logout" method="get">
            <input type="submit" value="Logout">
        </form>
    </body>
</html>
