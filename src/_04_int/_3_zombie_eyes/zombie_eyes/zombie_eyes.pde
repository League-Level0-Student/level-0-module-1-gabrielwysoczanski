PImage face;
void setup() {
size(500,500);
face=loadImage("face.jpeg");
face.resize(500,500);
}
void draw() {
image(face,0,0);
fill(mouseX,mouseY,100);
ellipse(75,125,75,75);
ellipse(215,125,115,75);
fill(0,0,0);
ellipse(215,125,45,20);
ellipse(75,125,20,20);
}
