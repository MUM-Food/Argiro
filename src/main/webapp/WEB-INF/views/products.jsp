<%-- 
    Document   : products
    Created on : Dec 24, 2014, 11:17:20 PM
    Author     : sunil
--%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib  prefix="spring" uri="http://www.springframework.org/tags" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        <link rel="stylesheet" href="//netdna.bootstrapcdn.com/bootstrap/3.0.0/css/bootstrap.min.css">
        <script src="https://ajax.googleapis.com/ajax/libs/angularjs/1.0.1/angular.min.js"></script>
        <script src="resources/js/test.js"></script>
        <link rel="stylesheet" href="resources/css/main.css"/>
    </head>
    <body>
        <section>
            <div class="jumbotron">
                <div class="container">
                    <h1>Products title change</h1>
                    <p>All the available products in our store</p>
                </div>
            </div>
        </section>
        <section class="container">
            <div class="row">
                <c:forEach items="${products}" var="product">
                    <div class="col-sm-6 col-md-3" style="padding-bottom: 15px">
                        <div class="thumbnail">
                            <div class="col-md-5">
                                <img src="<c:url value="/resources/images/iphone.jpg">                                     
                                     </c:url>" alt="image" style = "width:100%" />
                            </div>
                            <div class="caption">
                                <h3>${product.name}</h3>
                                <p>${product.description}</p>
                                <p><strong>Item Code : </strong>
                                    <span class="label label-warning">${product.productId}</span>
                                </p>
                                <p>
                                    <strong>Category</strong>: ${product.category}
                                </p>
                                <p>
                                    <strong>Available units in stock</strong>: ${product.unitsInStock}
                                </p>
                                <p>
                                    <strong>Manufacturer</strong>:
                                    ${product.manufacturer}
                                </p>
                                <p>
                                    <strong>Available</strong>:
                                    ${product.unitsInStock} units in stock
                                </p>
                                <h4>$${product.unitPrice} USD</h4>
                                <p>
                                    <a href="<spring:url value="/products/product?id=${product.productId}"/>"
                                       htmlEscape="true" class="btn btn-primary" >
                                        <span class="glyphicon-info-sign glyphicon"/></span> Details                                
                                    </a>
                                </p>                            
                                <p>
                                    <a href="<spring:url value="/products"/>" class="btn btn-warning btn-large">
                                        <span class="glyphicon-shopping-cart glyphicon"></span> 
                                        Order Now
                                    </a>
                                </p>                               
                            </div>
                        </div>
                    </div>
                </c:forEach>      
            </div>
        </section>
    </body>
</html>
