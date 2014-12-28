<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@taglib  prefix="spring" uri="http://www.springframework.org/tags" %>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
        <link rel="stylesheet" href="//netdna.bootstrapcdn.com/bootstrap/3.0.0/css/bootstrap.min.css">
        <title>Products</title>
    </head>
    <body>
        <section>
            <div class="jumbotron">
                <div class="container">
                    <h1>Products</h1>
                    <!--<p>Add products</p>-->
                </div>
            </div>
        </section>
        <section class="container">
            <form:form modelAttribute="newProduct" class="form-horizontal">
                <fieldset>
                    <legend><spring:message code="addProduct.form.heading.label"/></legend>
                    <div class="form-group">
                        <label class="control-label col-lg-2 col-lg-2" for="productId"><spring:message code="addProduct.form.productId.label"/></label>
                        <div class="col-lg-10">
                            <form:input id="productId" path="productId" type="text" class="form:input-large"/>
                        </div>
                    </div>
                    <div class="form-group">
                        <label class="control-label col-lg-2 col-lg-2" for="productId"><spring:message code="addProduct.form.name.label"/></label>
                        <div class="col-lg-10">
                            <form:input id="name" path="name" type="text" class="form:input-large"/>
                        </div>
                    </div>       
                    <div class="form-group">
                        <label class="control-label col-lg-2 col-lg-2" for="productId"><spring:message code="addProduct.form.unitPrice.label"/></label>
                        <div class="col-lg-10">
                            <form:input id="unitPrice" path="unitPrice" type="text" class="form:input-large"/>
                        </div>
                    </div>
                    <div class="form-group">
                        <label class="control-label col-lg-2" for="description"><spring:message code="addProduct.form.description.label"/></label>
                        <div class="col-lg-10">
                            <form:textarea id="description" path="description" rows = "2"/>
                        </div>
                    </div>
                    <div class="form-group">
                        <label class="control-label col-lg-2 col-lg-2" for="productId"><spring:message code="addProduct.form.manufacturer.label"/></label>
                        <div class="col-lg-10">
                            <form:input id="manufacturer" path="manufacturer" type="text" class="form:input-large"/>
                        </div>
                    </div>
                    <div class="form-group">
                        <label class="control-label col-lg-2 col-lg-2" for="productId"><spring:message code="addProduct.form.category.label"/></label>
                        <div class="col-lg-10">
                            <form:input id="category" path="category" type="text" class="form:input-large"/>
                        </div>
                    </div>
                    <div class="form-group">
                        <label class="control-label col-lg-2 col-lg-2" for="productId"><spring:message code="addProduct.form.unitInStock.label"/></label>
                        <div class="col-lg-10">
                            <form:input id="unitsInStock" path="unitsInStock" type="text" class="form:input-large"/>
                        </div>
                    </div>
<!--                        <div class="form-group">
                        <label class="control-label col-lg-2 col-lg-2" for="productId">Units In Order</label>
                        <div class="col-lg-10">
                            <form:input id="unitsInOrder" path="unitsInOrder" type="text" class="form:input-large"/>
                        </div>
                    </div>
                    
                    <div class="form-group">
                        <label class="control-label col-lg-2" for="discontinued">Discontinued</label>
                        <div class="col-lg-10">
                            <form:checkbox id="discontinued" path="discontinued"/>
                        </div>
                    </div>-->
                            <%--<form:hidden id="createDate" path="createdDate"  />--%>
                    <div class="form-group">
                        <label class="control-label col-lg-2" for="condition"><spring:message code="addProduct.form.condition.label"/></label>
                        <div class="col-lg-10">
                            <form:radiobutton path="status" value="New" /><spring:message code="addProduct.form.statusNew.label"/>
                            <form:radiobutton path="status" value="Old" /><spring:message code="addProduct.form.statusOld.label"/>
                            <form:radiobutton path="status" value="Refurbished" /><spring:message code="addProduct.form.statusRefurbished.label"/>
                        </div>
                    </div>
                    <div class="form-group">
                        <div class="col-lg-offset-2 col-lg-10">
                            <input type="submit" id="btnAdd" class="btn btn-primary" value ="Add"/>
                        </div>
                    </div>
                </fieldset>
            </form:form>
        </section>
    </body>
</html>