// Project Title
// Your Name sayo
// Date 19n feb 2024
//
// Extra for Experts:
// - describe what you did to take this project "above and beyond"

let x, y;
let time = 0;
let timy = 0;

function setup(){
createCanvas(windowWidth, windowHeight); 
// width and height  

x = width/2;
y = height/2;

}

function draw() {
  background(220);

  x = noise(time) * width;

  fill("black"); 
  circle(x,y,0); //make zero 40

  time += 0.4;

}