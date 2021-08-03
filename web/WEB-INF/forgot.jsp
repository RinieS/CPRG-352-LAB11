<%-- 
    Document   : forgot
    Created on : Aug 2, 2021, 10:11:15 PM
    Author     : 840979
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Forgot Password</h1>
        <h4>Please enter your email address to retrieve your password</h4>
        <form action="forgot" method="post">
            Email:
            <input type="email" name="email"/><br>
            
            <input type="submit" name="action" value="Submit" />
                 
        </form> 
        <p>${msg}</p>
    </body>
</html>
