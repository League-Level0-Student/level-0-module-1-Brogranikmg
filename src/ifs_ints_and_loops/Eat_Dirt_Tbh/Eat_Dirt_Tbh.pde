void setup() {
  size(236,354);
}

void draw() {
  PImage EatDirtEatDrit = loadImage("Eat Dirt Eart Dirt Eat Dirt Eat Dirt Eat Drit Eat Dirt Eat Dirt Eat Dirt Eat Dirt Eat Dirt Eat Drit EAt Dirt EaT irt Eat Diry Eat Dirt Eat Dirt Eat Dirt Eat diert Eat Dirt Eat Dirt Eat Dirt Eat Dirt Eat Dirt Eat Dirt Eat Dirt Eat Dirt.jpg");
  image(EatDirtEatDrit,0,0);
  noStroke();
  colorMode(RGB);
  fill(255,255,255);
  ellipse(55,123,30,25);
  ellipse(125,120,30,25);
  colorMode(HSB);
  fill(mouseX,mouseY,170);
  ellipse(55,123,18,18);
  ellipse(125,120,18,18);
  fill(0,0,0);
  ellipse(55,123,10,10);
  ellipse(125,120,10,10);
}