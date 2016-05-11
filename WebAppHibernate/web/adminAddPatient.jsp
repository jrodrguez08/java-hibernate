<%-- 
    Document   : adminAddPatient
    Created on : May 9, 2016, 11:56:45 AM
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
        <title>Administrador - Agregar Paciente</title>
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
                        <li><a href="#">Buscar M&eacute;dicos</a></li>
                        <li><a href="adminAddDoctor.jsp">Agregar M&eacute;dicos</a></li>
                        <li><a href="#">Editar M&eacute;dicos</a></li>
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
                        <h1 class="dashboard-title">Agregar Paciente</h1>
                    </div>
                    <div class="row">
                        <div class="col-md-6">
                            <form id="addPatient" action="RegisterPatientServlet" method="post">
                                <div class="form-group">
                                    <label for="fullName">Nombre Completo</label>
                                    <input type="text" class="form-control" id="fullName" name="fullName" placeholder="Nombre Completo">
                                </div>
                                <div class="form-group">
                                    <label for="userId">Usuario</label>
                                    <input type="text" class="form-control" id="userId" name="userId" placeholder="Usuario">
                                </div>
                                <div class="form-group">
                                    <label for="password">Contrase&ntilde;a</label>
                                    <input type="password" class="form-control" id="password" name="password" placeholder="Contrase&ntilde;a">
                                </div>
                                <div class="form-group">
                                    <label for="confirmPassword">Confirmar Contrase&ntilde;a</label>
                                    <input type="password" class="form-control" id="password" name="confirmPassword" placeholder="Contrase&ntilde;a">
                                </div>
                                <div class="form-group">
                                    <label for="birthDate">Fecha de Nacimiento</label>
                                    <input type="date" class="form-control" id="birthDate" name="birthDate" placeholder="Fecha de Nacimiento">
                                </div>
                                <div class="form-group">
                                    <label for="address">Direcci&oacute;n</label>
                                    <input type="text" class="form-control" id="address" name="address" placeholder="Direcci&oacute;n">
                                </div>
                                <div class="form-group">
                                    <label for="phone">Tel&eacute;fono</label>
                                    <input type="text" class="form-control" id="phone" name="phone" placeholder="Tel&eacute;fono">
                                </div>
                                <div class="form-group">
                                    <label for="email">E-mail</label>
                                    <input type="email" class="form-control" id="email" name="email" placeholder="E-mail">
                                </div>
                                <button type="submit" class="btn btn-primary">Agregar</button>
                            </form>
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
