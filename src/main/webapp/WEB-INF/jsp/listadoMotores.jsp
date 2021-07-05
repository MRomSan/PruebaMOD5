<%-- 
    Document   : listadoMotores
    Created on : 05-jul-2021, 13:03:11
    Author     : Manuel
--%>

<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <jsp:include page="cabecera.jsp" flush="true" />
        <title>Listado de Motores</title>
    </head>
    <body>
        <script type="text/javascript">
            function ocultar() {
                $(".mensaje").fadeOut(1500);
            } 
            setTimeout("ocultar()", 3000);
        </script>
        <div class="container">
            <div class="row">
                <div class="col-12 px-0">
                ${cartel}
                </div>
            </div>
            <div class="row d-flex justify-content-md-end py-3">
                <a href="altaMotor.htm" class="btn btn-primary"><i class="fas fa-user-plus"></i> Nuevo</a>
            </div>
            <div class="row">
                <table class="table table-striped">
                    <thead class="table-dark">
                        <tr>
                            <th>Modelo</th>
                            <th>Fabricante</th>
                            <th>Potencia</th>
                            <th>Peso</th>
                            <th>Cantidad</th>
                            <th>Óptimo</th>
                        </tr>
                    </thead>
                    <tbody>
                        <c:forEach var="motor" items="${motores}">
                        <tr>
                            <td><c:out value="${motor.modelo}"></c:out></td>
                            <td><c:out value="${motor.fabricante}"></c:out></td>
                            <td><c:out value="${motor.potencia}"></c:out></td>
                            <td><c:out value="${motor.peso}"></c:out></td>
                            <td><c:out value="${motor.cantidad}"></c:out></td>
                            <td><c:out value="${motor.peso/motor.potencia<=10.0?'Sí':'No'}"></c:out></td>
                        </tr>
                        </c:forEach>
                    </tbody>
                </table>
            </div>
        </div>
    </body>
</html>
