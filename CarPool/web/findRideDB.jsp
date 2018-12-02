<%-- 
    Document   : findRideDB
    Created on : Nov 20, 2018, 9:23:34 AM
    Author     : Dell
--%>

<%@page contentType="text/html" pageEncoding="UTF-8" import="java.sql.*"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Joining Ride</title>
        <link rel="stylesheet" href="./css/findDBstyle.css">
    </head>
    <body>
        <header>
            <div class="container">
                <div id="brand_name">
                    <h1> <span class="highlight">Car</span> Pool</h1>
                </div>  
                <nav>
                    <ul>
                        <li class="current"><a href="index.jsp">Home</a></li>
                        <li><a href="findRide.jsp">Join Ride</a></li>
                        <li><a href="offerRide.jsp">Offer Ride</a></li>
                        <li><a href="start.jsp">Login</a></li>
                        <li><a href="register.html">Register</a></li>
                    </ul>
                </nav>
            </div>
        </header>
        <section id="info">
        <%
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
                %>
                <h3>
                <%
                out.println("Available Drivers Are:");
                %>
                </h3>
                <section id="driver">
                <%
                if(rs1.next())
                {
                    String driver = rs1.getString("Driver_name");
                    String car_name = rs1.getString("car_name");
                    String car_num = rs1.getString("car_num");
                    String car_color = rs1.getString("car_color");
                    
                    %>
                    <section id="content">
                    <p>    
                    <%
                    out.println(" Driver's name: "+driver);
                    %></p>
                    <p><%
                    out.println("Car name: "+car_name);%> </p>
                    <p>
                    <%
                    out.println(" Car number: "+car_num);
                    %></p>
                    <p>
                    <%
                    out.println(" Car color: "+car_color);
                    out.println();
                    out.println();
                    %>
                    </p>
                    </section>
                </section>
                    <%
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
    %>
        </section>
    </body>
</html>
