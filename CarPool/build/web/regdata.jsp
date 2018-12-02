<%-- 
    Document   : regdata
    Created on : Nov 14, 2018, 12:51:05 PM
    Author     : Dell
--%>

<%@page contentType="text/html" pageEncoding="UTF-8" import="java.sql.*"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Register in database</title>
    </head>
    <body>
<!--        <h1>Hello World!</h1>-->
        <%
            response.setContentType("text/html");
            String uname = request.getParameter("uname");
            String age = request.getParameter("age");
            String email = request.getParameter("email");
            String phone = request.getParameter("phoneno");
            String color = request.getParameter("color");
            String city = request.getParameter("city");
            String sport = request.getParameter("sport");
            String pass = request.getParameter("pass");
            //out.println("Hello");
            
            try
            {
                String myUrl = "jdbc:mysql://localhost:3306/carpool";
                Class.forName("com.mysql.cj.jdbc.Driver");
                Connection conn = DriverManager.getConnection(myUrl,"root","");
               // out.println("Hello 1");

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
                 
                 RequestDispatcher rd=request.getRequestDispatcher("/index.jsp");  
                    rd.include(request, response);
              
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
        %>
        <form action="dashboard.jsp">
            <input type="hidden">
        </form>
    </body>
</html>