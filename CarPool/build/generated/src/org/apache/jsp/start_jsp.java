package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class start_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("        <title>LOGIN FORM</title>\n");
      out.write("        <link rel=\"stylesheet\" href=\"css/style.css\">\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("       <div class=\"box\">\n");
      out.write("\t\t\t<h2>LOGIN</h2>\n");
      out.write("\t\t\t<form action=\"JSPjdbc.jsp\">\n");
      out.write("\t\t\t\t<div class=\"inputBox\">\n");
      out.write("\t\t\t\t\t<input type=\"text\" name=\"uname\" required>\n");
      out.write("\t\t\t\t\t<label>Username</label>\n");
      out.write("\t\t\t\t</div>\n");
      out.write("\t\t\t\t<div class=\"inputBox\">\n");
      out.write("\t\t\t\t\t<input type=\"Password\" name=\"pass\" required>\n");
      out.write("\t\t\t\t\t<label>Password</label>\n");
      out.write("\t\t\t\t</div>\t\n");
      out.write("\t\t\t\t<input type=\"submit\" value=\"SUBMIT\" onclick=\"return myFunction()\"><br><br>\n");
      out.write("\t\t\t\t<a href=\"register.html\">NEW USER?</a><br><br>\n");
      out.write("                                <a href=\"forget.jsp\">FORGOT PASSWORD?</a>\n");
      out.write("                                \n");
      out.write("                                \n");
      out.write("\t\t\t</form>\n");
      out.write("                        ");
 String message = (String)request.getAttribute("alertMsg");
      out.write("\n");
      out.write("                        <script type=\"text/javascript\">\n");
      out.write("                            function myFunction()\n");
      out.write("                            {\n");
      out.write("                                //window.location.href = \"JSPjdbc.jsp\";\n");
      out.write("                                var msg = \"");
      out.print(message);
      out.write("\";\n");
      out.write("                                if(msg === null)\n");
      out.write("                                {\n");
      out.write("                                    \n");
      out.write("                                }\n");
      out.write("                                if(msg !== null)\n");
      out.write("                                {\n");
      out.write("                                    alert(msg);\n");
      out.write("                                    msg = \"\";\n");
      out.write("                                }\n");
      out.write("                                \n");
      out.write("                            }\n");
      out.write("                      </script>\n");
      out.write("\t\t</div>\t\n");
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
