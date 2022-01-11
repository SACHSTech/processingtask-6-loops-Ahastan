import processing.core.PApplet;

public class Sketch extends PApplet {
	
	
  /**
   * Called once at the beginning of execution, put your size all in this method
   */
  public void settings() {
	// put your size call here
    size(400, 400);
  }

  /** 
   * Called once at the beginning of execution.  Add initial set up
   * values here i.e background, stroke, fill etc.
   */
  public void setup() {
    background(210, 255, 173);
  }

  /**
   * Called repeatedly, anything drawn to the screen goes here
   */
  public void draw() {

    // Quadrant 1
    for(int horizontal = 20; horizontal <= 200; horizontal = horizontal + 20)
    {
      for (int vertical = 20; vertical <= 200; vertical = vertical + 20){
      
      stroke(23, 183, 232);
      line(horizontal, 0, horizontal, 200);

      stroke(23, 183, 232);
      line(0, vertical, 200, vertical);
      }
    }

    //Quadrant 2
    for(int circleX = 240; circleX < 370; circleX = circleX + 30)
    {
      for(int circleY = 40; circleY < 170; circleY = circleY + 30)
      {
        stroke(23, 232, 159);
        fill(23, 232, 159);
        ellipse(circleX, circleY, 15, 15);
      }
    }

    //Quadrant 3
    for(int c = 0; c <= 200; c++)
    {
      stroke(c,c,c);
      line(c,200, c, 400);
    }
    
    //Quadrant 4
    

    // ellipse(300, 270, 30, 30);
    // ellipse(320, 280, 30, 30);
    // ellipse(330, 300, 30, 30);
    // ellipse(320, 320, 30, 30);
    // ellipse(300, 330, 30, 30);
    // ellipse(280, 320, 30, 30);
    // ellipse(270, 300, 30, 30);
    // ellipse(280, 280, 30, 30);

    
    strokeWeight(7);
    

    translate(300,300);
    for(int i = 0; i < 8; i++){
      stroke(7, 247, 51);
      rotate(TWO_PI/8);
      line(0,0,50,0);
    }

    stroke(189, 96, 34);
    fill(189, 96, 34);
    ellipse(0, 0, 40, 40);
  }
  
  // define other methods down here.
}