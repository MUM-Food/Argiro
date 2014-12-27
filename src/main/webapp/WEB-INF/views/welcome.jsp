<%-- 
    Document   : welcome
    Created on : Dec 19, 2014, 7:42:31 PM
    Author     : sunil
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet" href="//netdna.bootstrapcdn.com/
              bootstrap/3.0.0/css/bootstrap.min.css">
        <title>JSP Page</title>
        <link rel="stylesheet" href="resources/css/main.css"/>
    </head>
    <body>
         <h1>BBBBBBB</h1>
        <section>
            <h1>TTTTTTTTTTTTTT</h1>
            <div class="jumbotron">
                <div class="container">
                    <h1>${greeting}</h1>
                    <p>${tagline}</p>
                    <p>${studentInfo.studentFullName}</p> 
                     <p>${studentInfo.year}</p>
                     <form>
                         <a href="<spring:url value="/details?id=${studentInfo.year}" htmlEscape="true"/>" class="btn btndefault">Details</a>
                         <a href="<spring:url value="/todaysMenu" htmlEscape="true"/>" class="btn btndefault">Todays Menu</a>
                
                    </form>
                </div>                
            </div>
        </section>
    </body>
</html>
