<%-- 
    Document   : adminListDoctor
    Created on : May 10, 2016, 2:25:29 PM
    Author     : j.a.rodriguez.lopez
--%>


<%@page import="Service.*"%>
<%@page import="Model.*"%>
<%@page import="net.sf.ehcache.hibernate.HibernateUtil"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/sql" prefix="sql" %>
<%@page import="java.util.*,org.hibernate.*,Controller.*"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1">
        <link rel="stylesheet" href="css/css/bootstrap.min.css">
        <link href="css/css/datatables.min.css" rel="stylesheet" type="text/css"/>
        <link rel="stylesheet" href="css/css/style.css">
        <title>Administrador</title>
    </head>
    <%
        ListService service = new ListService();
        List<Doctor> doctors = service.getAllDoctors();
        request.getSession().setAttribute("listDoctors", doctors);
    %>
    <body>
        <nav class="navbar navbar-default">
            <div class="container-fluid">
                <div class="navbar-header">
                    <button type="button" class="navbar-toggle collapsed" data-toggle="collapse" data-target="#bs-example-navbar-collapse-1" aria-expanded="false">
                        <span class="sr-only">Toggle navigation</span>
                        <span class="icon-bar"></span>
                        <span class="icon-bar"></span>
                        <span class="icon-bar"></span>
                    </button>
                    <a class="navbar-brand" href="admin.jsp">Herramienta M&eacute;dica</a>
                </div>
                <div class="collapse navbar-collapse" id="bs-example-navbar-collapse-1">
                    <ul class="nav navbar-nav">
                        <li><a href="adminAddDoctor.jsp">Agregar M&eacute;dicos</a></li>
                        <li><a href="adminEditDoctor.jsp">Editar M&eacute;dicos</a></li>
                        <li><a href="adminListPatient.jsp">Buscar Pacientes</a></li>
                        <li><a href="adminAddPatient.jsp">Agregar Pacientes</a></li>
                        <li><a href="#">Editar Pacientes</a></li>
                    </ul>
                    <ul class="nav navbar-nav navbar-right">
                        <li class="dropdown">
                            <a href="#" class="dropdown-toggle" data-toggle="dropdown" role="button" aria-haspopup="true" aria-expanded="false"><%= request.getSession().getAttribute("currentUser")%> <span class="caret"></span></a>
                            <ul class="dropdown-menu">
                                <li><a href="logout.jsp">Cerrar Sesi&oacute;n</a></li>
                            </ul>
                        </li>
                    </ul>
                </div>
            </div>
        </nav>
        <div class="container-fluid">
            <div class="container">
                <div class="col-md-12">
                    <div class="row">
                        <h1 class="dashboard-title">Lista de M&eacute;dicos</h1>
                    </div>
                    <div class="row">
                        <div class="table-responsive">
                            <table id="doctors" class="table">
                                <thead>
                                <th>Nombre</th>
                                <th>Usuario</th>
                                <th>Tel&eacute;fono</th>
                                <th>Email</th>
                                </thead>
                                <tbody>
                                    <c:forEach items="${listDoctors}" var="doctor">
                                        <tr>
                                            <td><c:out value="${doctor.user.fullName}"></c:out></td>
                                            <td><c:out value="${doctor.userId}"></c:out></td>
                                            <td><c:out value="${doctor.phone}"></c:out></td>
                                            <td><c:out value="${doctor.email}"></c:out></td>
                                            </tr>
                                    </c:forEach>
                                </tbody>
                            </table>
                        </div>
                    </div>
                </div>
            </div>
        </div>
        <script src="js/jquery-2.2.3.min.js" type="text/javascript"></script>
        <script src="js/bootstrap.min.js" type="text/javascript"></script>
        <script src="js/datatables.min.js" type="text/javascript"></script>
        <script src="js/tables.js" type="text/javascript"></script>
    </body>
</html>
