<%-- 
    Document   : menu
    Created on : May 7, 2016, 2:50:56 PM
    Author     : j.a.rodriguez.lopez
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1">
        <link rel="stylesheet" href="css/css/bootstrap.min.css">
        <link rel="stylesheet" href="css/css/style.css">
        <title>Menu</title>
    </head>
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
                    <a class="navbar-brand" href="#home">Herramienta M&eacute;dica</a>
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
                <div class="row">
                    <div class="col-md-12">
                        <h1 class="dashboard-title">Panel de Doctor</h1>
                    </div>
                </div>
                <div class="row">
                    <div class="panel panel-primary">
                        <div class="panel-heading">
                            <h3 class="panel-title">Citas</h3>
                        </div>
                        <div class="panel-body">
                            <div class="row">
                                <div class="col-xs-4 col-sm-4 col-md-4">
                                    <p class="text-center icon"><a href="doctorListAppointment.jsp.jsp"><span class="glyphicon glyphicon-search"></a></span></p>
                                    <p class="text-center"><a href="doctorListAppointment.jsp">Buscar Citas</a></p>
                                </div>
                                <div class="col-xs-4 col-sm-4 col-md-4">
                                    <p class="text-center icon"><a href="doctorAddAppointment.jsp"><span class="glyphicon glyphicon-plus-sign"></a></span></p>
                                    <p class="text-center"><a href="doctorAddAppointment.jsp">Agregar Citas</a></p>
                                </div>
                                <div class="col-xs-4 col-sm-4 col-md-4">
                                    <p class="text-center icon"><a href="doctorEditAppointment.jsp"><span class="glyphicon glyphicon-pencil"></a></span></p>
                                    <p class="text-center"><a href="doctorEditAppointment.jsp">Editar Citas</a></p>
                                </div>
                            </div>
                        </div>
                    </div>
                </div>
            </div>
        </div>
        <script src="js/jquery-2.2.3.min.js" type="text/javascript"></script>
        <script src="js/jquery.validate.min.js" type="text/javascript"></script>
        <script src="js/bootstrap.min.js" type="text/javascript"></script>
        <script src="js/validations.js" type="text/javascript"></script>
    </body>
</html>
