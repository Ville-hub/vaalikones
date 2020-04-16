<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.Statement"%>
<%@page import="java.sql.Connection"%>
<%
String driver = "com.mysql.jdbc.Driver";
String connectionUrl = "jdbc:mysql://localhost:3306/";
String database = "vaalikone";
String userid = "root";
String password = "password";

int id = 1;
try {
Class.forName(driver);
} catch (ClassNotFoundException e) {
e.printStackTrace();
}
Connection connection = null;
Statement statement = null;
String search = String.valueOf(session.getAttribute("Search"));//Search
%>

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
					<%
					try{
						connection = DriverManager.getConnection(connectionUrl+database, userid, password);
						statement=connection.createStatement();
						
						String sql1 ="SELECT EHDOKAS_ID from ehdokkaat where SUKUNIMI='"+search+"' ";
						ResultSet resultSet1 = statement.executeQuery(sql1);
						while(resultSet1.next()){
							id = resultSet1.getInt("EHDOKAS_ID");
						}
						connection.close();
						} catch (Exception e) {
						e.printStackTrace();
						}
						
					try{
						connection = DriverManager.getConnection(connectionUrl+database, userid, password);
						statement=connection.createStatement();
								
						String sql2 ="delete from vastaukset where EHDOKAS_ID='"+id+"' ";
						int resultSet2 = statement.executeUpdate(sql2);
						connection.close();
					} catch (Exception e) {
						e.printStackTrace();
						}
						
					
					try{
						connection = DriverManager.getConnection(connectionUrl+database, userid, password);
						statement=connection.createStatement();
								
						String sql ="delete from ehdokkaat where SUKUNIMI='"+search+"' ";
						int resultSet = statement.executeUpdate(sql);
						connection.close();
					} catch (Exception e) {
						e.printStackTrace();
						}
							

					%>
        							
							Candidate deleted successfully!
							<input type="button" value="Home" 
							onclick="window.location.href='index.html'; return false;">
        </div>
    </body>
</html>