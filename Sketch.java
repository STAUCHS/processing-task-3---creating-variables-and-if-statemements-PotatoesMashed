import processing.core.PApplet;

public class Sketch extends PApplet {
	/**
   *    Draws a Pig 
   *  @author: George D.
   */
  // declare variables
  float fltRandX = 0;
  float fltRandY = 0;
  int intRed = (int)(random(0,256));
  int intGreen = (int)(random(0,256));
  int intBlue = (int)(random(0,256));
  float fltWidth = 1;
  float fltHeight = 1;
  
  public void randomize(float fltWidthRatio, float fltHeightRatio) {   
    // Checks which dementions changed 
    if ((fltWidth != width)&&(fltHeight != height)){
      fltRandX = random(-106, 106) * fltWidthRatio;
      fltRandY = random(-201, 106) * fltHeightRatio;
      intRed = (int)(random(0,256));
      intGreen = (int)(random(0,256));
      intBlue = (int)(random(0,256));
      fltWidth = (float)width;
      fltHeight = height;
    } else if (width != fltWidth){
      fltRandX = random(-106, 106) * fltWidthRatio;
      fltWidth = width;
    } else if (height != fltHeight){
      fltRandY = random(-201, 106) * fltHeightRatio;
      fltHeight = height;
    }      
  }

  public void settings() {
    size(600, 700);
  }

  public void setup() {
    // Sets Background Color
    background(intRed, intGreen, intBlue);

    // Allows window to be resized
    surface.setResizable(true);
  }
  public void time(int intDigitX, int intDigitY, int intDigit){ // prints out a digit
    //Sets color to black
    fill(0);

    // top
    if ((intDigit != 1) && (intDigit != 4)){
      beginShape();
      vertex(intDigitX + 5, intDigitY);
      vertex(intDigitX + 55, intDigitY);
      vertex(intDigitX + 50, intDigitY + 5);
      vertex(intDigitX + 10, intDigitY + 5);
      endShape(CLOSE);
    }
    // left top
    if (((intDigit != 1) && (intDigit != 2)) && ((intDigit != 3) && ( intDigit != 7))){
      beginShape();
      vertex(intDigitX, intDigitY + 5);
      vertex(intDigitX, intDigitY + 55);
      vertex(intDigitX + 5, intDigitY + 50);
      vertex(intDigitX + 5, intDigitY + 10);
      endShape(CLOSE);
    }

    // right top
    if ((intDigit != 5) && (intDigit !=  6)){
      beginShape();
      vertex(intDigitX + 60, intDigitY + 5);
      vertex(intDigitX + 60, intDigitY + 55);
      vertex(intDigitX + 55, intDigitY + 50);
      vertex(intDigitX + 55, intDigitY + 10);
      endShape(CLOSE);
    }

    // left bottom
    if (((intDigit == 2) || (intDigit == 6)) || ((intDigit == 8) || ( intDigit == 0))){
      beginShape();
      vertex(intDigitX, intDigitY + 65);
      vertex(intDigitX, intDigitY + 115);
      vertex(intDigitX + 5, intDigitY + 110);
      vertex(intDigitX + 5, intDigitY + 70);
      endShape(CLOSE);
    }

    // right bottom
    if (intDigit != 2){
      beginShape();
      vertex(intDigitX + 60, intDigitY + 65);
      vertex(intDigitX + 60, intDigitY + 115);
      vertex(intDigitX + 55, intDigitY + 110);
      vertex(intDigitX + 55, intDigitY + 70);
      endShape(CLOSE);
    }

    // bottom
    if (((intDigit != 1) && (intDigit != 4)) && ((intDigit != 7) && ( intDigit != 9))){
      beginShape();
      vertex(intDigitX + 5, intDigitY + 120);
      vertex(intDigitX + 55, intDigitY + 120);
      vertex(intDigitX + 50, intDigitY + 115);
      vertex(intDigitX + 10, intDigitY + 115);
      endShape(CLOSE);
    }

    // middle
    if ((intDigit != 1) && ((intDigit != 7) && ( intDigit != 0))){
      beginShape();
      vertex(intDigitX + 5, intDigitY + 60);
      vertex(intDigitX + 10, intDigitY + 65);
      vertex(intDigitX + 50, intDigitY + 65);
      vertex(intDigitX + 55, intDigitY + 60);
      vertex(intDigitX + 50, intDigitY + 55);
      vertex(intDigitX + 10, intDigitY + 55);
      endShape(CLOSE);
    }    
  }

  public void draw() {
    // updates background
    fill(intRed, intGreen, intBlue);
    rect(0, 0, width, height);

    // Declares Variables
    float fltWidthRatio;
    float fltHeightRatio;

    // Calculates % of original width and length
    fltWidthRatio = (float)(width)/600;
    fltHeightRatio = (float)(height)/700;
    
    // Randomizes position if dimentions change
    if ((fltWidth != width) || (fltHeight != height)){
      randomize(fltWidthRatio, fltHeightRatio);
    }

    // Ears and Head
    fill(255, 204, 229);
    triangle(115 * fltWidthRatio + fltRandX, 300 * fltHeightRatio + fltRandY, 490 * fltWidthRatio + fltRandX, 360 * fltHeightRatio + fltRandY, 105 * fltWidthRatio + fltRandX, 200 * fltHeightRatio + fltRandY);
    triangle(485 * fltWidthRatio + fltRandX, 300 * fltHeightRatio + fltRandY, 110 * fltWidthRatio + fltRandX, 360 * fltHeightRatio + fltRandY, 495 * fltWidthRatio + fltRandX, 200 * fltHeightRatio + fltRandY);
    ellipse(300 * fltWidthRatio + fltRandX, 400 * fltHeightRatio + fltRandY, 400 * fltWidthRatio, 350 * fltHeightRatio);

    // Nose
    ellipse(300 * fltWidthRatio + fltRandX, 475 * fltHeightRatio + fltRandY, 251 * fltWidthRatio, 175 * fltHeightRatio);
    fill(255, 160, 230);
    ellipse(250 * fltWidthRatio + fltRandX, 475 * fltHeightRatio + fltRandY, 75 * fltWidthRatio, 75 * fltHeightRatio);
    ellipse(350 * fltWidthRatio + fltRandX, 475 * fltHeightRatio + fltRandY, 75 * fltWidthRatio, 75 * fltHeightRatio);

    // Left Eye
    fill(255);
    ellipse(230 * fltWidthRatio + fltRandX, 325 * fltHeightRatio + fltRandY, 85 * fltWidthRatio, 110 * fltHeightRatio);
    ellipse(370 * fltWidthRatio + fltRandX, 325 * fltHeightRatio + fltRandY, 85 * fltWidthRatio, 110 * fltHeightRatio);
    fill(95, 90, 255);
    rect(207 * fltWidthRatio + fltRandX, 295 * fltHeightRatio + fltRandY, 46 * fltWidthRatio, 60 * fltHeightRatio);
    beginShape();
    vertex(230 * fltWidthRatio + fltRandX, 370 * fltHeightRatio + fltRandY);
    vertex(199 * fltWidthRatio + fltRandX, 325 * fltHeightRatio + fltRandY);
    vertex(230 * fltWidthRatio + fltRandX, 280 * fltHeightRatio + fltRandY);
    vertex(261 * fltWidthRatio + fltRandX, 325 * fltHeightRatio + fltRandY);
    endShape(CLOSE);
    rect(215 * fltWidthRatio + fltRandX, 302 * fltHeightRatio + fltRandY, 30 * fltWidthRatio, 46 * fltHeightRatio);
    beginShape();
    vertex(230 * fltWidthRatio + fltRandX, 302 * fltHeightRatio + fltRandY);
    vertex(215 * fltWidthRatio + fltRandX, 325 * fltHeightRatio + fltRandY);
    vertex(230 * fltWidthRatio + fltRandX, 348 * fltHeightRatio + fltRandY);
    vertex(245 * fltWidthRatio + fltRandX, 325 * fltHeightRatio + fltRandY);
    endShape(CLOSE);
    rect(223 * fltWidthRatio + fltRandX, 314 * fltHeightRatio + fltRandY, 15 * fltWidthRatio, 21 * fltHeightRatio); 
    
    // Right Eye
    rect(347 * fltWidthRatio + fltRandX, 295 * fltHeightRatio + fltRandY, 46 * fltWidthRatio, 60 * fltHeightRatio);
    beginShape();
    vertex(370 * fltWidthRatio + fltRandX, 370 * fltHeightRatio + fltRandY);
    vertex(339 * fltWidthRatio + fltRandX, 325 * fltHeightRatio + fltRandY);
    vertex(370 * fltWidthRatio + fltRandX, 280 * fltHeightRatio + fltRandY);
    vertex(401 * fltWidthRatio + fltRandX, 325 * fltHeightRatio + fltRandY);
    endShape(CLOSE);
    rect(355 * fltWidthRatio + fltRandX, 302 * fltHeightRatio + fltRandY, 30 * fltWidthRatio, 46 * fltHeightRatio);
    beginShape();
    vertex(370 * fltWidthRatio + fltRandX, 302 * fltHeightRatio + fltRandY);
    vertex(355 * fltWidthRatio + fltRandX, 325 * fltHeightRatio + fltRandY);
    vertex(370 * fltWidthRatio + fltRandX, 348 * fltHeightRatio + fltRandY);
    vertex(385 * fltWidthRatio + fltRandX, 325 * fltHeightRatio + fltRandY);
    endShape(CLOSE);  
    rect(363 * fltWidthRatio + fltRandX, 314 * fltHeightRatio + fltRandY, 15 * fltWidthRatio, 21 * fltHeightRatio); 

    // prints the time
    time(40, 40, hour() / 10);
    time(115, 40, hour() % 10);
    ellipse(195, 70, 6, 6);
    ellipse(195, 120, 6, 6);
    time(215, 40, minute() / 10);
    time(290, 40, minute() % 10);
    ellipse(370, 70, 6, 6);
    ellipse(370, 120, 6, 6);
    time(390, 40, second() / 10);
    time(465, 40, second() % 10);
  }
}