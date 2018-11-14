<%-- 
    Document   : JSPjdbc
    Created on : Nov 1, 2018, 9:36:18 AM
    Author     : Dell
--%>

<%@page contentType="text/html" pageEncoding="UTF-8" import="java.sql.*"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Login</title>
    </head>
    <body>
        <%
            response.setContentType("text/html");
            String uname = request.getParameter("uname");
            String pass = request.getParameter("pass");
            out.println("Hello");
            
            try
            {
                String myUrl = "jdbc:mysql://localhost:3306/carpool";
                Class.forName("com.mysql.cj.jdbc.Driver");
                Connection conn = DriverManager.getConnection(myUrl,"root","");
                out.println("Hello 1");

                String query = "Select uname,pass from users where uname='"+uname+"' and pass ='"+pass+"'";
                Statement st = conn.createStatement();
                ResultSet rs = st.executeQuery(query);
                
               if(rs.next())
                {out.println("Logged in successfully");
                   out.println("Hello "+uname);
//                    out.println("<form action='ses.jsp'>");
//                        out.println("<input type='hidden' name='username' value="+uname+">");
//                       out.println( "<input type='hidden' name='password' value="+pass+">");
//                    out.println("</form>");
//                     session=request.getSession(true);  
                       session.setAttribute("uname",uname);  
                       out.print("<a href='ses.jsp'>visit</a>"); 
                       out.println(" session made");
                       
                } 
               else
                   out.println("Username doesn't exists");
              
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
            
        %>
    </body>
</html>
