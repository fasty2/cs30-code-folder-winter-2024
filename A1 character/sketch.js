// Project Title
// Your Name sayo
// Date 19n feb 2024
//
// Extra for Experts:
// - describe what you did to take this project "above and beyond"

function setup() {
  createCanvas(windowWidth, windowHeight);
}

function draw() {
    let mw = width/2;
    let hw = height/2;

  background(220);
  circle(hw/2, mw, 100);
  fill(255)
  rect(  170, 405, 100, 200,);
  
  rect( 120, 450, 50, 15   );

  rect( 120, 405, 10.9, 60 );
  x = noise(time) * width;

  rect(350, 400, 40, 15 )
  fill("black"); 
  circle(x,y,0); //make zero 40

  time += 0.4;

  
  
}