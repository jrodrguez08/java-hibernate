package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import Model.Doctor;
import Service.ListService;

public final class adminEditDoctorForm_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

    try {
      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\n");
      out.write("        <link rel=\"stylesheet\" href=\"css/css/bootstrap.min.css\">\n");
      out.write("        <link href=\"css/css/datepicker.css\" rel=\"stylesheet\" type=\"text/css\"/>\n");
      out.write("        <link rel=\"stylesheet\" href=\"css/css/style.css\">\n");
      out.write("        <title>Administrador - Editar M&eacute;dico</title>\n");
      out.write("    </head>\n");
      out.write("    ");

        String userId = request.getSession().getAttribute("doctorToEdit").toString();
        ListService service = new ListService();
        Doctor doctor = service.getDoctor(userId);
        request.getSession().setAttribute("doctorEditable", doctor);
    
      out.write("\n");
      out.write("    <body>\n");
      out.write("        <nav class=\"navbar navbar-default\">\n");
      out.write("            <div class=\"container-fluid\">\n");
      out.write("                <div class=\"navbar-header\">\n");
      out.write("                    <button type=\"button\" class=\"navbar-toggle collapsed\" data-toggle=\"collapse\" data-target=\"#bs-example-navbar-collapse-1\" aria-expanded=\"false\">\n");
      out.write("                        <span class=\"sr-only\">Toggle navigation</span>\n");
      out.write("                        <span class=\"icon-bar\"></span>\n");
      out.write("                        <span class=\"icon-bar\"></span>\n");
      out.write("                        <span class=\"icon-bar\"></span>\n");
      out.write("                    </button>\n");
      out.write("                    <a class=\"navbar-brand\" href=\"admin.jsp\">Herramienta M&eacute;dica</a>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"collapse navbar-collapse\" id=\"bs-example-navbar-collapse-1\">\n");
      out.write("                    <ul class=\"nav navbar-nav\">\n");
      out.write("                        <li><a href=\"adminListDoctor.jsp\">Buscar M&eacute;dicos</a></li>\n");
      out.write("                        <li><a href=\"adminAddDoctor.jsp\">Agregar M&eacute;dicos</a></li>\n");
      out.write("                        <li><a href=\"adminEditDoctor.jsp\">Editar M&eacute;dicos</a></li>\n");
      out.write("                        <li><a href=\"adminListPatient.jsp\">Buscar Pacientes</a></li>\n");
      out.write("                        <li><a href=\"#\">Editar Pacientes</a></li>\n");
      out.write("                    </ul>\n");
      out.write("                    <ul class=\"nav navbar-nav navbar-right\">\n");
      out.write("                        <li class=\"dropdown\">\n");
      out.write("                            <a href=\"#\" class=\"dropdown-toggle\" data-toggle=\"dropdown\" role=\"button\" aria-haspopup=\"true\" aria-expanded=\"false\">");
      out.print( request.getSession().getAttribute("currentUser"));
      out.write(" <span class=\"caret\"></span></a>\n");
      out.write("                            <ul class=\"dropdown-menu\">\n");
      out.write("                                <li><a href=\"logout.jsp\">Cerrar Sesi&oacute;n</a></li>\n");
      out.write("                            </ul>\n");
      out.write("                        </li>\n");
      out.write("                    </ul>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("        </nav>\n");
      out.write("        <div class=\"container-fluid\">\n");
      out.write("            <div class=\"container\">\n");
      out.write("                <div class=\"col-md-12\">\n");
      out.write("                    <div class=\"row\">\n");
      out.write("                        <h1 class=\"dashboard-title\">Editar M&eacute;dico</h1>\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"row\">\n");
      out.write("                        <div class=\"col-md-6\">\n");
      out.write("                            <form id=\"editDoctor\" action=\"EditDoctorFormServlet\" method=\"post\">\n");
      out.write("                                <div class=\"form-group\">\n");
      out.write("                                    <label for=\"fullName\">Nombre Completo</label>\n");
      out.write("                                    <input type=\"text\" class=\"form-control\" id=\"fullName\" name=\"fullName\" placeholder=\"Nombre Completo\">\n");
      out.write("                                </div>\n");
      out.write("                                <div class=\"form-group hide\">\n");
      out.write("                                    <label for=\"userId\">Usuario</label>\n");
      out.write("                                    <input type=\"text\" class=\"form-control\" id=\"userId\" name=\"userId\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${doctorEditable.userId}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\" placeholder=\"Usuario\">\n");
      out.write("                                </div>\n");
      out.write("                                <div class=\"form-group\">\n");
      out.write("                                    <label for=\"password\">Contrase&ntilde;a</label>\n");
      out.write("                                    <input type=\"text\" class=\"form-control\" id=\"password\" name=\"password\" placeholder=\"Contrase&ntilde;a\">\n");
      out.write("                                </div>\n");
      out.write("                                <div class=\"form-group\">\n");
      out.write("                                    <label for=\"phone\">Tel&eacute;fono</label>\n");
      out.write("                                    <input type=\"text\" class=\"form-control\" id=\"phone\" name=\"phone\" placeholder=\"Tel&eacute;fono\">\n");
      out.write("                                </div>\n");
      out.write("                                <div class=\"form-group\">\n");
      out.write("                                    <label for=\"email\">E-mail</label>\n");
      out.write("                                    <input type=\"email\" class=\"form-control\" id=\"email\" name=\"email\"  placeholder=\"E-mail\">\n");
      out.write("                                </div>\n");
      out.write("                                <button type=\"submit\" class=\"btn btn-primary\">Editar</button> <a class=\"btn btn-default\" href=\"admin.jsp\" role=\"button\">Cancelar</a>\n");
      out.write("                            </form>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("        <script src=\"js/jquery-2.2.3.min.js\" type=\"text/javascript\"></script>\n");
      out.write("        <script src=\"js/jquery.validate.min.js\" type=\"text/javascript\"></script>\n");
      out.write("        <script src=\"js/bootstrap.min.js\" type=\"text/javascript\"></script>\n");
      out.write("        <script src=\"js/bootstrap-datepicker.js\" type=\"text/javascript\"></script>\n");
      out.write("        <script src=\"js/validations.js\" type=\"text/javascript\"></script>\n");
      out.write("        <script src=\"js/misc.js\" type=\"text/javascript\"></script>\n");
      out.write("    </body>\n");
      out.write("</html>\n");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
