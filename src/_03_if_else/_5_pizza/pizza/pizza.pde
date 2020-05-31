PImage pepperoni;
void setup() {
  size(600, 600);
  fill(224, 165, 54);
  ellipse(300, 300, 250, 250);
  fill(255, 0, 0);
  ellipse(300, 300, 200, 200);
  fill(255, 255, 0);
  ellipse(300, 300, 190, 190);
  pepperoni = loadImage("pepperoni.jpeg");
    
}
void draw() {
    pepperoni.resize(75, 75);
    if (mousePressed)
    {
     image(pepperoni, mouseX, mouseY);
    }
    
}
