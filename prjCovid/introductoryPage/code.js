/*
    Styles for index.html of introductory page
*/
let tl=anime.timeline({
	easing: 'easeOutExpo',
	duration: 750
})//end of tl timeline

tl.add({
	targets: 'section div',
	width: '100%',
	backgroundColor: '#3B0B39',
	delay: anime.stagger(100)
})//end of tl.add

tl.add({
	targets: 'section div',
	width: '90%',
	backgroundColor: '#00BFFF',
	delay: anime.stagger(100)
})//end of tl.add

tl.add({
	targets: 'section div',
	width: '80%',
	backgroundColor: '#FE2E2E',
	delay: anime.stagger(100)
})//end of tl.add

tl.add({
	targets: 'section div',
	width: '100%',
	backgroundColor: '#6BE70A',
	delay: anime.stagger(100)
})//end of tl.add

tl.add({
	targets: '#h1Title',
	top: '20%',
	opacity: 1,
	duration: 4000
}, '-=1600')//end of tl.add

let rotateMe=anime({
	targets: 'section',
	scaleY: '2',
	scaleX: '2',
	translateX: '40%',
	rotate: '45deg',
	duration: 5000,
	autoplay: false
})//end of tl.add

document.querySelector('#h1Title').addEventListener('mouseover', () => {
	rotateMe.play()
})//end of tl.add
