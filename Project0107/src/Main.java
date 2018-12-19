import processing.core.PApplet;

import javax.swing.*;

public class Main extends PApplet {

    static float num;
    static float dif;

    float angle = 0;
    final float PI = 3.14f;
    float c = 2 * PI / num;
    float x = c * dif;


    public void settings() {
        fullScreen();
        noSmooth();
    }

    public void setup() {

    }

    public void draw() {
        background(0);
        stroke(255, 0, 0);
        strokeWeight(8);
        translate(width / 2, height / 2);
        rotate(angle);
        for (int i = 0; i < num; i++) {
            point(300, 0);
            rotate(c);
            line(300, 0, cos(x) * 300, sin(x) * 300);
        }
        angle += 0.01;
    }

    public static void main(String... args) {
        num = Float.parseFloat(JOptionPane.showInputDialog("N: "));
        dif = Float.parseFloat(JOptionPane.showInputDialog("M: "));
        PApplet.main("Main");
    }
}
