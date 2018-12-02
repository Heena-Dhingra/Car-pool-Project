<%-- 
    Document   : start.jsp
    Created on : Nov 21, 2018, 8:30:59 PM
    Author     : Dell
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>LOGIN FORM</title>
        <link rel="stylesheet" href="css/style.css">
    </head>
    <body>
       <div class="box">
			<h2>LOGIN</h2>
			<form action="JSPjdbc.jsp">
				<div class="inputBox">
					<input type="text" name="uname" required>
					<label>Username</label>
				</div>
				<div class="inputBox">
					<input type="Password" name="pass" required>
					<label>Password</label>
				</div>	
				<input type="submit" value="SUBMIT" onclick="return myFunction()"><br><br>
				<a href="register.html">NEW USER?</a><br><br>
                                <a href="forget.jsp">FORGOT PASSWORD?</a>
                                
                                
			</form>
                        <% String message = (String)request.getAttribute("alertMsg");
                            
                        %>
                        <script type="text/javascript">
                            function myFunction()
                            {
                                //window.location.href = "JSPjdbc.jsp";
                                var msg = "<%=message%>";
                                if(msg === null)
                                {
                                    
                                }
                                if(msg !== null)
                                {
                                    alert(msg);
                                    msg = "";
                                }
                                
                            }
                      </script>
		</div>	
    </body>
</html>
