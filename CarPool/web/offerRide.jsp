<%-- 
    Document   : offerRide
    Created on : Nov 15, 2018, 9:27:48 AM
    Author     : Dell
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Offer Ride</title>
        <link rel="stylesheet" href="css/style.css">
    </head>
    <body>
        <div class="box">
			<h2>Offer Ride!</h2>
			<form action="#">
				<div class="inputBox">
					<input type="text" name="departure" required>
					<label>Departure Point:</label>
				</div>
				<div class="inputBox">
					<input type="text" name="arrival" required>
					<label>Arrival Point:</label>
				</div>
                                <div class="inputBox">
					<input type="text" name="stopover1" >
                                        <input type="text" name="stopover2" >
                                        <input type="text" name="stopover3" >
					<label>Stopover Points:</label>
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
