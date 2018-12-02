package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class index_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8; width=device-width\" name=\"viewport\">\n");
      out.write("        <title>Car pool System</title>\n");
      out.write("        <meta name=\"description\" name=\"You can easily share rides here.\">\n");
      out.write("        <meta name=\"keywords\" name=\"It provides you with option to join a ride or just offer one.\">\n");
      out.write("        <link rel=\"stylesheet\" href=\"./css/dashboardstyle.css\">\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        \n");
      out.write("        <header>\n");
      out.write("            <div class=\"container\">\n");
      out.write("                <div id=\"brand_name\">\n");
      out.write("                    <h1> <span class=\"highlight\">CAR</span>Pool</h1>\n");
      out.write("                </div>  \n");
      out.write("                <nav>\n");
      out.write("                    <ul>\n");
      out.write("                        <li class=\"current\"><a href=\"index.jsp\">Home</a></li>\n");
      out.write("                        <li><a href=\"findRide.jsp\">Join Ride</a></li>\n");
      out.write("                        <li><a href=\"offerRide.jsp\">Offer Ride</a></li>\n");
      out.write("                        <li><a href=\"start.jsp\">Login</a></li>\n");
      out.write("                        <li><a href=\"register.html\">Register</a></li>\n");
      out.write("                    </ul>\n");
      out.write("                </nav>\n");
      out.write("            </div>\n");
      out.write("        </header>\n");
      out.write("        \n");
      out.write("        \n");
      out.write("        <section id=\"one\">\n");
      out.write("            <div class=\"container\">\n");
      out.write("                <h1><span class=\"col\" > Share</span> Your Ride </h1>\n");
      out.write("                <p> Carpooling takes the trek out of your journey.</p>\n");
      out.write("            </div>            \n");
      out.write("        </section>\n");
      out.write("                \n");
      out.write("        <section id=\"join\">\n");
      out.write("            <div class=\"container\">\n");
      out.write("                \n");
      out.write("                <form action=\"findRideDb.jsp\">\n");
      out.write("                    <input type=\"text\" placeholder=\"Arrival Point\">\n");
      out.write("                    <input type=\"text\" placeholder=\"Destination\">\n");
      out.write("                    <input type=\"time\" >\n");
      out.write("                    <input type=\"date\" >\n");
      out.write("                    <input type=\"int\" placeholder=\"Seats Required\">\n");
      out.write("                    <button type=\"submit\" class=\"button1\"><span class=\"high\">Find Ride</span></button>\n");
      out.write("                </form>\n");
      out.write("            </div>\n");
      out.write("        </section>\n");
      out.write("        \n");
      out.write("        \n");
      out.write("        <section id=\"two\">\n");
      out.write("            <div class=\"container\">\n");
      out.write("                \n");
      out.write("                <img src=\"./images/car.jpg\">\n");
      out.write("                \n");
      out.write("                <div class=\"offer\">\n");
      out.write("                    <h3>Driving your own car?</h3>\n");
      out.write("<!--                    <p>We can help you earn more money along with that.</p>-->\n");
      out.write("                    <form action=\"offerRide.jsp\">\n");
      out.write("                    <button class=\"button2\" ><span class=\"high\">Offer a Ride</span></button>\n");
      out.write("                    </form>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("        </section>\n");
      out.write("        \n");
      out.write("        <section id=\"features\">\n");
      out.write("            <div class=\"container\">\n");
      out.write("                <ul>\n");
      out.write("                <div class=\"feat\">\n");
      out.write("                    <li>\n");
      out.write("                    \n");
      out.write("                    <img src=\"./images/smart.jpg\">\n");
      out.write("                    <h3>Smart</h3>\n");
      out.write("                    <p>With access to millions of journeys, you can quickly find people nearby travelling your way.</p>\n");
      out.write("                    \n");
      out.write("                    </li>\n");
      out.write("                </div>\n");
      out.write("                \n");
      out.write("                <div class=\"feat\">\n");
      out.write("                    \n");
      out.write("                        <li>\n");
      out.write("                    <img src=\"./images/simple.jpg\">\n");
      out.write("                    <h3>Simple</h3>\n");
      out.write("                    <p>Enter your exact address to find the perfect ride. Choose who you’d like to travel with. And book!</p>\n");
      out.write("                        </li>\n");
      out.write("                    \n");
      out.write("                \n");
      out.write("                </div><!--\n");
      out.write("-->                \n");
      out.write("                <div class=\"feat\">\n");
      out.write("                    \n");
      out.write("                        <li>\n");
      out.write("                    <img src=\"./images/seamless.png\">\n");
      out.write("                    <h3>Seamless</h3>\n");
      out.write("                    <p>Get to your exact destination, without hassle. Carpooling cuts out transfers, queues waiting around station time.</p>\n");
      out.write("                        </li>\n");
      out.write("                    \n");
      out.write("                </div>\n");
      out.write("</ul>\n");
      out.write("                \n");
      out.write("            </div>\n");
      out.write("        </section>\n");
      out.write("        \n");
      out.write("        <footer>\n");
      out.write("            <p>Car pool &COPY; 2018</p>\n");
      out.write("        </footer>\n");
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
