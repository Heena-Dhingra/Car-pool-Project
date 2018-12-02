package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class findRide_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("        <title>Find Ride</title>\n");
      out.write("        <link rel=\"stylesheet\" href=\"css/findRide.css\">\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        ");

             String uname=(String)session.getAttribute("uname");  
             session.setAttribute("uname",uname); 
        
      out.write("\n");
      out.write("        <div class=\"box\">\n");
      out.write("\t\t\t<h2>Find Your Ride</h2>\n");
      out.write("\t\t\t<form action=\"findRideDB.jsp\">\n");
      out.write("\t\t\t\t<div class=\"inputBox\">\n");
      out.write("\t\t\t\t\t<input type=\"text\" name=\"pickUp\" required>\n");
      out.write("\t\t\t\t\t<label>Leaving from:</label>\n");
      out.write("\t\t\t\t</div>\n");
      out.write("\t\t\t\t<div class=\"inputBox\">\n");
      out.write("\t\t\t\t\t<input type=\"text\" name=\"destination\" required>\n");
      out.write("\t\t\t\t\t<label>Going To:</label>\n");
      out.write("\t\t\t\t</div>\t\n");
      out.write("                                <div class=\"inputBox\">\n");
      out.write("\t\t\t\t\t<input type=\"date\" name=\"date\" title=\"choose date from calender\" required>\n");
      out.write("<!--\t\t\t\t\t<label>Date:</label>-->\n");
      out.write("\t\t\t\t</div>\n");
      out.write("                                <div class=\"inputBox\">\n");
      out.write("\t\t\t\t\t<input type=\"time\" name=\"time\" title=\"enter in 13:40 AM format\" required>\n");
      out.write("<!--\t\t\t\t\t<label>Time:</label>-->\n");
      out.write("\t\t\t\t</div>\n");
      out.write("                                <div class=\"inputBox\">\n");
      out.write("\t\t\t\t\t<input type=\"number\" name=\"seats\" min=\"1\" max=\"3\"required>\n");
      out.write("\t\t\t\t\t<label>Seats Required:</label>\n");
      out.write("\t\t\t\t</div>\n");
      out.write("\t\t\t\t<input type=\"submit\" value=\"submit\"><br><br>\n");
      out.write("\t\t\t\t\n");
      out.write("\t\t\t</form>\n");
      out.write("\t\t</div>\t\t\n");
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
