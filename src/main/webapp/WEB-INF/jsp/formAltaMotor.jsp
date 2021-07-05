<%-- 
    Document   : altaMotor
    Created on : 05-jul-2021, 11:27:39
    Author     : Manuel
--%>

<%@taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <jsp:include page="cabecera.jsp" flush="true" />
        <title>Alta de Motor</title>
    </head>
    <body>
        <div class="row">
            <div class="col-6 offset-3">
                <form:form commandName="m">
                    <form:errors path="*" element="div" cssClass="alert alert-danger"></form:errors>
                    <form:label path="modelo">Modelo: </form:label>
                    <form:input path="modelo" cssClass="form-control" />
                    <form:label path="fabricante">Fabricante: </form:label>
                    <form:input path="fabricante" cssClass="form-control" />
                    <form:label path="potencia">Potencia (cv): </form:label>
                    <form:input path="potencia" cssClass="form-control" required="required" />
                    <form:label path="peso">Peso (kg): </form:label>
                    <form:input path="peso" cssClass="form-control" required="required" />
                    <form:label path="cantidad">Cantidad (stock): </form:label>
                    <form:input path="cantidad" cssClass="form-control" required="required" />
                    <button type="submit" class="btn btn-primary">Enviar</button>
                </form:form>
            </div>
        </div>
        
    </body>
</html>
