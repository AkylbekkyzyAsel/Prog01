import processing.core.PApplet;
 import javax.swing.*;

public class Main extends PApplet {

    float v = 0;
    float e = 0;
    float m = 0;

    public void settings() {
        fullScreen();

    }

    public void setup() {
        noStroke();
    }


    public void draw() {
        fill(0, 100);
        rect(0, 0, width, height);

        fill(255, 250, 0);
        translate(width / 2, height / 2);
        ellipse(0, 0, 200, 200);

        pushMatrix();
        rotate(v);
        fill(0, 255, 255);
        translate(90, 90);
        ellipse(0, 0, 50, 50);
        popMatrix();

        rotate(e);
        fill(0, 0, 255);
        translate(200, 200);
        ellipse(0, 0, 51, 51);

        rotate(m);
        fill(225);
        translate(30, 30);
        ellipse(0, 0, 25, 25);

        v += 0.1;
        e += 0.01;
        m += 0.02;

    }

    public static void main(String... args) {
        PApplet.main("Main");
    }
}