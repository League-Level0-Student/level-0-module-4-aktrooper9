PImage creeper;   
PImage minecraft;
void setup() {
  size(900, 900); 
 PImage minecraft = loadImage("minecraft.png");     
minecraft.resize(width, height);         
background(minecraft);          
creeper=loadImage("creeper.png"); 
creeper.resize(50,50);
}

void draw() {
  image(creeper, 50, 50);   
  if(mousePressed){
  fill(#FF0044);
  circle(mouseX,mouseY,12);
  background(minecraft); 
  }
}
