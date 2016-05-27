<%-- 
    Document   : doctorListPatientRecordByPatient
    Created on : 26/05/2016, 09:44:07 PM
    Author     : Andrés
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
        <title>Doctor - Expediente de Paciente</title>
    </head>
    <%
        ListService service = new ListService();
        List<Patientrecord> patientRecord = service.getAllPatientsRecords();
        request.getSession().setAttribute("listPatientRecord", patientRecord);
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
                        <li><a href="doctorListAppointment.jsp">Listar Citas</a></li>
                        <li><a href="doctorListAllAppointments.jsp">Consultar Citas</a></li>
                        <li><a href="doctorEditAppointment.jsp">Editar Cita</a></li>
                        <li><a href="doctorListPatientsRecords.jsp">Listar Expedientes</a></li>
                        <li><a href="doctorListPatientRecordByPatient.jsp">Editar Expedientes</a></li>
                        <li><a href="doctorAddAppointment.jsp">Agregar Cita</a></li>
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
                        <h1 class="dashboard-title">Expediente de Paciente</h1>
                    </div>
                    <div class="row">
                        <div class="col-md-6">
                            <form id="selectPatient" action="PatientRecordByPatientServlet" method="post">
                                <div class="form-group">
                                    <select class="selectpicker" id="selectEditPatient" name="selectEditPatient" title="Seleccione un Paciente">
                                        <c:forEach items="${listPatientRecord}" var="patientRecord">
                                            <option value="${patientRecord.patientRecordId}">${patientRecord.patient.user.fullName}</option>
                                        </c:forEach>
                                    </select>
                                </div>
                                <button type="submit" class="btn btn-primary">Aceptar</button>
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
