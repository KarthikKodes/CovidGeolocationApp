/*
    Javascript for homepage
*/
function toggleMenu() {
    document.getElementById('sidebar').classList.toggle('activate');
}
$(document).ready(function() {
  //Variables
	let answer;
	let answer2;
	let answer3;
	let answer4;
	let answer5;
	let answer6;
	let totalTrue = 0;

	//Hidden Stuff
	$("#div1Right").hide();
	$("#div1Wrong").hide();
	$("#div1Answer").hide();
	$("#div1").hide();
	$("#div2Right").hide();
	$("#div2Wrong").hide();
	$("#div2Answer").hide();
	$("#div2").hide();
	$("#div3Right").hide();
	$("#div3Wrong").hide();
	$("#div3Answer").hide();
	$("#div3").hide();
	$("#div4Right").hide();
	$("#div4Wrong").hide();
	$("#div4Answer").hide();
	$("#div4").hide();
	$("#div5Right").hide();
	$("#div5Wrong").hide();
	$("#div5Answer").hide();
	$("#div5").hide();
	$("#div6Right").hide();
	$("#div6Wrong").hide();
	$("#div6Answer").hide();
	$("#div6").hide();


	//Audio
	var audio = new Audio('../audio/Travis Scott - COFFEE BEAN (Instrumental).mp3');
  	audio.volume = 0.2;
	var audio2 = new Audio('../audio/Microsoft Windows 98 Startup Sound.mp3');
  	audio2.volume = 0.1;

	//Start Quiz
	$("#btnStartQuiz").click(function(event) {
		window.speechSynthesis.speak(new SpeechSynthesisUtterance("Starting quiz, here is question 1."));
		$("#div1").show(400);
		audio.play();
	});
	
  	//Question 1
	$("#btn1").click(function(event) {
		answer=$("#radF1").prop("checked");
		if(answer==true)
		{
			totalTrue++;
			$("#div1Right").show(400);
			$("#div1").hide();
			$("#div2").show(400);
			audio2.play();
		}
		else if(answer==false)
		{
			answer=$("#radF2").prop("checked");
			if(answer==true) {
				$("#div1Wrong").show(400);
				$("#div1").hide();
				$("#div2").show(400);
				audio2.play();
			}
			else {
				$("#div1Answer").show(400);
				$("#div1").hide();
				$("#div2").show();
				window.speechSynthesis.speak(new SpeechSynthesisUtterance("You submitted this question without answering, thus, we cannot get you a result."));
			}
		}
	});//end of btn1
	
  	//Question 2
	$("#btn2").click(function(event) {
			answer2=$("#radD1").prop("checked");
			if(answer2==true)
			{
				totalTrue++;
				$("#div2Right").show(400);
				$("#div2").hide();
				$("#div3").show(400);
				audio2.play();
			}
			else if(answer2==false)
			{
				answer2=$("#radD2").prop("checked");
				if(answer2==true) {
					$("#div2Wrong").show(400);
					$("#div2").hide();
					$("#div3").show(400);
					audio2.play();
				}
				else {
					$("#div2Answer").show(400);
					$("#div2").hide();
					$("#div3").show();
					window.speechSynthesis.speak(new SpeechSynthesisUtterance("You submitted this question without answering, thus, we cannot get you a result."));
				}
			}
	});//end of btn2
	
	//Question 3
	$("#btn3").click(function(event) {
			answer3=$("#radT1").prop("checked");
			if(answer3==true)
			{
				totalTrue++;
				$("#div3Right").show(400);
				$("#div3").hide();
				$("#div4").show(400);
				audio2.play();
			}
			else if (answer3==false)
			{
				answer3=$("#radT2").prop("checked");
				if(answer3==true) {
					$("#div3Wrong").show(400);
					$("#div3").hide();
					$("#div4").show(400);
					audio2.play();
				}
				else {
					$("#div3Answer").show(400);
					$("#div3").hide();
					$("#div4").show();
					window.speechSynthesis.speak(new SpeechSynthesisUtterance("You submitted this question without answering, thus, we cannot get you a result."));
				}
			}
	});//end of btn3
	
	//Question 4
	$("#btn4").click(function(event) {
			answer4=$("#radA1").prop("checked");
			if(answer4==true)
			{
				totalTrue++;
				$("#div4Right").show(400);
				$("#div4").hide();
				$("#div5").show(400);
				audio2.play();
			}
			else if(answer4==false)
			{
				answer4=$("#radA2").prop("checked");
				if(answer4==true) {
					$("#div4Wrong").show(400);
					$("#div4").hide();
					$("#div5").show(400);
					audio2.play();
				}
				else {
					$("#div4Answer").show(400);
					$("#div4").hide();
					$("#div5").show();
					window.speechSynthesis.speak(new SpeechSynthesisUtterance("You submitted this question without answering, thus, we cannot get you a result."));
				}
			}
	});//end of btn4
	
	//Question 5
	$("#btn5").click(function(event) {
			answer5=$("#radS1").prop("checked");
			if(answer5==true)
			{
				totalTrue++;
				$("#div5Right").show(400);
				$("#div5").hide();
				$("#div6").show(400);
				audio2.play();
			}
			else if(answer5==false)
			{
				answer5=$("#radS2").prop("checked");
				if(answer5 == true) {
					$("#div5Wrong").show(400);
					$("#div5").hide();
					$("#div6").show(400);
					audio2.play();
				}
				else {
					$("#div5Answer").show(400);
					$("#div5").hide();
					$("#div6").show();
					window.speechSynthesis.speak(new SpeechSynthesisUtterance("You submitted this question without answering, thus, we cannot get you a result."));
				}
			}
	});//end of btn5
	
	//Question 6
	$("#btn6").click(function(event) {
			answer6=$("#radI1").prop("checked");
			if(answer6==true)
			{
				totalTrue++;
				$("#div6Right").show(400);
				$("#div6").hide();
				audio2.play();
			}
			else if(answer6==false)
			{
				answer6=$("#radI2").prop("checked");
				if(answer6==true) {
					$("#div6Wrong").show(400);
					$("#div6").hide();
					audio2.play();
				}
				else {
					$("#div6Answer").show(400);
					$("#div6").hide();
					window.speechSynthesis.speak(new SpeechSynthesisUtterance("You submitted this question without answering, thus, we cannot get you a result."));
				}
			}
			window.speechSynthesis.speak(new SpeechSynthesisUtterance("You have reached the end of the quiz, here is your final result."));
			if(totalTrue>0 && totalTrue<=3) {
				window.speechSynthesis.speak(new SpeechSynthesisUtterance("There were " + totalTrue + " questions that applied to you. This may mean that you have COVID. Although minor, get yourself tested."));
			}
			else if(totalTrue==0) {
				window.speechSynthesis.speak(new SpeechSynthesisUtterance("None of the questions applied to you, thus, it is safe to assume that you do not have COVID. Bear in mind that some cases can be completely asymtomatic."));
			}
			else {
				window.speechSynthesis.speak(new SpeechSynthesisUtterance("There were " + totalTrue + " questions that applied to you. This is pretty serious, and you should get tested immediately."));
			}
	});//end of btn6

});//end of doc ready