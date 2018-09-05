int x = 10;
int y = 15;
int crl = #0000FF;
PFont dront;
dront = createFont("Purisa", 20);

size(340, 440);
background(#FF0000);
textSize(20);
textFont(dront);
for (int i = 0; i < 10; i++) {
  fill(crl);
  text("iced Cream,", x, y);
  x += 5;
  y += 20;
  if (crl == #0000FF) {
    crl = #00FF00;
  } else {
    crl = #0000FF;
  }
}
textSize(45);
text("BANaNA,", 100, 300);