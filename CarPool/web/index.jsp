<%-- 
    Document   : dashboard.jsp
    Created on : Nov 21, 2018, 10:44:18 PM
    Author     : Dell
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8; width=device-width" name="viewport">
        <title>Car pool System</title>
        <meta name="description" name="You can easily share rides here.">
        <meta name="keywords" name="It provides you with option to join a ride or just offer one.">
        <link rel="stylesheet" href="./css/dashboardstyle.css">
    </head>
    <body>
        
        <header>
            <div class="container">
                <div id="brand_name">
                    <h1> <span class="highlight">CAR</span>Pool</h1>
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
        
        
        <section id="one">
            <div class="container">
                <h1><span class="col" > Share</span> Your Ride </h1>
                <p> Carpooling takes the trek out of your journey.</p>
            </div>            
        </section>
                
        <section id="join">
            <div class="container">
                
                <form action="findRideDb.jsp">
                    <input type="text" placeholder="Arrival Point">
                    <input type="text" placeholder="Destination">
                    <input type="time" >
                    <input type="date" >
                    <input type="int" placeholder="Seats Required">
                    <button type="submit" class="button1"><span class="high">Find Ride</span></button>
                </form>
            </div>
        </section>
        
        
        <section id="two">
            <div class="container">
                
                <img src="./images/car.jpg">
                
                <div class="offer">
                    <h3>Driving your own car?</h3>
<!--                    <p>We can help you earn more money along with that.</p>-->
                    <form action="offerRide.jsp">
                    <button class="button2" ><span class="high">Offer a Ride</span></button>
                    </form>
                </div>
            </div>
        </section>
        
        <section id="features">
            <div class="container">
                <ul>
                <div class="feat">
                    <li>
                    
                    <img src="./images/smart.jpg">
                    <h3>Smart</h3>
                    <p>With access to millions of journeys, you can quickly find people nearby travelling your way.</p>
                    
                    </li>
                </div>
                
                <div class="feat">
                    
                        <li>
                    <img src="./images/simple.jpg">
                    <h3>Simple</h3>
                    <p>Enter your exact address to find the perfect ride. Choose who you’d like to travel with. And book!</p>
                        </li>
                    
                
                </div><!--
-->                
                <div class="feat">
                    
                        <li>
                    <img src="./images/seamless.png">
                    <h3>Seamless</h3>
                    <p>Get to your exact destination, without hassle. Carpooling cuts out transfers, queues waiting around station time.</p>
                        </li>
                    
                </div>
</ul>
                
            </div>
        </section>
        
        <footer>
            <p>Car pool &COPY; 2018</p>
        </footer>
    </body>
</html>
