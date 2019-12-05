PImage DONKEY;
PImage donkey;
PImage tail;
int tailX=0;
int tailY=0;
boolean gameover=false;
void setup() {
  DONKEY = loadImage("donkey the second.jpg");
  donkey = loadImage("Postosuchus.jpg");      
  tail = loadImage("Tail.png");      
  tail.resize(365, 155);
  size(951, 535);
}


void draw() {
  if (gameover) {

    background(donkey);
    image(tail, tailX, tailY);
    
      

     
      if ( tailY>176&&tailX>584&& tailY<214&&tailX<652) {
        text("YOU WON", 450, 260);
      } 
      else {
        text("YOU LOST", 450, 260);
      }
  } else {
    
  if (mousePressed) {
    gameover=true;
     tailX=mouseX;
      tailY=mouseY;
  }
      //print(mouseX,mouseY);
      if (mouseX>0&&mouseX<30&&mouseY>0&&mouseY<30) { 
        background(donkey);
      } else {
        background(200, 200, 200);
        image(tail, mouseX, mouseY);

        rect(0, 0, 30, 30);
      }
    }
  }
