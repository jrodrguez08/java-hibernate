<%-- 
    Document   : adminPatientError
    Created on : May 10, 2016, 1:42:46 PM
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
        <title>Administrador - Agregar Paciente Error</title>
    </head>
    <body>
        <div class="container-fluid">
            <div class="container">
                <div class="col-md-12 error-container">
                    <div class="row">
                        <h3 class="text-center">Al parecer ha habido un error..!</h3>
                        <p class="text-center">Puede que el paciente que has intentado agregar
                        ya exista en el sistema</p>
                        <p class="text-center">Haz clic <a href="adminAddPatient.jsp">aqu&iacute;</a> 
                            para volver a la p&aacute;gina anterior</p>
                    </div>
                </div>
            </div>
        </div>
        <script src="js/jquery-2.2.3.min.js" type="text/javascript"></script>
        <script src="js/bootstrap.min.js" type="text/javascript"></script>
        <script src="js/jquery.validate.min.js" type="text/javascript"></script>
        <script src="js/validations.js" type="text/javascript"></script>
    </body>
</html>
