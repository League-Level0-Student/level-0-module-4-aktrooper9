PImage creeper;   
PImage minecraft;
int x = 0;
int y = 0;
void setup() {
  size(900, 900); 
  minecraft = loadImage("minecraft.png");     
  minecraft.resize(width, height);         
  background(minecraft);          
  creeper=loadImage("creeper.png"); 
  creeper.resize(50, 50);
}

void draw() {
  image(creeper, x, y);   
  if (mousePressed) {
    
    if(isNear(mouseX,x+25)&& isNear(mouseY,y+25)){
      fill(#05FF03);
     println("You win"); 
      circle(mouseX, mouseY, 12);
     x=(int)random(width);
     y=(int)random(height);
     background(minecraft);
    }
   else{
   fill(#FF0044);
   circle(mouseX, mouseY, 12);
   }
  }
}
boolean isNear(int a, int b) {
if (abs(a - b) < 50)
     return true;
else
     return false;
}
