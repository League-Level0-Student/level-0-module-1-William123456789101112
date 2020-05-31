PImage face;

void setup() {
  size(600, 600);
  face = loadImage("zombie.jpeg");
  face.resize(600, 600);
  image(face, 0, 0);

}
void draw() {
  fill(174 + mouseX, 128 - mouseY, 192);
  ellipse(196, 243, 50, 50);
  ellipse(250, 238, 50, 50);
  fill(0, 0, 0);
  ellipse(196, 243, 25, 25);
  ellipse(250, 238, 25, 25);
}
