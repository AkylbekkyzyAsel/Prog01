import processing.core.PApplet;

import javax.swing.*;

public class Main extends PApplet {

  static int n;
    public void settings() {
        fullScreen();
    }
    public void setup() {
        frameRate(100);
    }

    public void draw() {

        background(0);
        for (int i = 0; i < n; ++i) {
            float x = random(width);
            float y = random(height);
            float r = random(10,50);
            float rc = random(255);
            float gc = random(255);
            float bc = random(255);
            fill(rc,gc,bc);
            ellipse(x, y, 2 *r, 2 * r);

        }

        noLoop();


    }

    public static void main(String... args) {
        n = Integer.parseInt(JOptionPane.showInputDialog("N: "));
        PApplet.main("Main");
    }

}
