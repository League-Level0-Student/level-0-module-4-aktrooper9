PImage face;
void setup(){
face = loadImage("face.jpg");
size(500,374);
face.resize(width,height);
}

void draw(){
  background(face);
  fill(255,255,255);
ellipse(237,145,90,40);
fill(5,5,5);
if(mouseX>203 && mouseX<272 && mouseY>136 && mouseY<156){
circle(mouseX,mouseY,20);
}
if(mousePressed){
  println("X"+mouseX);
   println("Y"+mouseY);
}
}
