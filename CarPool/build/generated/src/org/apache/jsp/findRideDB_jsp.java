package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.*;

public final class findRideDB_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("        <title>Joining Ride</title>\n");
      out.write("        <link rel=\"stylesheet\" href=\"./css/findDBstyle.css\">\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <header>\n");
      out.write("            <div class=\"container\">\n");
      out.write("                <div id=\"brand_name\">\n");
      out.write("                    <h1> <span class=\"highlight\">Car</span> Pool</h1>\n");
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
      out.write("        <section id=\"info\">\n");
      out.write("        ");

            response.setContentType("text/html");
            String uname=(String)session.getAttribute("uname");  
            response.setContentType("text/html");
            
            //from passenger
            String pickUp = request.getParameter("pickUp");
            String destination = request.getParameter("destination");
            String date = request.getParameter("date");
            String time = request.getParameter("time");
            String seats = request.getParameter("seats");
            String name = null;
            
            try
            {
                String myUrl = "jdbc:mysql://localhost:3306/carpool";
                Class.forName("com.mysql.cj.jdbc.Driver");
                Connection conn = DriverManager.getConnection(myUrl,"root","");
                String query = " select uname from car where (arrival='"+pickUp+"' or stopover1='"+pickUp+"' or stopover2='"+pickUp+"' or stopover3='"+pickUp+"') and (stopover1='"+destination+"' or stopover2='"+destination+"' or stopover3='"+destination+"' or departure='"+destination+"');";
                
                Statement st = conn.createStatement();
                
                ResultSet rs = st.executeQuery(query);
                if(rs.next())
                {
                    name = rs.getString("uname");
                    //out.println("success");
                }
                else
                {
                    out.println("Car pool for this route is not available");
                }
                //out.println(name);
                String query1 = "select Driver_name, car_name, car_num, car_color from vehicle_details where Driver_name = '"+name+"'";
                //out.println(query1);
                
                ResultSet rs1 = st.executeQuery(query1);
                
      out.write("\n");
      out.write("                <h3>\n");
      out.write("                ");

                out.println("Available Drivers Are:");
                
      out.write("\n");
      out.write("                </h3>\n");
      out.write("                <section id=\"driver\">\n");
      out.write("                ");

                if(rs1.next())
                {
                    String driver = rs1.getString("Driver_name");
                    String car_name = rs1.getString("car_name");
                    String car_num = rs1.getString("car_num");
                    String car_color = rs1.getString("car_color");
                    
                    
      out.write("\n");
      out.write("                    <section id=\"content\">\n");
      out.write("                    <p>    \n");
      out.write("                    ");

                    out.println(" Driver's name: "+driver);
                    
      out.write("</p>\n");
      out.write("                    <p>");

                    out.println("Car name: "+car_name);
      out.write(" </p>\n");
      out.write("                    <p>\n");
      out.write("                    ");

                    out.println(" Car number: "+car_num);
                    
      out.write("</p>\n");
      out.write("                    <p>\n");
      out.write("                    ");

                    out.println(" Car color: "+car_color);
                    out.println();
                    out.println();
                    
      out.write("\n");
      out.write("                    </p>\n");
      out.write("                    </section>\n");
      out.write("                </section>\n");
      out.write("                    ");

                }
                else
                {
                    out.println("No Driver Available");
                }
            }
            catch(ClassNotFoundException e)
            {
                out.print(e);
            }
            catch(SQLException e)
            {
                out.print(e);
            }
            
            
        
        //out.println(" select uname from car where (arrival='"+pickUp+"' or stopover1='"+pickUp+"' or stopover2='"+pickUp+"' or stopover3='"+pickUp+"') and (stopover1='"+destination+"' or stopover2='"+destination+"' or stopover3='"+destination+"' or departure='"+destination+"');");
    
      out.write("\n");
      out.write("        </section>\n");
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
