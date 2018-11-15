<%-- 
    Document   : remember
    Created on : Nov 15, 2018, 10:21:31 AM
    Author     : Dell
--%>

<%@page contentType="text/html" pageEncoding="UTF-8" import="java.sql.*"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Remember</title>
    </head>
    <body>
        <%
             response.setContentType("text/html");
                String forgotColor = request.getParameter("forgotColor");
                String forgotCity = request.getParameter("forgotCity");
                String forgotSport = request.getParameter("forgotSport");
                out.println("Hello");
                
                try
                {
                    String myUrl = "jdbc:mysql://localhost:3306/carpool";
                    Class.forName("com.mysql.cj.jdbc.Driver");
                    Connection conn = DriverManager.getConnection(myUrl,"root","");
                    out.println("Hello 1");
                    
                    String query = "Select pass from users where color='"+forgotColor+"' and city ='"+forgotCity+"' and sport='"+forgotSport+"'";
                    Statement st = conn.createStatement();
                    ResultSet rs = st.executeQuery(query);
                    String ans;
                    if(rs.next())
                    {
                        String pass = rs.getString("pass");
                        ans = "Your answers are coreect. Password: "+ pass;
                    } 
                    else
                    { ans = "Your answers doesn't match";}
                    
                    //String ans = forgotColor+" "+forgotCity+" "+forgotSport;
                
                    request.setAttribute("alertMsg",ans );
                    RequestDispatcher rd=request.getRequestDispatcher("/forget.jsp");  
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
                
                
        %>
    </body>
</html>
