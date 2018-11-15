<%-- 
    Document   : forget
    Created on : Nov 15, 2018, 9:39:11 AM
    Author     : Dell
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Forgot Password:</title>
        <link rel="stylesheet" href="css/style.css">
        
    </head>
    <body>
        <div class="box">
			<h2>Remembering Your Password:</h2>
			<form action = "remember.jsp">
				<div class="inputBox">
					<input type="text" name="forgotColor" required>
					<label>Enter Fav Color :</label>
				</div>
				<div class="inputBox">
					<input type="text" name="forgotCity" required>
					<label>Enter Fav City:</label>
				</div>
                                
                                <div class="inputBox">
					<input type="text" name="forgotSport" required>
					<label>Enter Fav Sport:</label>
				</div>
				<input type="submit" value="submit"><br><br>
				<a href="start.html">Got My Password!</a><br><br>
                                <a href="register.html">Register Again!</a>
			</form>
                        
		</div>
<!--        
//            response.setContentType("text/html");
//            String forgotColor = request.getParameter("forgotColor");
//            String forgotCity = request.getParameter("forgotCity");
//            String forgotSport = request.getParameter("forgotSport");
//            out.println("Hello");
            
            //out.println(forgotColor+" "+forgotCity+" "+forgotSport);
        %>
        <script>
            alert(forgotColor+" "+forgotCity+" "+forgotSport);
            </script>-->

              <% String message = (String)request.getAttribute("alertMsg");%>
              <script type="text/javascript">
                    var msg = "<%=message%>";
                    alert(msg);
                    msg = "";
              </script>
    </body>
</html>
