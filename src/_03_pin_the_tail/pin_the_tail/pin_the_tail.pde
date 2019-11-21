PImage donkey;
PImage tail;
 
void setup() {
  donkey = loadImage("Postosuchus.jpg");      
tail = loadImage("Tail.png");      
tail.resize(365,155);
size(951,535); 

}

void draw() {
if(mouseX>0&&mouseX<30&&mouseY>0&&mouseY<30){ 
  background(donkey);
rect(585, 175, 40, 40);

}
else{
background(200,200,200);
  image(tail, mouseX, mouseY);
}

  rect(0, 0, 30, 30);
 

 
 
}
