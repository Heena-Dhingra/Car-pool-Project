<%-- 
    Document   : ses
    Created on : Nov 14, 2018, 12:44:53 PM
    Author     : Dell
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet" type="text/css" href="css/stylefirst.css">
        <title>JSP Page</title>
    </head>
    <body>
        
        <%
//            PrintWriter out = response.getWriter();
            out.println("you are at sesjava");
            session=request.getSession(false);  
            String uname=(String)session.getAttribute("uname");  
        
            out.println("Its nice to see you here "+uname+". Your password: ");
        %>    
        <header>
		<!-- <div class="logo">
			<img src="logo.png">
		</div> -->	
		<div class="title">
			<h2> Choose One! </h2>
		</div>	

		<div class="button">
			<a href="findRide.jsp" class="btn">Find Your Ride</a>
			<a href="offerRide.jsp" class="btn">Offer Ride</a>
		</div>	
	</header>
    </body>
</html>

