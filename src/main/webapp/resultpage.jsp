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
String search=request.getParameter("search");
String search2 = search;
session.setAttribute("Search",search2);
try {
Class.forName(driver);
} catch (ClassNotFoundException e) {
e.printStackTrace();
}
Connection connection = null;
Statement statement = null;
ResultSet resultSet = null;
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

					<table border="1">
					<tr>
					<td>Ehdokas ID</td>
					<td>Sukunimi</td>
					<td>Etunimi</td>
					<td>Puolue</td>
					<td>Kotipaikkakunta</td>
					<td>Ika</td>
					<td>Miksi Eduskuntaan</td>
					<td>Mita Asioita Haluat Edistaa</td>
					<td>Ammatti</td>
					<td></td>
					<td></td>
					</tr>
					<%
					try{
					connection = DriverManager.getConnection(connectionUrl+database, userid, password);
					statement=connection.createStatement();
					String sql ="select * from ehdokkaat where SUKUNIMI='"+search+"' ";
					resultSet = statement.executeQuery(sql);
					while(resultSet.next()){
					%>
					<tr>
					<td><%=resultSet.getInt("EHDOKAS_ID") %></td>
					<td><%=resultSet.getString("SUKUNIMI") %></td>
					<td><%=resultSet.getString("ETUNIMI") %></td>
					<td><%=resultSet.getString("PUOLUE") %></td>
					<td><%=resultSet.getString("KOTIPAIKKAKUNTA") %></td>
					<td><%=resultSet.getInt("IKA") %></td>
					<td><%=resultSet.getString("MIKSI_EDUSKUNTAAN") %></td>
					<td><%=resultSet.getString("MITA_ASIOITA_HALUAT_EDISTAA") %></td>
					<td><%=resultSet.getString("AMMATTI") %></td>
					<td><input type="button" value="Edit" 
					onclick="window.location.href='editcandidate.jsp'; return false;"></td>
					<td><input type="button" value="Delete" 
					onclick="window.location.href='deletesuccess.jsp'; return false;"></td>
					</tr>
					
					<%
					}
					connection.close();
					} catch (Exception e) {
					e.printStackTrace();
					}
					%>
					</table>
        </div>
    </body>
</html>
