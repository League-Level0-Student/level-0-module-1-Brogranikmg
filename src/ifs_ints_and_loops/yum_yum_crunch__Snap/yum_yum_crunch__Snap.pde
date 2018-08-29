PImage finger;
PImage goblin;
PImage eyeball;
PImage beetle;
PImage nail;
PImage firecracker;

void setup() {
  size(500,500);
  noStroke();
  fill(#CBC267);
  ellipse(250,250,250,250);
  fill(#E8DE85);
  ellipse(250,250,200,200);
  finger = loadImage("finger.gif");
  goblin = loadImage("goblin.gif");
  eyeball = loadImage("eyeball.gif");
  beetle = loadImage("beetle.gif");
  nail = loadImage("nail.gif");
  firecracker = loadImage("firecracker.gif");
}

void draw() {
}

void mousePressed() {
   int dirt = (int)random(6);
    switch(dirt) {
      case 0:
        image(finger,mouseX,mouseY);
        break;
      case 1:
        image(goblin,mouseX,mouseY);
        break;
      case 2:
        image(eyeball,mouseX,mouseY);
        break;
      case 3:
        image(beetle,mouseX,mouseY);
        break;
      case 4:
        image(nail,mouseX,mouseY);
        break;
      case 5:
        image(firecracker,mouseX,mouseY);
        break;
    }
}