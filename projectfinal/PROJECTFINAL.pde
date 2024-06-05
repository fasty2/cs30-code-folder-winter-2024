//Global Declarations
Walker joe;
ArrayList<Ball> ballGroup = new ArrayList<Ball>();

void setup() {
  size(1500,700);
  joe = new Walker(0,0);
  ballGroup.add( new Ball (width/2, height/2,100,width,height) );
  ballGroup.get(0).infected = true; // Very first ball infected
}

void draw() {
  background(255,255,255);
  joe.display();
  for (Ball theBall : ballGroup) {
        theBall.move();

        //Check collision
        for (Ball otherBall : ballGroup) {
            if (theBall != otherBall) {
                theBall.checkCollision(otherBall);
            }
        }
        
        theBall.display();

    }
  

}

void mousePressed() {
  ballGroup.add(new Ball(mouseX, mouseY, 100, width, height));
}

void keyPressed() {
  // For arrows use keyCode and UP, DOWN, ENTER, etc...
  // For ACSII characters, do key and 'a', 'w', etc...
  
  if (keyCode == UP || key == 'w') {
    joe.move(0);
  }
  else if (keyCode == RIGHT || key == 'd') {
    joe.move(1);
  }
  else if (keyCode == DOWN || key == 's') {
    joe.move(2);
  }
  else if (keyCode == LEFT || key == 'a') {
    joe.move(3);
  }
}
