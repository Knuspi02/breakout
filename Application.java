import processing.core.PApplet;

public class Application extends PApplet {

    @Override
    public void settings() {
        fullScreen();
    }

    @Override
    public void setup() {
        //frameRate(60);
        background(0);
        noStroke();
    }

    @Override
    public void draw() {
        int x = 920;
        int y = 540;
        background(0);
        text("" + frameRate,10,20);
        fill(255, 0, 0);
        rectMode(CENTER);
        rect(mouseX, 1000, 120, 25);
        ellipseMode(CENTER);
        while (y <= 1080) {
            /*if (x == 10) {
            }*/
            y++;
        }
        fill(0,255,255);
        ellipse(x,y,28,28);
    }
}