<!--
    Get help page
-->
<!DOCTYPE html>
<html>
  <head>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width">
    <title>Questionare</title>
    <link href="styles.css" rel="stylesheet" type="text/css"/>
    <link rel="shortcut icon" href="../images/worldMap.png"/>
    <script src="https://code.jquery.com/jquery-3.4.1.min.js" integrity="sha256-CSXorXvZcTkaix6Yvo6HppcZGetbYMGWSFlBw8HfCJo=" crossorigin="anonymous"></script>
    <script type="text/javascript" src="code.js"></script>
  </head>
  <body>
    <div id="sidebar" onclick="toggleMenu()">
        <div class="toggle-btn">
          <span></span>
          <span></span>
          <span></span>
        </div>
        <ul>
          <li>
            <a href="../homepage/index.html">Home</a>
          </li>
          <li>
            <a href="../googleMap/index.html">Mapping</a>
          </li>
          <li>
            <a href="index.html">Question Page</a>
          </li>
          <li>
            <a href="../statictics/index.html">Statictics</a>
          </li>
          <li>
            <a href="../resources/index.html">Resources</a>
          </li>
        </ul>
      </div>
    <br>
    
    <h1>Question Page</h1>
    <div class="Title1">
        <p>
          <h2>Introduction</h2>
          <br>
          <br>
          Here is the questionare for you to fill out to see what you can do with your symptoms. Click the start button to start the questionare. 
        </p>
    </div>
	  <br>
    <br>
    <br>
    <br>
    <br>
    <button id="btnStartQuiz">Start Quiz</button>
    <br>
    <br>
    <!--Question 1-->
		<div id="div1" style="border-style: solid; background-color: darkgray;">
      <br>
			<h2>Question 1: Do you have a fever today.</h2>
			<h3></h3>
			<div id="divQuestion">
        <br>
        <br>
				Answer Here:
        <br>
        <br>
        <input type="radio" name="radFever" id="radF1" value="true">True
        <br>
        <br>
        <input type="radio" name="radFever" id="radF2" value="false">False
        <br>
        <br>
        <button id="btn1">Mark Question</button>
			</div>
		</div>

    <br>
    <br>
    <div id="div1Right" style="background-color:  red;">
      <div id="divAnswer">
			  <h3>That is a symptom of covid.</h3>
      </div>
		</div>
    
		<div id="div1Wrong" style="background-color: green;">
			<div id="divAnswer">
        <h3>That is not a symptom of covid.</h3>
      </div>
		</div>

    <div id="div1Answer" style="background-color:  palevioletred;">
      <div id="divAnswer">
			  <h3>You submitted this question without answering, thus, we cannot get you a result.</h3>
      </div>
		</div>

    <br>
    <br>
    <!--Question 2-->
		<div id="div2" style="border-style: solid; background-color: darkgray;">
      <br>
			<h2>Question 2: Do you have a dry cough?</h2>
			<div id="divQuestion">
        <br>
        <br>
				Answer Here:
        <br>
        <br>
        <input type="radio" name="radFever" id="radD1" value="true">True
        <br>
        <br>
        <input type="radio" name="radFever" id="radD2" value="false">False
        <br>
        <br>
        <button id="btn2">Mark Question</button>
      </div>
		</div>

    <br>
    <br>
    <div id="div2Right" style="background-color:  red;">
			<div id="divAnswer">
        <h3>That is a symptom of covid.</h3>
      </div>
		</div>

		<div id="div2Wrong" style="background-color: green;">
        <div id="divAnswer">
          <h3>That is not a symptom of covid.</h3>
        </div>
		</div>

    <div id="div2Answer" style="background-color:  palevioletred;">
      <div id="divAnswer">
			  <h3>You submitted this question without answering, thus, we cannot get you a result.</h3>
      </div>
		</div>

    <br>
    <br>
    <!--Question 3-->
		<div id="div3" style="border-style: solid; background-color: darkgray;">
      <br>
			<h2>Question 3: Have you been tired?</h2>
			<div id="divQuestion">
        <br>
        <br>
				Answer Here:
        <br>
        <br>
        <input type="radio" name="radFever" id="radT1" value="true">True
        <br>
        <br>
        <input type="radio" name="radFever" id="radT2" value="false">False
        <br>
        <br>
        <button id="btn3">Mark Question</button>
			</div>
		</div>

    <br>
    <br>
    <div id="div3Right" style="background-color:  red;">
      <div id="divAnswer">
        <h3>That is a symptom of covid.</h3>
      </div>
		</div>

		<div id="div3Wrong" style="background-color: green;">
      <div id="divAnswer">
        <h3>That is not a symptom of covid.</h3>
      </div>
		</div>
    
    <div id="div3Answer" style="background-color:  palevioletred;">
      <div id="divAnswer">
			  <h3>You submitted this question without answering, thus, we cannot get you a result.</h3>
      </div>
		</div>

    <br>
    <br>
    <!--Question 4-->
		<div id="div4" style="border-style: solid; background-color: darkgray;">
      <br>
			<h2>Question 4: Do you have aches and pains?</h2>
			<h3></h3>
			<div id="divQuestion">
        <br>
        <br>
				Answer Here:
        <br>
        <br>
        <input type="radio" name="radFever" id="radA1" value="true">True
        <br>
        <br>
        <input type="radio" name="radFever" id="radA2" value="false">False
        <br>
        <br>
        <button id="btn4">Mark Question</button>
			</div>
		</div>

    <br>
    <br>
    <div id="div4Right" style="background-color:  red;">
			<div id="divAnswer">
        <h3>That is a symptom of covid.</h3>
      </div>  
		</div>

		<div id="div4Wrong" style="background-color: green;">
      <div id="divAnswer">
			  <h3>That is not a symptom of covid.</h3>
      </div>
		</div>

    <div id="div4Answer" style="background-color:  palevioletred;">
      <div id="divAnswer">
			  <h3>You submitted this question without answering, thus, we cannot get you a result.</h3>
      </div>
		</div>

    <br>
    <br>
    <!--Question 5-->
		<div id="div5" style="border-style: solid; background-color: darkgray;">
			<h2>Question 5: Do you have a sore throat?</h2>
			<div id="divQuestion">
				<br>
        <br>
        Answer Here:
        <br>
        <br>
        <input type="radio" name="radFever" id="radS1" value="true">True
        <br>
        <br>
        <input type="radio" name="radFever" id="radS2" value="false">False
        <br>
			  <br>
			  <button id="btn5">Mark Question</button>
			</div>
		</div>

    <br>
    <br>
    <div id="div5Right" style="background-color:  red;">
      <div id="divAnswer">
			  <h3>That is a symptom of covid.</h3>
      </div>
		</div>

		<div id="div5Wrong" style="background-color: green;">
			<div id="divAnswer">
			  <h3>That is not a symptom of covid.</h3>
      </div>
		</div>

    <div id="div5Answer" style="background-color:  palevioletred;">
      <div id="divAnswer">
			  <h3>You submitted this question without answering, thus, we cannot get you a result.</h3>
      </div>
		</div>

    <br>
    <br>
    <!--Question 6-->
		<div id="div6" style="border-style: solid; background-color: darkgray;">
			<h2>Question 6: Do you have diarrhea?</h2>
			<div id="divQuestion">
				<br>
        <br>
        Answer Here:
        <br>
        <br>
        <input type="radio" name="radFever" id="radI1" value="true">True
        <br>
        <br>
        <input type="radio" name="radFever" id="radI2" value="false">False
        <br>
			  <br>
			  <button id="btn6">Mark Question</button>
			</div>
		</div>

    <div id="div6Right" style="background-color:  red;">
			<div id="divAnswer">
        <h3>That is a symptom of covid.</h3>
      </div>
		</div>

		<br>
		<br>
		<div id="div6Wrong" style="background-color: green;">
			<div id="divAnswer">
			  <h3>That is not a symptom of covid.</h3>
      </div>
		</div>

    <div id="div6Answer" style="background-color:  palevioletred;">
      <div id="divAnswer">
			  <h3>You submitted this question without answering, thus, we cannot get you a result.</h3>
      </div>
		</div>
    
  </body>
</html>
