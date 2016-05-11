<%-- 
    Document   : logout
    Created on : May 10, 2016, 10:43:04 AM
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
        <title>Cerrar sesi&oacute;n</title>
    </head>
    <body>
        <%     
         session.removeAttribute("user");
         session.removeAttribute("currentUser");
         session.invalidate();
     %>
        <div class="container-fluid">
            <div class="container">
                <div class="col-md-12 error-container">
                    <div class="row">
                        <h3 class="text-center">Has finalizado la sesi&oacute;n</h3>
                        <p class="text-center">Haz clic <a href="index.jsp">aqu&iacute;</a> para volver a la p&aacute;gina 
                            de inicio de sesi&oacute;n</p>
                    </div>
                </div>
            </div>
        </div>
    </body>
</html>
