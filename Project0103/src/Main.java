import processing.core.PApplet;

import javax.swing.*;

public class Main extends PApplet {
    int r = 55;
    int rr= 120;

    public void settings() {
        fullScreen();
    }

    public void setup() {
        background(0);
        stroke(255, 0, 0);
        strokeWeight(2);
        fill(255,0,0,180);
        int x = width / 6;
        int [] a  = new int [9];
        for(int i = 0; i < a.length; ++i){
            ellipse(x, height/2, rr, r);
            x+=rr;
        }

    }


    public void draw() {
        fill(60, 0, 0);
        stroke(200, 0, 0);

//        ellipse(width / 6, height / 2, rr, r);
//        ellipse(width / 4, height / 2, rr,rr);
//        ellipse(width / 3, height / 2, rr, r);
//        ellipse(3 * width / 7, height / 2, rr, r);
//        ellipse(width / 2, height / 2, rr, r);
//        ellipse(3 * width / 5, height / 2, rr, r);
//        ellipse(2 * width / 3, height / 2, rr, r);
//        ellipse(3 * width / 4, height / 2, rr, r);
//        ellipse(5 * width / 6, height / 2, rr, r);
    }



    public static void main(String... args) {
        PApplet.main("Main");
    }
}