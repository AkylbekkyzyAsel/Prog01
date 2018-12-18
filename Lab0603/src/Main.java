import processing.core.PApplet;

import javax.swing.*;

public class Main extends PApplet {



    public void settings() {
        fullScreen();
    }

    public void setup() {
        background(0);
        strokeWeight(4);
    }


    public void draw() {
        drawStar(width / 2, height / 2, 200, 0xFFFF0000);
        drawStar(width / 4, height / 4, 100, 0xFFFFFF00);
        drawStar(3 * width / 4, height / 4, 100, 0xFFFFFF00);
        drawStar(width / 4, 3 * height / 4, 100, 0xFFFFFF00);
        drawStar(3 * width / 4, 3 * height / 4, 100, 0xFFFFFF00);
    }

    void drawStar(float x, int y, float r, int c) {
        pushMatrix();
        translate(x, y);
        stroke(c);
        line(-r, 0, r, 0);
        line(0, -r, 0, r);
        line(-r / 4, -r / 4, r / 4, r / 4);
        line(r / 4, -r / 4, -r / 4, r / 4);
        line(0, -r, r / 4, -r / 4);
        line(r / 4, -r / 4, r, 0);
        line(r, 0, r / 4, r / 4);
        line(r / 4, r / 4, 0, r);
        line(0, r, -r / 4, r / 4);
        line(-r / 4, r / 4, -r, 0);
        line(-r, 0, -r / 4, -r / 4);
        line(-r / 4, -r / 4, 0, -r);

        popMatrix();
    }

    public static void main(String... args) {
        PApplet.main("Main");
    }
}