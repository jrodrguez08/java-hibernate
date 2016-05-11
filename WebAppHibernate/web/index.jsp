<%-- 
    Document   : index
    Created on : May 5, 2016, 1:56:24 PM
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
        <title>Login</title>
    </head>
    <body>
        <div class="container-fluid">
            <div class="container">
                <form id="login" class="form-signin" action="LoginServlet" method="post">
                    <h2>Inicio de Sesi&oacute;n</h2>
                    <div class="form-group">
                        <label for="user" class="sr-only">User</label>
                        <input type="text" class="form-control" id="user" name="user" placeholder="Usuario" autofocus>
                        <label for="password" class="sr-only">Contrase&ntilde;a</label>
                        <input type="password" class="form-control" id="password" name="password" placeholder="Contrase&ntilde;a">
                    </div>
                    <button class="btn btn-lg btn-primary btn-block" type="submit">Inicio</button>
                </form>
            </div>
        </div>
        <script src="js/jquery-2.2.3.min.js" type="text/javascript"></script>
        <script src="js/jquery.validate.min.js" type="text/javascript"></script>
        <script src="js/bootstrap.min.js" type="text/javascript"></script>
        <script src="js/validations.js" type="text/javascript"></script>
    </body>
</html>
