<%-- 
    Document   : offerRideDB.jsp
    Created on : Nov 20, 2018, 9:33:33 AM
    Author     : Dell
--%>

<%@page contentType="text/html" pageEncoding="UTF-8" import="java.sql.*"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>offer Ride</title>
    </head>
    <body>
        <%
            String uname=(String)session.getAttribute("uname");  
            response.setContentType("text/html");
            
            String departure = request.getParameter("departure");
            String arrival = request.getParameter("arrival");
            String stopover1 = request.getParameter("stopover1");
            String stopover2 = request.getParameter("stopover2");
            String stopover3 = request.getParameter("stopover3");
            String dateC = request.getParameter("dateC");
            String timeC = request.getParameter("timeC");
            
            try
            {
                String myUrl = "jdbc:mysql://localhost:3306/carpool";
                Class.forName("com.mysql.cj.jdbc.Driver");
                Connection conn = DriverManager.getConnection(myUrl,"root","");
                out.println("Hello 1");

                String query = "insert into car(uname,arrival,departure,stopover1,stopover2,stopover3,dateC,timeC) values(\""+uname+"\", \""+arrival+"\",\""+departure+"\", \""+stopover1+"\", \""+stopover2+"\", \""+stopover3+"\", \""+dateC+"\", \""+timeC+"\")";
                Statement st = conn.createStatement();
                st.executeUpdate(query);
                
//               out.println("values inserted into database");
//                out.println("<form action='ses.jsp'>" +
//                        "<input type='hidden' name='username' value="+uname+">" +
//                        "<input type='hidden' name='password' value="+pass+">" +
//                  "</form>");
//                 session=request.getSession(true);  
                out.println("succesful");
                 session.setAttribute("uname",uname); 
                 response.sendRedirect("vehicle_details.jsp");
              
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
