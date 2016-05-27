<%-- 
    Document   : patientListPatientRecordByPatientForm
    Created on : 26/05/2016, 10:41:48 PM
    Author     : Andrés
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
        <title>Paciente - Listar Todas las Citas</title>
    </head>
    <%
        ListService service = new ListService();
        List<Patientappointments> patientAppointments = service.getAllPatientsAppointmentsByPatientId(request.getSession().getAttribute("currentUserId").toString());
        request.getSession().setAttribute("listPatientsAppointments", patientAppointments);
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
                        <li><a href="patientListPatientRecordByPatientForm.jsp">Consultar Expediente</a></li>
                        <li><a href="patientListPatientRecordByPatientForm.jsp">Consultar Cita</a></li>
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
                        <h1 class="dashboard-title">Lista de Citas</h1>
                    </div>
                    <div class="row">
                        <div class="table-responsive">
                            <table id="patients" class="table">
                                <thead>
                                <th>Id Cita</th>
                                <th>Expediente</th>
                                <th>Id Doctor</th>
                                <th>Facha</th>
                                <th>Hora</th>
                                <th>Descripci&oacute;n</th>
                                <th>Resultados</th>
                                </thead>
                                <tbody>
                                    <c:forEach items="${listPatientsAppointments}" var="patientApp">
                                        <tr>
                                            <td><c:out value="${patientApp.id.patientAppointmentsId}"></c:out></td>
                                            <td><c:out value="${patientApp.id.patientRecordId}"></c:out></td>
                                            <td><c:out value="${patientApp.doctor.user.userId}"></c:out></td>
                                            <td><c:out value="${patientApp.date}"></c:out></td>
                                            <td><c:out value="${patientApp.time}"></c:out></td>
                                            <td><c:out value="${patientApp.description}"></c:out></td>
                                            <td><c:out value="${patientApp.results}"></c:out></td>
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