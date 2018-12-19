import processing.core.PApplet;

import javax.swing.*;

public class Main extends PApplet {
        int [] a = new int [900];
        int [] b = new int [900];
        int t;


    public void settings() {
        fullScreen();
    }

    public void setup() {
        t = 0;
        a[800] = 50;
        a[700] = 100;
        a[600] = 190;
        a[500] = 240;
        a[400] = 300;
        a[300] = 240;
        a[200] = 190;
        a[100] = 100;
        a[0] = 50;
        b[800] = 50;
        b[700] = 100;
        b[600] = 190;
        b[500] = 240;
        b[400] = 300;
        b[300] = 240;
        b[200] = 190;
        b[100] = 100;
        b[0] = 0;

        frameRate(10);
    }


    public void draw() {
        background(0);
        stroke(255,0,0);
        for(int i = a.length; i > 0; i -= 100) {
            fill(255,0,0,b[t]);
            e(width / 2 -500 + i, (int)a[t]);
            t += 100;
            if(t > 800)
                t -= 900;
        }
        t += 100;
        if (t > 800)
            t -= 900;
    }

    private void e(int i, int i1) {
        ellipse(i, height / 2, 100, i1);
    }

    public static void main(String... args) {
        PApplet.main("Main");
    }
}