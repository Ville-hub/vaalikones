<!DOCTYPE html>
<!--
To change this license header, choose License Headers in Project Properties.
To change this template file, choose Tools | Templates
and open the template in the editor.
-->
<html>
    <head>
        <title>Diginide vaalikone</title>
        <meta charset="UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <link href="style.css" rel="stylesheet" type="text/css">
        <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css" integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T" crossorigin="anonymous">
        
    </head>
    <body>
        <div id="container">
            
            <img id="headerimg" src="Logo.png" width="720" />
            <div class="kysymys">
                <h1>Vaalikone</h1>
            </div>
                <br>
                
					<form action="/EditCandidateServlet" method="get">

					    <label for="fname">First name:</label><br>
					    <input type="text" id="fname" name="fname"><br>
					    
					    <label for="lname">Last name:</label><br>
					    <input type="text" id="lname" name="lname"><br><br> 
					    
					      <label for="puolue">Puolue</label><br>
					    <input type="text" id="puolue" name="puolue"><br>
					    
					    <label for="kotipaikkakunta">Kotipaikkakunta</label><br>
					    <input type="text" id="kotipaikkakunta" name="kotipaikkakunta"><br><br> 
					    
					      <label for="ika">Ikä</label><br>
					    <input type="number" id="ika" name="ika"><br>
					    
					    <label for="miksieduskuntaan">Miksi eduskuntaan</label><br>
					    <input type="text" id="miksieduskuntaan" name="miksieduskuntaan"><br><br> 
					    
					        <label for="mita_asioita_haluat_edistaa">Mitä asioita haluat edistaa?</label><br>
					    <input type="text" id="mita_asioita_haluat_edistaa" name="mita_asioita_haluat_edistaa"><br>
					    
					    <label for="ammatti">Ammatti</label><br>
					    <input type="text" id="ammatti" name="ammatti"><br><br> 
					    
					    <input type="hidden" id="search" name="search" value="<%=String.valueOf(session.getAttribute("Search"))%>">
					   
					  <br> <br>
					    <input type="submit" name ="submit" value="Submit">
					  </form>					
					    
        </div>
    </body>
</html>