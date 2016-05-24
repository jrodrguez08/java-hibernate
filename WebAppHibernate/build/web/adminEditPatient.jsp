<%-- 
    Document   : adminEditPatient
    Created on : May 23, 2016, 8:47:50 AM
    Author     : j.a.rodriguez.lopez
--%>

<%@page import="java.util.List"%>
<%@page import="Model.*"%>
<%@page import="Service.ListService"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/sql" prefix="sql" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1">
        <link rel="stylesheet" href="css/css/bootstrap.min.css">
        <link href="css/css/bootstrap-select.min.css" rel="stylesheet" type="text/css"/>
        <link rel="stylesheet" href="css/css/style.css">
        <title>Administrador - Agregar Doctor</title>
    </head>
    <%
        ListService service = new ListService();
        List<Patient> patients = service.getAllPatients();
        request.getSession().setAttribute("listPatients", patients);
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
                        <li><a href="adminListDoctor.jsp">Buscar M&eacute;dicos</a></li>
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
                        <h1 class="dashboard-title">Editar Paciente</h1>
                    </div>
                    <div class="row">
                        <div class="col-md-6">
                            <form id="selectPatient" action="EditPatientServlet" method="post">
                                <div class="form-group">
                                    <select class="selectpicker" id="selectEditPatient" name="selectEditPatient" title="Seleccione un Paciente">
                                        <c:forEach items="${listPatients}" var="patient">
                                            <option value="${patient.userId}">${patient.user.fullName}</option>
                                        </c:forEach>
                                    </select>
                                </div>
                                <button type="submit" class="btn btn-primary">Editar</button>
                            </form>
                        </div>
                    </div>
                </div>
            </div>
        </div>
        <script src="js/jquery-2.2.3.min.js" type="text/javascript"></script>
        <script src="js/jquery.validate.min.js" type="text/javascript"></script>
        <script src="js/bootstrap.min.js" type="text/javascript"></script>
        <script src="js/bootstrap-select.min.js" type="text/javascript"></script>
        <script src="js/validations.js" type="text/javascript"></script>
    </body>
</html>
