<%-- 
    Document   : addTodaysMenu
    Created on : Dec 21, 2014, 4:30:27 PM
    Author     : sunil
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        <link rel="stylesheet" href="//netdna.bootstrapcdn.com/bootstrap/3.0.0/css/  bootstrap.min.css">
    </head>
    <body>
        <h1>Add Menu</h1>
        <form:form  method="post" commandName="foodMenuForm" action="addTodaysMenu">
             <table border="0">
                <tr>
                    <td colspan="2" align="center"><h2>Spring MVC Form Demo - MenuItems</h2></td>
                </tr>
                <tr>
                    <td>TeaType:</td>
                    <td><form:input path="teaType" /></td>
                </tr>
                <tr>
                    <td>BreakFast:</td>
                    <td><form:input path="breakFast" /></td>
                </tr>
                 <tr>
                    <td></td>
                    <td><input type="submit" value="submit"/></td>
                </tr>
                
            </table>
        </form:form>
    </body>
</html>
