<%-- 
    Document   : findRide
    Created on : Nov 15, 2018, 9:21:06 AM
    Author     : Dell
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Find Ride</title>
        <link rel="stylesheet" href="css/style.css">
    </head>
    <body>
        <div class="box">
			<h2>Find Your Ride</h2>
			<form action="#">
				<div class="inputBox">
					<input type="text" name="pickUp" required>
					<label>Leaving from:</label>
				</div>
				<div class="inputBox">
					<input type="text" name="destination" required>
					<label>Going To:</label>
				</div>	
                                <div class="inputBox">
					<input type="date" name="date" required>
					<label>Date:</label>
				</div>
                                <div class="inputBox">
					<input type="time" name="time" required>
					<label>Time:</label>
				</div>
				<input type="submit" value="submit"><br><br>
				
			</form>
		</div>		
    </body>
</html>
