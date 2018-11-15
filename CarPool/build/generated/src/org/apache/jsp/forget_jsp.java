package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class forget_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("        <title>Forgot Password:</title>\n");
      out.write("        <link rel=\"stylesheet\" href=\"css/style.css\">\n");
      out.write("        \n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <div class=\"box\">\n");
      out.write("\t\t\t<h2>Remembering Your Password:</h2>\n");
      out.write("\t\t\t<form action = \"remember.jsp\">\n");
      out.write("\t\t\t\t<div class=\"inputBox\">\n");
      out.write("\t\t\t\t\t<input type=\"text\" name=\"forgotColor\" required>\n");
      out.write("\t\t\t\t\t<label>Enter Fav Color :</label>\n");
      out.write("\t\t\t\t</div>\n");
      out.write("\t\t\t\t<div class=\"inputBox\">\n");
      out.write("\t\t\t\t\t<input type=\"text\" name=\"forgotCity\" required>\n");
      out.write("\t\t\t\t\t<label>Enter Fav City:</label>\n");
      out.write("\t\t\t\t</div>\n");
      out.write("                                \n");
      out.write("                                <div class=\"inputBox\">\n");
      out.write("\t\t\t\t\t<input type=\"text\" name=\"forgotSport\" required>\n");
      out.write("\t\t\t\t\t<label>Enter Fav Sport:</label>\n");
      out.write("\t\t\t\t</div>\n");
      out.write("\t\t\t\t<input type=\"submit\" value=\"submit\"><br><br>\n");
      out.write("\t\t\t\t<a href=\"start.html\">Got My Password!</a><br><br>\n");
      out.write("                                <a href=\"register.html\">Register Again!</a>\n");
      out.write("\t\t\t</form>\n");
      out.write("                        \n");
      out.write("\t\t</div>\n");
      out.write("<!--        \n");
      out.write("//            response.setContentType(\"text/html\");\n");
      out.write("//            String forgotColor = request.getParameter(\"forgotColor\");\n");
      out.write("//            String forgotCity = request.getParameter(\"forgotCity\");\n");
      out.write("//            String forgotSport = request.getParameter(\"forgotSport\");\n");
      out.write("//            out.println(\"Hello\");\n");
      out.write("            \n");
      out.write("            //out.println(forgotColor+\" \"+forgotCity+\" \"+forgotSport);\n");
      out.write("        %>\n");
      out.write("        <script>\n");
      out.write("            alert(forgotColor+\" \"+forgotCity+\" \"+forgotSport);\n");
      out.write("            </script>-->\n");
      out.write("\n");
      out.write("              ");
 String message = (String)request.getAttribute("alertMsg");
      out.write("\n");
      out.write("              <script type=\"text/javascript\">\n");
      out.write("                    var msg = \"");
      out.print(message);
      out.write("\";\n");
      out.write("                    alert(msg);\n");
      out.write("                    msg = \"\";\n");
      out.write("              </script>\n");
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
