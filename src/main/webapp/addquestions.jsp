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
        

    <form action="/AddCandidateQuestionsServlet" method="get">

  
 Kysymys 1:  Suomessa on liian helppo el‰‰ sosiaaliturvan varassa <br>
  
    <div class="form-check form-check-inline">
  <input class="form-check-input" type="radio" name="question1option1" id="question1option1" value="1">
  <label class="form-check-label" for="inlineRadio1">1</label>
</div>
<div class="form-check form-check-inline">
  <input class="form-check-input" type="radio" name="question1option2" id="question1option2" value="2">
  <label class="form-check-label" for="inlineRadio2">2</label>
</div>
<div class="form-check form-check-inline">
   <input class="form-check-input" type="radio" name="question1option3" id="question1option3" value="3">
  <label class="form-check-label" for="inlineRadio2">3</label>
</div>
  <div class="form-check form-check-inline">
  <input class="form-check-input" type="radio" name="question1option4" id="question1option4" value="4">
  <label class="form-check-label" for="inlineRadio1">4</label>
</div>
<div class="form-check form-check-inline">
  <input class="form-check-input" type="radio" name="question1option5" id="question1option5" value="5">
  <label class="form-check-label" for="inlineRadio2">5</label>
</div>


<br> <br>

Kysymys 2: Kaupan ja muiden liikkeiden aukioloajat on vapautettava.  <br>
    <div class="form-check form-check-inline">
  <input class="form-check-input" type="radio" name="question2option1" id="question2option1" value="1">
  <label class="form-check-label" for="inlineRadio1">1</label>
</div>
<div class="form-check form-check-inline">
  <input class="form-check-input" type="radio" name="question2option2" id="question2option2" value="2">
  <label class="form-check-label" for="inlineRadio2">2</label>
</div>
<div class="form-check form-check-inline">
   <input class="form-check-input" type="radio" name="question2option3" id="question2option3" value="3">
  <label class="form-check-label" for="inlineRadio2">3</label>
</div>
  <div class="form-check form-check-inline">
  <input class="form-check-input" type="radio" name="question2option4" id="question2option4" value="4">
  <label class="form-check-label" for="inlineRadio1">4</label>
</div>
<div class="form-check form-check-inline">
  <input class="form-check-input" type="radio" name="question2option5" id="question2option5" value="4">
  <label class="form-check-label" for="inlineRadio2">5</label>
</div>


<br> <br>
  
Kysymys 3: Suomessa on siirrytt‰v‰ perustuloon joka korvaisi nykyisen sosiaaliturvan v‰himm‰istason. <br>
    <div class="form-check form-check-inline">
  <input class="form-check-input" type="radio" name="question3option1" id="question3option1" value="1">
  <label class="form-check-label" for="inlineRadio1">1</label>
</div>
<div class="form-check form-check-inline">
  <input class="form-check-input" type="radio" name="question3option2" id="question3option2" value="2">
  <label class="form-check-label" for="inlineRadio2">2</label>
</div>
<div class="form-check form-check-inline">
   <input class="form-check-input" type="radio" name="question3option3" id="question3option3" value="3">
  <label class="form-check-label" for="inlineRadio2">3</label>
</div>
  <div class="form-check form-check-inline">
  <input class="form-check-input" type="radio" name="question3option4" id="question3option4" value="4">
  <label class="form-check-label" for="inlineRadio1">4</label>
</div>
<div class="form-check form-check-inline">
  <input class="form-check-input" type="radio" name="question3option5" id="question3option5" value="5">
  <label class="form-check-label" for="inlineRadio2">5</label>
</div>


<br> <br>
  
  
  

  
Kysymys 4: Ty‰ntekij‰lle on turvattava lailla minimity‰aika..<br>
    <div class="form-check form-check-inline">
  <input class="form-check-input" type="radio" name="question4option1" id="question4option1" value="1">
  <label class="form-check-label" for="inlineRadio1">1</label>
</div>
<div class="form-check form-check-inline">
  <input class="form-check-input" type="radio" name="question4option2" id="question4option2" value="2">
  <label class="form-check-label" for="inlineRadio2">2</label>
</div>
<div class="form-check form-check-inline">
   <input class="form-check-input" type="radio" name="question4option3" id="question4option3" value="3">
  <label class="form-check-label" for="inlineRadio2">3</label>
</div>
  <div class="form-check form-check-inline">
  <input class="form-check-input" type="radio" name="question4option4" id="question4option4" value="4">
  <label class="form-check-label" for="inlineRadio1">4</label>
</div>
<div class="form-check form-check-inline">
  <input class="form-check-input" type="radio" name="question4option5" id="question4option5" value="5">
  <label class="form-check-label" for="inlineRadio2">5</label>
</div>


<br> <br>

Kysymys 5: Ansiosidonnaisen ty‰tt‰myysturvan kestoa pit‰‰ lyhent‰‰..<br>
    <div class="form-check form-check-inline">
  <input class="form-check-input" type="radio" name="question5option1" id="question5option1" value="1">
  <label class="form-check-label" for="inlineRadio1">1</label>
</div>
<div class="form-check form-check-inline">
  <input class="form-check-input" type="radio" name="question5option2" id="question5option2" value="2">
  <label class="form-check-label" for="inlineRadio2">2</label>
</div>
<div class="form-check form-check-inline">
   <input class="form-check-input" type="radio" name="question5option3" id="question5option3" value="3">
  <label class="form-check-label" for="inlineRadio2">3</label>
</div>
  <div class="form-check form-check-inline">
  <input class="form-check-input" type="radio" name="question5option4" id="question5option4" value="4">
  <label class="form-check-label" for="inlineRadio1">4</label>
</div>
<div class="form-check form-check-inline">
  <input class="form-check-input" type="radio" name="question5option5" id="question5option5" value="5">
  <label class="form-check-label" for="inlineRadio2">5</label>
</div>


<br> <br>

Kysymys 6: Euron ulkopuolella Suomi p‰rj‰isi paremmin..<br>
    <div class="form-check form-check-inline">
  <input class="form-check-input" type="radio" name="question6option1" id="question6option1" value="1">
  <label class="form-check-label" for="inlineRadio1">1</label>
</div>
<div class="form-check form-check-inline">
  <input class="form-check-input" type="radio" name="question6option2" id="question6option2" value="2">
  <label class="form-check-label" for="inlineRadio2">2</label>
</div>
<div class="form-check form-check-inline">
   <input class="form-check-input" type="radio" name="question6option3" id="question6option3" value="3">
  <label class="form-check-label" for="inlineRadio2">3</label>
</div>
  <div class="form-check form-check-inline">
  <input class="form-check-input" type="radio" name="question6option4" id="question6option4" value="4">
  <label class="form-check-label" for="inlineRadio1">4</label>
</div>
<div class="form-check form-check-inline">
  <input class="form-check-input" type="radio" name="question6option5" id="question6option5" value="5">
  <label class="form-check-label" for="inlineRadio2">5</label>
</div>


<br> <br>

Kysymys 7: Ruoan verotusta on varaa kirist‰‰..<br>
    <div class="form-check form-check-inline">
  <input class="form-check-input" type="radio" name="question7option1" id="question7option1" value="1">
  <label class="form-check-label" for="inlineRadio1">1</label>
</div>
<div class="form-check form-check-inline">
  <input class="form-check-input" type="radio" name="question7option2" id="question7option2" value="2">
  <label class="form-check-label" for="inlineRadio2">2</label>
</div>
<div class="form-check form-check-inline">
   <input class="form-check-input" type="radio" name="question7option3" id="question7option3" value="3">
  <label class="form-check-label" for="inlineRadio2">3</label>
</div>
  <div class="form-check form-check-inline">
  <input class="form-check-input" type="radio" name="question7option4" id="question7option4" value="4">
  <label class="form-check-label" for="inlineRadio1">4</label>
</div>
<div class="form-check form-check-inline">
  <input class="form-check-input" type="radio" name="question7option5" id="question7option5" value="5">
  <label class="form-check-label" for="inlineRadio2">5</label>
</div>


<br> <br>

Kysymys 8: Valtion ja kuntien taloutta on tasapainotettava ensisijaisesti leikkaamalla menoja..<br>
    <div class="form-check form-check-inline">
  <input class="form-check-input" type="radio" name="question8option1" id="question8option1" value="1">
  <label class="form-check-label" for="inlineRadio1">1</label>
</div>
<div class="form-check form-check-inline">
  <input class="form-check-input" type="radio" name="question8option2" id="question8option2" value="2">
  <label class="form-check-label" for="inlineRadio2">2</label>
</div>
<div class="form-check form-check-inline">
   <input class="form-check-input" type="radio" name="question8option3" id="question8option3" value="3">
  <label class="form-check-label" for="inlineRadio2">3</label>
</div>
  <div class="form-check form-check-inline">
  <input class="form-check-input" type="radio" name="question8option4" id="question8option4" value="4">
  <label class="form-check-label" for="inlineRadio1">4</label>
</div>
<div class="form-check form-check-inline">
  <input class="form-check-input" type="radio" name="question8option5" id="question8option5" value="5">
  <label class="form-check-label" for="inlineRadio2">5</label>
</div>


<br> <br>

Kysymys 9: Lapsilisi‰ on korotettava ja laitettava verolle...<br>
    <div class="form-check form-check-inline">
  <input class="form-check-input" type="radio" name="question9option1" id="question9option1" value="1">
  <label class="form-check-label" for="inlineRadio1">1</label>
</div>
<div class="form-check form-check-inline">
  <input class="form-check-input" type="radio" name="question9option2" id="question9option2" value="2">
  <label class="form-check-label" for="inlineRadio2">2</label>
</div>
<div class="form-check form-check-inline">
   <input class="form-check-input" type="radio" name="question9option3" id="question9option3" value="3">
  <label class="form-check-label" for="inlineRadio2">3</label>
</div>
  <div class="form-check form-check-inline">
  <input class="form-check-input" type="radio" name="question9option4" id="question9option4" value="4">
  <label class="form-check-label" for="inlineRadio1">4</label>
</div>
<div class="form-check form-check-inline">
  <input class="form-check-input" type="radio" name="question9option5" id="question9option5" value="5">
  <label class="form-check-label" for="inlineRadio2">5</label>
</div>


<br> <br>
  
  Kysymys 10:Suomella ei ole varaa nykyisen laajuisiin sosiaali- ja terveyspalveluihin.<br>
    <div class="form-check form-check-inline">
  <input class="form-check-input" type="radio" name="question10option1" id="question10option1" value="1">
  <label class="form-check-label" for="inlineRadio1">1</label>
</div>
<div class="form-check form-check-inline">
  <input class="form-check-input" type="radio" name="question10option2" id="question10option2" value="2">
  <label class="form-check-label" for="inlineRadio2">2</label>
</div>
<div class="form-check form-check-inline">
   <input class="form-check-input" type="radio" name="question10option3" id="question10option3" value="3">
  <label class="form-check-label" for="inlineRadio2">3</label>
</div>
  <div class="form-check form-check-inline">
  <input class="form-check-input" type="radio" name="question10option4" id="question10option4" value="4">
  <label class="form-check-label" for="inlineRadio1">4</label>
</div>
<div class="form-check form-check-inline">
  <input class="form-check-input" type="radio" name="question10option5" id="question10option5" value="5">
  <label class="form-check-label" for="inlineRadio2">5</label>
</div>


<br> <br>

  Kysymys 11 Nato-j‰senyys vahvistaisi Suomen turvallisuuspoliittista asemaa.<br>
    <div class="form-check form-check-inline">
  <input class="form-check-input" type="radio" name="question11option1" id="question11option1" value="1">
  <label class="form-check-label" for="inlineRadio1">1</label>
</div>
<div class="form-check form-check-inline">
  <input class="form-check-input" type="radio" name="question11option2" id="question11option2" value="2">
  <label class="form-check-label" for="inlineRadio2">2</label>
</div>
<div class="form-check form-check-inline">
   <input class="form-check-input" type="radio" name="question11option3" id="question11option3" value="3">
  <label class="form-check-label" for="inlineRadio2">3</label>
</div>
  <div class="form-check form-check-inline">
  <input class="form-check-input" type="radio" name="question11option4" id="question11option4" value="4">
  <label class="form-check-label" for="inlineRadio1">4</label>
</div>
<div class="form-check form-check-inline">
  <input class="form-check-input" type="radio" name="question11option5" id="question11option5" value="5">
  <label class="form-check-label" for="inlineRadio2">5</label>
</div>


<br> <br>

  Kysymys 12 Suomeen tarvitaan enemm‰n poliiseja..<br>
    <div class="form-check form-check-inline">
  <input class="form-check-input" type="radio" name="question12option1" id="question12option1" value="1">
  <label class="form-check-label" for="inlineRadio1">1</label>
</div>
<div class="form-check form-check-inline">
  <input class="form-check-input" type="radio" name="question12option2" id="question12option2" value="2">
  <label class="form-check-label" for="inlineRadio2">2</label>
</div>
<div class="form-check form-check-inline">
   <input class="form-check-input" type="radio" name="question12option3" id="question12option3" value="3">
  <label class="form-check-label" for="inlineRadio2">3</label>
</div>
  <div class="form-check form-check-inline">
  <input class="form-check-input" type="radio" name="question12option4" id="question12option4" value="4">
  <label class="form-check-label" for="inlineRadio1">4</label>
</div>
<div class="form-check form-check-inline">
  <input class="form-check-input" type="radio" name="question12option5" id="question12option5" value="5">
  <label class="form-check-label" for="inlineRadio2">5</label>
</div>


<br> <br>
  
    Kysymys 13 Maahanmuuttoa Suomeen on rajoitettava terrorismin uhan vuoksi...<br>
    <div class="form-check form-check-inline">
  <input class="form-check-input" type="radio" name="question13option1" id="question13option1" value="1">
  <label class="form-check-label" for="inlineRadio1">1</label>
</div>
<div class="form-check form-check-inline">
  <input class="form-check-input" type="radio" name="question13option2" id="question13option2" value="2">
  <label class="form-check-label" for="inlineRadio2">2</label>
</div>
<div class="form-check form-check-inline">
   <input class="form-check-input" type="radio" name="question13option3" id="question13option3" value="3">
  <label class="form-check-label" for="inlineRadio2">3</label>
</div>
  <div class="form-check form-check-inline">
  <input class="form-check-input" type="radio" name="question13option4" id="question13option4" value="4">
  <label class="form-check-label" for="inlineRadio1">4</label>
</div>
<div class="form-check form-check-inline">
  <input class="form-check-input" type="radio" name="question13option5" id="question13option5" value="5">
  <label class="form-check-label" for="inlineRadio2">5</label>
</div>


<br> <br>

    Kysymys 14 Ven‰j‰n etupiiripolitiikka on uhka Suomelle.<br>
    <div class="form-check form-check-inline">
  <input class="form-check-input" type="radio" name="question14option1" id="question14option1" value="1">
  <label class="form-check-label" for="inlineRadio1">1</label>
</div>
<div class="form-check form-check-inline">
  <input class="form-check-input" type="radio" name="question14option2" id="question14option2" value="2">
  <label class="form-check-label" for="inlineRadio2">2</label>
</div>
<div class="form-check form-check-inline">
   <input class="form-check-input" type="radio" name="question14option3" id="question14option3" value="3">
  <label class="form-check-label" for="inlineRadio2">3</label>
</div>
  <div class="form-check form-check-inline">
  <input class="form-check-input" type="radio" name="question14option4" id="question14option4" value="4">
  <label class="form-check-label" for="inlineRadio1">4</label>
</div>
<div class="form-check form-check-inline">
  <input class="form-check-input" type="radio" name="question14option5" id="question14option5" value="5">
  <label class="form-check-label" for="inlineRadio2">5</label>
</div>


<br> <br>
  
      Kysymys 15 Verkkovalvonnassa valtion turvallisuus on t‰rke‰mp‰‰ kuin kansalaisten yksityisyyden suoja.<br>
    <div class="form-check form-check-inline">
  <input class="form-check-input" type="radio" name="question15option1" id="question15option1" value="1">
  <label class="form-check-label" for="inlineRadio1">1</label>
</div>
<div class="form-check form-check-inline">
  <input class="form-check-input" type="radio" name="question15option2" id="question15option2" value="2">
  <label class="form-check-label" for="inlineRadio2">2</label>
</div>
<div class="form-check form-check-inline">
   <input class="form-check-input" type="radio" name="question15option3" id="question15option3" value="3">
  <label class="form-check-label" for="inlineRadio2">3</label>
</div>
  <div class="form-check form-check-inline">
  <input class="form-check-input" type="radio" name="question15option4" id="question15option4" value="4">
  <label class="form-check-label" for="inlineRadio1">4</label>
</div>
<div class="form-check form-check-inline">
  <input class="form-check-input" type="radio" name="question15option5" id="question15option5" value="5">
  <label class="form-check-label" for="inlineRadio2">5</label>
</div>


<br> <br>
  
     Kysymys 16  Suomen on osallistuttava Isisin vastaiseen taisteluun kouluttamalla Irakin hallituksen joukkoja..<br>
    <div class="form-check form-check-inline">
  <input class="form-check-input" type="radio" name="question16option1" id="question16option1" value="1">
  <label class="form-check-label" for="inlineRadio1">1</label>
</div>
<div class="form-check form-check-inline">
  <input class="form-check-input" type="radio" name="question16option2" id="question16option2" value="2">
  <label class="form-check-label" for="inlineRadio2">2</label>
</div>
<div class="form-check form-check-inline">
   <input class="form-check-input" type="radio" name="question16option3" id="question16option3" value="3">
  <label class="form-check-label" for="inlineRadio2">3</label>
</div>
  <div class="form-check form-check-inline">
  <input class="form-check-input" type="radio" name="question16option4" id="question16option4" value="4">
  <label class="form-check-label" for="inlineRadio1">4</label>
</div>
<div class="form-check form-check-inline">
  <input class="form-check-input" type="radio" name="question16option5" id="question16option5" value="5">
  <label class="form-check-label" for="inlineRadio2">5</label>
</div>


<br> <br>

     Kysymys 17  Parantumattomasti sairaalla on oltava oikeus avustettuun kuolemaan...<br>
    <div class="form-check form-check-inline">
  <input class="form-check-input" type="radio" name="question17option1" id="question17option1" value="1">
  <label class="form-check-label" for="inlineRadio1">1</label>
</div>
<div class="form-check form-check-inline">
  <input class="form-check-input" type="radio" name="question17option2" id="question17option2" value="2">
  <label class="form-check-label" for="inlineRadio2">2</label>
</div>
<div class="form-check form-check-inline">
   <input class="form-check-input" type="radio" name="question17option3" id="question17option3" value="3">
  <label class="form-check-label" for="inlineRadio2">3</label>
</div>
  <div class="form-check form-check-inline">
  <input class="form-check-input" type="radio" name="question17option4" id="question17option4" value="4">
  <label class="form-check-label" for="inlineRadio1">4</label>
</div>
<div class="form-check form-check-inline">
  <input class="form-check-input" type="radio" name="question17option5" id="question17option5" value="5">
  <label class="form-check-label" for="inlineRadio2">5</label>
</div>


<br> <br>


     Kysymys 18  Terveys- ja sosiaalipalvelut on tuotettava ensijaisesti julkisina palveluina..<br>
    <div class="form-check form-check-inline">
  <input class="form-check-input" type="radio" name="question18option1" id="question18option1" value="1">
  <label class="form-check-label" for="inlineRadio1">1</label>
</div>
<div class="form-check form-check-inline">
  <input class="form-check-input" type="radio" name="question18option2" id="question18option2" value="2">
  <label class="form-check-label" for="inlineRadio2">2</label>
</div>
<div class="form-check form-check-inline">
   <input class="form-check-input" type="radio" name="question18option3" id="question18option3" value="3">
  <label class="form-check-label" for="inlineRadio2">3</label>
</div>
  <div class="form-check form-check-inline">
  <input class="form-check-input" type="radio" name="question18option4" id="question18option4" value="4">
  <label class="form-check-label" for="inlineRadio1">4</label>
</div>
<div class="form-check form-check-inline">
  <input class="form-check-input" type="radio" name="question18option5" id="question18option5" value="5">
  <label class="form-check-label" for="inlineRadio2">5</label>
</div>


<br> <br>

     Kysymys 19  Viranomaisten pit‰‰ puuttua lapsiperheiden ongelmiin nykyist‰ herkemmin..<br>
    <div class="form-check form-check-inline">
  <input class="form-check-input" type="radio" name="question19option1" id="question19option1" value="1">
  <label class="form-check-label" for="inlineRadio1">1</label>
</div>
<div class="form-check form-check-inline">
  <input class="form-check-input" type="radio" name="question19option2" id="question19option2" value="2">
  <label class="form-check-label" for="inlineRadio2">2</label>
</div>
<div class="form-check form-check-inline">
   <input class="form-check-input" type="radio" name="question19option3" id="question19option3" value="3">
  <label class="form-check-label" for="inlineRadio2">3</label>
</div>
  <div class="form-check form-check-inline">
  <input class="form-check-input" type="radio" name="question19option4" id="question19option4" value="4">
  <label class="form-check-label" for="inlineRadio1">4</label>
</div>
<div class="form-check form-check-inline">
  <input class="form-check-input" type="radio" name="question19option5" id="question19option5" value="5">
  <label class="form-check-label" for="inlineRadio2">5</label>
</div>


<br> <br>
  <input type="submit" name ="submit" value="Submit">
</form> 
        
           
        </div>
    </body>
</html>
