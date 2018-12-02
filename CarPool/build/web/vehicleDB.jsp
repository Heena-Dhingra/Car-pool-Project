<%-- 
    Document   : vehicleDB.jsp
    Created on : Nov 22, 2018, 10:41:30 AM
    Author     : Dell
--%>

<%@page contentType="text/html" pageEncoding="UTF-8" import="java.sql.*"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
                <link rel="stylesheet" href="css/vehicleDBstyle.css">

    </head>
    <body>
        <h1>Hello World!</h1>
        <%
            String uname=(String)session.getAttribute("uname");  
            response.setContentType("text/html");
            
            String owner_name = request.getParameter("owner_name");
            String car_name = request.getParameter("car_name");
            String car_num = request.getParameter("car_num");
            String car_color = request.getParameter("car_color");
            
            
            
            try
            {
                String myUrl = "jdbc:mysql://localhost:3306/carpool";
                Class.forName("com.mysql.cj.jdbc.Driver");
                Connection conn = DriverManager.getConnection(myUrl,"root","");
                //out.println("Hello 1");

                String query = "insert into vehicle_details(Driver_name,car_name,car_num,car_color) values(\""+owner_name+"\", \""+car_name+"\",\""+car_num+"\", \""+car_color+"\")";
                
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
                 //response.sendRedirect("vehicle_details.jsp");
                 System.out.println("your car details have been registered");
                 
                 RequestDispatcher rd=request.getRequestDispatcher("/index.jsp");  
                    rd.include(request, response);
                st.close();
//                
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
