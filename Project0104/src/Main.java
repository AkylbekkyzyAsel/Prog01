import processing.core.PApplet;

import javax.swing.*;

public class Main extends PApplet {

    static String fir;
    static String sec;

    float x;
    float x1;
    float y;
    float y1;
    float dx = 5;
    float dx1 = 5;

    public void settings() {
        fullScreen();
    }

    public void setup() {
        x = width / 2;
        x1 = width / 2;
        y = height / 3;
        y1 = height / 3 * 2;
        frameRate(100);
    }

    public void draw() {
        background(0);
        fill(255, 0, 0);
        textSize(160);
        textAlign(CENTER, CENTER);
        text(fir, x, y);
        fill(0, 255, 0);
        textSize(160);
        textAlign(CENTER, CENTER);
        text(sec, x1, y1);

        float w = textWidth(fir) / 2;
        float w2 = textWidth(sec) / 2;


        if (w > w2) {
            dx1 = ((width / 2 - w2) * dx) / (width / 2 - w);
        }
        if (w2 > w) {
            dx = ((width / 2 - w) * dx1) / (width / 2 - w2);
        }

        if (x > width - w) {
            dx = -dx;
        }
        if (x - w < 0) {
            dx = -dx;
        }
        if (x1 > width - w2) {
            dx1 = -dx1;
        }
        if (x1 - w2 < 0) {
            dx1 = -dx1;
        }

        x += dx;
        x1 -= dx1;
    }

    public static void main(String... args) {
        fir = JOptionPane.showInputDialog("First word: ");
        sec = JOptionPane.showInputDialog("Second word: ");
        PApplet.main("Main");
    }
}