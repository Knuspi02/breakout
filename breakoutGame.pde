void settings() {
  fullScreen();
}
void setup() {
  //frameRate(60);
  background(0);
  noStroke();
}
void draw() {
  int x = 920;
  int y = 540;
  background(0);
  text("" + frameRate, 10, 20);
  fill(255, 0, 0);
  rectMode(CENTER);
  rect(mouseX, 1000, 120, 25);
  ellipseMode(CENTER);
}
