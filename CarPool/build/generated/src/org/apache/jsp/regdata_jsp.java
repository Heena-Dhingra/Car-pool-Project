package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.*;

public final class regdata_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("        <title>Register in database</title>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <h1>Hello World!</h1>\n");
      out.write("        ");

            response.setContentType("text/html");
            String uname = request.getParameter("uname");
            String age = request.getParameter("age");
            String email = request.getParameter("email");
            String phone = request.getParameter("phoneno");
            String color = request.getParameter("color");
            String city = request.getParameter("city");
            String sport = request.getParameter("sport");
            String pass = request.getParameter("pass");
            out.println("Hello");
            
            try
            {
                String myUrl = "jdbc:mysql://localhost:3306/carpool";
                Class.forName("com.mysql.cj.jdbc.Driver");
                Connection conn = DriverManager.getConnection(myUrl,"root","");
                out.println("Hello 1");

                String query = "insert into users(uname,age,email,phoneNo,color,city,sport,pass) values(\""+uname+"\", "+age+", \""+email+"\", "+phone+", \""+color+"\", \""+city+"\", \""+sport+"\", \""+pass+"\")";
                Statement st = conn.createStatement();
                st.executeUpdate(query);
                
               //out.println("values inserted into database");
//                out.println("<form action='ses.jsp'>" +
//                        "<input type='hidden' name='username' value="+uname+">" +
//                        "<input type='hidden' name='password' value="+pass+">" +
//                  "</form>");

                 session=request.getSession(true);  
                 session.setAttribute("uname",uname); 
              
                st.close();
            }
            catch(ClassNotFoundException e)
            {
                out.print(e);
            }
            catch(SQLException e)
            {
                out.print(e);
            }
           //out.println("insert into value users(\""+uname+"\", "+age+", \""+email+"\", "+phone+", \""+color+"\", \""+city+"\", \""+sport+"\", \""+pass+"\")"); 
        
      out.write("\n");
      out.write("        <form action=\"dashboard.jsp\">\n");
      out.write("            <input type=\"submit\">\n");
      out.write("        </form>\n");
      out.write("    </body>\n");
      out.write("</html>");
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
