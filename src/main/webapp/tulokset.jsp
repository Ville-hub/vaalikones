<%-- 
    Document   : tulokset
    Created on : 14-Apr-2015, 18:26:35
    Author     : Jonne
--%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@page import="persist.Kysymykset"%>
<%@page import="persist.Vastaukset"%>
<%@page import="java.util.List"%>
<%@page import="persist.Ehdokkaat"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Paras ehdokas</title>
        <link href="style.css" rel="stylesheet" type="text/css">
    </head>
    <body>
        <div id="container">
            <h1>Diginide kertoo sinulle, ketä pitää äänestää:</h1>
            <%
                List<Ehdokkaat> parhaatEhdokkaat = (List<Ehdokkaat>) request.getAttribute("parasEhdokas");
                List<Integer> kayttajanVastaukset = (List<Integer>) request.getAttribute("kayttajanVastaukset");
                List<Vastaukset> parhaanEhdokkaanVastaukset = (List<Vastaukset>) request.getAttribute("parhaanEhdokkaanVastaukset");
                List<Kysymykset> kaikkiKysymykset = (List<Kysymykset>) request.getAttribute("kaikkiKysymykset");
                Double pisteet = (double) (Integer) request.getAttribute("pisteet");
                Double prosentit = (double) Math.round(pisteet / (3 * 19) * 100);
                Integer jarjestysnumero = (Integer) request.getAttribute("jarjestysnumero");
                Integer ehdokasId = (Integer) request.getAttribute("ehdokasId");


                if (jarjestysnumero > 0 & jarjestysnumero != 1) {%>
            <a href="Vaalikone?func=haeEhdokas&numero=<%= jarjestysnumero - 1%>">Edellinen ehdokas</a>&nbsp; 
            <% }
                
                if (prosentit == 0) {%>
                
                <br>
                
                <b> There are no more canditates to be displayed</b>
                
                <br>
                
                   
                   <% }
                if (jarjestysnumero < 18 & prosentit != 0) {%>
                
         <a href="Vaalikone?func=haeEhdokas&numero=<%= jarjestysnumero + 1%>">Seuraavaksi paras ehdokas</a>
         
         
            
            <% }

                for (Ehdokkaat seParasEhdokas : parhaatEhdokkaat) {
            %>

            <h2>Numero: <%= seParasEhdokas.getEhdokasId()%></h2>
            <h3>Sinulle <%= jarjestysnumero %>. paras ehdokas</h3>
            <h3>Yhteensopivuus: <%= prosentit%>%</h3>
            <ul>
                <li><b>Nimi:</b><%= seParasEhdokas.getEtunimi()%> <%= seParasEhdokas.getSukunimi()%></li>
                <li><b>Ikä:</b><%= seParasEhdokas.getIka()%></li>
                <li><b>Kotipaikkakunta:</b><%= seParasEhdokas.getKotipaikkakunta()%></li>
                <li><b>Ammatti:</b><%= seParasEhdokas.getAmmatti()%></li>
                <li><b>Puolue:</b><%= seParasEhdokas.getPuolue()%></li>
            </ul>
            <h2>Miksi haluat eduskuntaan?</h2>
            <p><%= seParasEhdokas.getMiksiEduskuntaan()%></p>
            <h2>Mitä asioita haluat edistää?</h2>
            <p><%= seParasEhdokas.getMitaAsioitaHaluatEdistaa()%></p>

            <% }

                for (int i = 0; i < parhaanEhdokkaanVastaukset.size(); i++) {
            %>
            <b>Kysymys <%= i + 1%>: <%= kaikkiKysymykset.get(i).getKysymys()%></b><br>
            <ul>
                <li>Sinun vastaus: <%= kayttajanVastaukset.get(i + 1).toString()%></li>
                <li>Ehdokkaan vastaus: <%= parhaanEhdokkaanVastaukset.get(i).getVastaus()%></li>
                <li>Ehdokkaan kommentti: <%= parhaanEhdokkaanVastaukset.get(i).getKommentti()%></li>
            </ul>


            <%
                }

            %>

        </div>

    </body>
</html>
