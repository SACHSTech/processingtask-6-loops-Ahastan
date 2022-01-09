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
      
      stroke(225);
      line(horizontal, 0, horizontal, 200);

      stroke(225);
      line(0, vertical, 200, vertical);
      }
    }

    //Quadrant 2
    for(int circleX = 240; circleX < 370; circleX = circleX + 30)
    {
      for(int circleY = 40; circleY < 170; circleY = circleY + 30)
      {
        stroke(225);
        fill(225);
        ellipse(circleX, circleY, 15, 15);
      }
    }

    //Quadrant 3
    int r = 0;
    int b = 0;
    for(int i = 0; i <= 200; i++)
    {
      for(int j = 200; j <= 400; j++)
      {
        for(int a = 0; a < i; a++){
          stroke(r, a, b);
          line(i,j,i,400);
        }
      }
    }
  }
  
  // define other methods down here.
}