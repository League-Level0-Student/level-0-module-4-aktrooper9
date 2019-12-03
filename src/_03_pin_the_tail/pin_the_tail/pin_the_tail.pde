
PImage donkey;
PImage tail;
int tailX;
 int tailY;
 boolean gameover=false;
void setup() {
  donkey = loadImage("Postosuchus.jpg");      
tail = loadImage("Tail.png");      
tail.resize(365,155);
size(951,535); 
}


void draw() {
  //print(mouseX,mouseY);
if(mouseX>0&&mouseX<30&&mouseY>0&&mouseY<30){ 
  background(donkey);
rect(585, 175, 40, 40);
}

else{
background(200,200,200);
  image(tail, mouseX, mouseY);
  
  rect(0, 0, 30, 30);
}
if(mousePressed&& mouseY>176&&mouseX>584&& mouseY>214&&mouseX<652&&mouseY<178&&mouseX<622){
gameover=true;
background(donkey);
print(tailX+","+tailY);
}
else{

}
}

 
 
