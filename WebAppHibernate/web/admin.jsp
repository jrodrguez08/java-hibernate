<%-- 
    Document   : admin
    Created on : May 7, 2016, 9:59:08 PM
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
        <title>Administrador</title>
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
                    <a class="navbar-brand" href="admin.jsp">Herramienta M&eacute;dica</a>
                </div>
                <div class="collapse navbar-collapse" id="bs-example-navbar-collapse-1">
                    <ul class="nav navbar-nav">
                        <li><a href="adminListDoctor.jsp">Buscar M&eacute;dicos</a></li>
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
                        <h1 class="dashboard-title">Panel de Administraci&oacute;n</h1>
                    </div>
                    <div class="row">
                        <div class="panel panel-primary">
                            <div class="panel-heading">
                                <h3 class="panel-title">M&eacute;dicos</h3>
                            </div>
                            <div class="panel-body">
                                <div class="row">
                                    <div class="col-xs-4 col-sm-4 col-md-4">
                                        <p class="text-center icon"><a href="adminListDoctor.jsp"><span class="glyphicon glyphicon-search"></a></span></p>
                                        <p class="text-center"><a href="adminListDoctor.jsp">Buscar M&eacute;dicos</a></p>
                                    </div>
                                    <div class="col-xs-4 col-sm-4 col-md-4">
                                        <p class="text-center icon"><a href="adminAddDoctor.jsp"><span class="glyphicon glyphicon-plus-sign"></a></span></p>
                                        <p class="text-center"><a href="adminAddDoctor.jsp">Agregar M&eacute;dicos</a></p>
                                    </div>
                                    <div class="col-xs-4 col-sm-4 col-md-4">
                                        <p class="text-center icon"><a href="adminEditDoctor.jsp"><span class="glyphicon glyphicon-pencil"></a></span></p>
                                        <p class="text-center"><a href="adminEditDoctor.jsp">Editar M&eacute;dicos</a></p>
                                    </div>
                                </div>
                            </div>
                        </div>
                    </div>
                    <div class="row">
                        <div class="panel panel-primary">
                            <div class="panel-heading">
                                <h3 class="panel-title">Pacientes</h3>
                            </div>
                            <div class="panel-body">
                                <div class="row">
                                    <div class="col-xs-4 col-sm-4 col-md-4">
                                        <p class="text-center icon"><a href="adminListPatient.jsp"><span class="glyphicon glyphicon-search"></a></span></p>
                                        <p class="text-center"><a href="adminListPatient.jsp">Buscar Pacientes</a></p>
                                    </div>
                                    <div class="col-xs-4 col-sm-4 col-md-4">
                                        <p class="text-center icon"><a href="adminAddPatient.jsp"><span class="glyphicon glyphicon-plus-sign"></a></span></p>
                                        <p class="text-center"><a href="adminAddPatient.jsp">Agregar Pacientes</a></p>
                                    </div>
                                    <div class="col-xs-4 col-sm-4 col-md-4">
                                        <p class="text-center icon"><a href="#"><span class="glyphicon glyphicon-pencil"></a></span></p>
                                        <p class="text-center"><a href="#">Editar Pacientes</a></p>
                                    </div>
                                </div>
                            </div>
                        </div>
                    </div>
                </div>
            </div>
        </div>
        <script src="js/jquery-2.2.3.min.js" type="text/javascript"></script>
        <script src="js/bootstrap.min.js" type="text/javascript"></script>
    </body>
</html>
