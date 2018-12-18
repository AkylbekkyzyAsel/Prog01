import processing.core.PApplet;

import javax.swing.*;

public class Main extends PApplet {

    static int n;

    public void settings() {
        fullScreen();
    }

    public void setup() {

    }


    public void draw() {
        background(0);

        float r = Math.min(width, height) / 2;
        float dr = r / n;
        float c = 5;
        float dc = (255 - c) / n;

        for (int i = 0; i < n; ++i) {
            fill(c, 0, 0);
            ellipse(width / 2, height / 2, 2 * r, 2 * r);
            r -= dr;
            c += dc;
        }
    }

    public static void main(String... args) {
        n = Integer.parseInt(JOptionPane.showInputDialog("N: "));
        PApplet.main("Main");
    }
}