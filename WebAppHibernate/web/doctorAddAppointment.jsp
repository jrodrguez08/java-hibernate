<%-- 
    Document   : doctorAddAppointment
    Created on : 18/05/2016, 09:45:13 PM
    Author     : Andrés
--%>


<%@page import="java.util.List"%>
<%@page import="Model.Patient"%>
<%@page import="Model.Doctor"%>
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
        <link href="css/css/datepicker.css" rel="stylesheet" type="text/css"/>
        <link href="css/css/jasny-bootstrap.min.css" rel="stylesheet" type="text/css"/>
        <link href="css/css/bootstrap-select.min.css" rel="stylesheet" type="text/css"/>
        <link rel="stylesheet" href="css/css/style.css">
        <title>Doctor - Agregar Cita</title>
    </head>
    <%
        ListService service = new ListService();
        List<Doctor> doctors = service.getAllDoctors();
        request.getSession().setAttribute("listDoctors", doctors);
        
        ListService service2 = new ListService();
        List<Patient> patients = service2.getAllPatients();
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
                    <a class="navbar-brand" href="doctor.jsp">Herramienta M&eacute;dica</a>
                </div>
                <div class="collapse navbar-collapse" id="bs-example-navbar-collapse-1">
                    <ul class="nav navbar-nav">
                        <li><a href="doctorListAppointment.jsp">Listar Citas</a></li>
                        <li><a href="#">Consultar Citas</a></li>
                        <li><a href="#">Editar Cita</a></li>
                        <li><a href="#">Listar Expedientes</a></li>
                        <li><a href="#">Editar Expedientes</a></li>
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
                        <h1 class="dashboard-title">Agregar Cita</h1>
                    </div>
                    <div class="row">
                        <div class="col-md-6">
                            <form id="addAppointment" action="RegisterAppointmentServlet" method="post">
                                <div class="form-group">
                                    <label for="appointmentDate">Fecha de la cita</label>
                                    <input type="date" class="form-control" id="appointmentDate" name="appointmentDate" data-date-format="mm/dd/yyyy" placeholder="Fecha de la cita">
                                </div>
                                <div class="form-group">
                                    <label for="appointmentTime">Hora de la cita</label>
                                    <input type="time" class="form-control" id="appointmentTime" name="appointmentTime" data-time-format="hh:mm" placeholder="Fecha de la cita">
                                </div>
                                <div class="form-group">
                                    <select class="selectpicker" id="selectEditDoctor" name="selectEditDoctor" title="Seleccione un M&eacute;dico">
                                        <c:forEach items="${listDoctors}" var="doctor">
                                            <option value="${doctor.userId}">${doctor.user.fullName}</option>
                                        </c:forEach>
                                    </select>
                                </div>
                                <div class="form-group">
                                    <select class="selectpicker" id="selectEditPatient" name="selectEditPatient" title="Seleccione un Paciente">
                                        <c:forEach items="${listPatients}" var="patient">
                                            <option value="${patient.userId}">${patient.user.fullName}</option>
                                        </c:forEach>
                                    </select>
                                </div>
                                <div class="form-group">
                                    <label for="description">Descripci&oacute;n</label>
                                    <input type="text" class="form-control" id="description" name="description" placeholder="Descripci&oacute;n">
                                </div>
                                <div class="form-group">
                                    <label for="results">Resultados</label>
                                    <input type="text" class="form-control" id="results" name="results" placeholder="Resultados">
                                </div>
                                <button type="submit" class="btn btn-primary">Agregar</button> <a class="btn btn-default" href="doctor.jsp" role="button">Cancelar</a>
                            </form>
                        </div>
                    </div>
                </div>
            </div>
        </div>
        <script src="js/jquery-2.2.3.min.js" type="text/javascript"></script>
        <script src="js/jquery.validate.min.js" type="text/javascript"></script>
        <script src="js/bootstrap.min.js" type="text/javascript"></script>
        <script src="js/bootstrap-datepicker.js" type="text/javascript"></script>
        <script src="js/bootstrap-select.min.js" type="text/javascript"></script>
        <script src="js/jasny-bootstrap.min.js" type="text/javascript"></script>
        <script src="js/validations.js" type="text/javascript"></script>
        <script src="js/misc.js" type="text/javascript"></script>
    </body>
</html>
