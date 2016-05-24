package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class admin_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\n");
      out.write("        <link rel=\"stylesheet\" href=\"css/css/bootstrap.min.css\">\n");
      out.write("        <link rel=\"stylesheet\" href=\"css/css/style.css\">\n");
      out.write("        <title>Administrador</title>\n");
      out.write("    </head>\n");
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
      out.write("                        <li><a href=\"adminAddPatient.jsp\">Agregar Pacientes</a></li>\n");
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
      out.write("                        <h1 class=\"dashboard-title\">Panel de Administraci&oacute;n</h1>\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"row\">\n");
      out.write("                        <div class=\"panel panel-primary\">\n");
      out.write("                            <div class=\"panel-heading\">\n");
      out.write("                                <h3 class=\"panel-title\">M&eacute;dicos</h3>\n");
      out.write("                            </div>\n");
      out.write("                            <div class=\"panel-body\">\n");
      out.write("                                <div class=\"row\">\n");
      out.write("                                    <div class=\"col-xs-4 col-sm-4 col-md-4\">\n");
      out.write("                                        <p class=\"text-center icon\"><a href=\"adminListDoctor.jsp\"><span class=\"glyphicon glyphicon-search\"></a></span></p>\n");
      out.write("                                        <p class=\"text-center\"><a href=\"adminListDoctor.jsp\">Buscar M&eacute;dicos</a></p>\n");
      out.write("                                    </div>\n");
      out.write("                                    <div class=\"col-xs-4 col-sm-4 col-md-4\">\n");
      out.write("                                        <p class=\"text-center icon\"><a href=\"adminAddDoctor.jsp\"><span class=\"glyphicon glyphicon-plus-sign\"></a></span></p>\n");
      out.write("                                        <p class=\"text-center\"><a href=\"adminAddDoctor.jsp\">Agregar M&eacute;dicos</a></p>\n");
      out.write("                                    </div>\n");
      out.write("                                    <div class=\"col-xs-4 col-sm-4 col-md-4\">\n");
      out.write("                                        <p class=\"text-center icon\"><a href=\"adminEditDoctor.jsp\"><span class=\"glyphicon glyphicon-pencil\"></a></span></p>\n");
      out.write("                                        <p class=\"text-center\"><a href=\"adminEditDoctor.jsp\">Editar M&eacute;dicos</a></p>\n");
      out.write("                                    </div>\n");
      out.write("                                </div>\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"row\">\n");
      out.write("                        <div class=\"panel panel-primary\">\n");
      out.write("                            <div class=\"panel-heading\">\n");
      out.write("                                <h3 class=\"panel-title\">Pacientes</h3>\n");
      out.write("                            </div>\n");
      out.write("                            <div class=\"panel-body\">\n");
      out.write("                                <div class=\"row\">\n");
      out.write("                                    <div class=\"col-xs-4 col-sm-4 col-md-4\">\n");
      out.write("                                        <p class=\"text-center icon\"><a href=\"adminListPatient.jsp\"><span class=\"glyphicon glyphicon-search\"></a></span></p>\n");
      out.write("                                        <p class=\"text-center\"><a href=\"adminListPatient.jsp\">Buscar Pacientes</a></p>\n");
      out.write("                                    </div>\n");
      out.write("                                    <div class=\"col-xs-4 col-sm-4 col-md-4\">\n");
      out.write("                                        <p class=\"text-center icon\"><a href=\"adminAddPatient.jsp\"><span class=\"glyphicon glyphicon-plus-sign\"></a></span></p>\n");
      out.write("                                        <p class=\"text-center\"><a href=\"adminAddPatient.jsp\">Agregar Pacientes</a></p>\n");
      out.write("                                    </div>\n");
      out.write("                                    <div class=\"col-xs-4 col-sm-4 col-md-4\">\n");
      out.write("                                        <p class=\"text-center icon\"><a href=\"#\"><span class=\"glyphicon glyphicon-pencil\"></a></span></p>\n");
      out.write("                                        <p class=\"text-center\"><a href=\"#\">Editar Pacientes</a></p>\n");
      out.write("                                    </div>\n");
      out.write("                                </div>\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("        <script src=\"js/jquery-2.2.3.min.js\" type=\"text/javascript\"></script>\n");
      out.write("        <script src=\"js/bootstrap.min.js\" type=\"text/javascript\"></script>\n");
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
