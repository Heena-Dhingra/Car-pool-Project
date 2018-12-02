<%-- 
    Document   : vehicle_details.jsp
    Created on : Nov 21, 2018, 6:37:57 PM
    Author     : Dell
--%>
<%@page contentType="text/html" pageEncoding="UTF-8" import="java.sql.*"%>
<html>
    <head>
        <title>Car Details</title>
        <meta charset="UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <link rel="stylesheet" href="css/vehicle.css">
    </head>
    <body>
        
        <div class="box">
			<h2>Enter Car Details!</h2>
			<form action="vehicleDB.jsp">
				<div class="inputBox">
					<input type="text" name="owner_name" required>
					<label>Car Owner Name:</label>
				</div>
				<div class="inputBox">
					<input type="text" name="car_name" required>
					<label>Car Name:</label>
				</div>
                                
                                <div class="inputBox">
					<input type="text" name="car_num" required>
					<label>Enter car number:</label>
				</div>
                                <div class="inputBox">
					<input type="text" name="car_color" >
					<label>Enter car's color:</label>
				</div>
				<input type="submit" value="submit"><br><br>
				
			</form>
		</div>
       // <%
//            String uname=(String)session.getAttribute("uname");  
//            response.setContentType("text/html");
//            
//            String owner_name = request.getParameter("owner_name");
//            String car_name = request.getParameter("car_name");
//            String car_num = request.getParameter("car_num");
//            String car_color = request.getParameter("car_color");
//            
//            
//            try
//            {
//                String myUrl = "jdbc:mysql://localhost:3306/carpool";
//                Class.forName("com.mysql.cj.jdbc.Driver");
//                Connection conn = DriverManager.getConnection(myUrl,"root","");
//                //out.println("Hello 1");
//
//                String query = "insert into vehicle_details(Driver_name,car_name,car_num,car_color) values(\""+owner_name+"\", \""+car_name+"\",\""+car_num+"\", \""+car_color+"\")";
//                Statement st = conn.createStatement();
//                st.executeUpdate(query);
//                
////               out.println("values inserted into database");
////                out.println("<form action='ses.jsp'>" +
////                        "<input type='hidden' name='username' value="+uname+">" +
////                        "<input type='hidden' name='password' value="+pass+">" +
////                  "</form>");
////                 session=request.getSession(true);  
//                out.println("succesful");
//                 session.setAttribute("uname",uname); 
//                 //response.sendRedirect("vehicle_details.jsp");
//                 System.out.println("your car details have been registered");
//                st.close();
//                
//                RequestDispatcher rd=request.getRequestDispatcher("/index.jsp");  
//                    rd.include(request, response);
//            }
//            catch(ClassNotFoundException e)
//            {
//                out.print(e);
//            }
//            catch(SQLException e)
//            {
//                out.print(e);
//            }
        //%>
    </body>
</html>