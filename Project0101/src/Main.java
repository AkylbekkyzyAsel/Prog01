import processing.core.PApplet;

public class Main extends PApplet {
    float r = 150;
    float dr = 2;
    float r2 = 70;
    float dr2 = 2;
    float r3 = 70;
    float dr3 = 2;
    float r4 = 70;
    float dr4 = 2;
    float r5 = 70;
    float dr5 = 2;

    public void settings() {
        fullScreen();

    }

    public void draw() {
        background(0);{}

        stroke(255, 0, 0);
        strokeWeight(3);

        float a = width / 2;
        float b = height / 2;




        line(a, b, a, b + r);
        line(a, b, a, b - r);

        line(a, b, a + r, b);
        line(a, b, a - r, b);

        line(a, b, a + r / 4, b - r / 4);
        line(a, b, a - r / 4, b + r / 4);

        line(a, b, a - r / 4, b - r / 4);
        line(a, b, a + r / 4, b + r / 4);

        line(a, b - r, a + r / 4, b - r / 4);
        line(a, b - r, a - r / 4, b - r / 4);
        line(a, b + r, a + r / 4, b + r / 4);
        line(a, b + r, a - r / 4, b + r / 4);

        line(a + r, b, a + r / 4, b - r / 4);
        line(a + r, b, a + r / 4, b + r / 4);
        line(a - r, b, a - r / 4, b - r / 4);
        line(a - r, b, a - r / 4, b + r / 4);
        r += dr;
        if(r < 70){
            dr = -dr;
        }
        if(r > 150){
            dr = -dr;
        }


        float c = width / 5;
        float d = height / 5;


        stroke(255, 0 ,200);


        line(c , d , c , d + r2);
        line(c, d, c ,d - r2);

        line(c , d, c + r2 , d);
        line(c , d, c - r2 , d);

        line(c , d , c + r2 / 4, d - r2 / 4);
        line(c , d , c - r2 / 4, d + r2 / 4);

        line(c , d , c - r2 / 4, d - r2 / 4);
        line(c , d , c + r2 / 4, d + r2 / 4);

        line(c , d - r2, c + r2 /4 , d - r2 / 4);
        line(c , d - r2, c - r2 /4 , d - r2 / 4);
        line(c , d + r2, c + r2 /4 , d + r2 / 4);
        line(c , d + r2, c - r2 /4 , d + r2 / 4);

        line(c + r2, d, c + r2 /4 , d - r2 / 4);
        line(c + r2, d, c + r2 /4 , d + r2 / 4);
        line(c - r2, d, c - r2 /4 , d - r2 / 4);
        line(c - r2, d, c - r2 /4 , d + r2 / 4);

        r2 += dr2;
        if(r2 < 70){
            dr2 = -dr2;
        }
        if(r2 > 150){
            dr2 = -dr2;
        }

        float e = width / 5 * 4;
        float f = height / 5 * 4;

        line(e , f , e , f + r3);
        line(e, f, e ,f - r3);

        line(e , f, e + r3 , f);
        line(e , f, e - r3 , f);

        line(e , f , e + r3 / 4, f - r3 / 4);
        line(e , f , e - r3 / 4, f + r3 / 4);

        line(e , f , e - r3 / 4, f - r3 / 4);
        line(e , f , e + r3 / 4, f + r3 / 4);

        line(e , f - r3, e + r3 /4 , f - r3 / 4);
        line(e , f - r3, e - r3 /4 , f - r3 / 4);
        line(e , f + r3, e + r3 /4 , f + r3 / 4);
        line(e , f + r3, e - r3 /4 , f + r3 / 4);

        line(e + r3, f, e + r3 /4 , f - r3 / 4);
        line(e + r3, f, e + r3 /4 , f + r3 / 4);
        line(e - r3, f, e - r3 /4 , f - r3 / 4);
        line(e - r3, f, e - r3 /4 , f + r3 / 4);

        r3 += dr3;
        if(r3 < 70){
            dr3 = -dr3;
        }
        if(r3 > 150){
            dr3 = -dr3;
        }
        float g = width / 5;
        float h = height / 5 * 4;

        line(g , h , g , h + r4);
        line(g, h, g ,h - r4);

        line(g , h, g + r4 , h);
        line(g , h, g - r4 , h);

        line(g , h , g + r4 / 4, h - r4 / 4);
        line(g , h , g - r4 / 4, h + r4 / 4);

        line(g , h , g - r4 / 4, h - r4 / 4);
        line(g , h , g + r4 / 4, h + r4 / 4);

        line(g , h - r4, g + r4 /4 , h - r4 / 4);
        line(g , h - r4, g - r4 /4 , h - r4 / 4);
        line(g , h + r4, g + r4 /4 , h + r4 / 4);
        line(g , h + r4, g - r4 /4 , h + r4 / 4);

        line(g + r4, h, g + r4 /4 , h - r4 / 4);
        line(g + r4, h, g + r4 /4 , h + r4 / 4);
        line(g - r4, h, g - r4 /4 , h - r4 / 4);
        line(g - r4, h, g - r4 /4 , h + r4 / 4);

        r4 += dr4;
        if(r4 < 70){
            dr4 = -dr4;
        }
        if(r4 > 150){
            dr4 = -dr4;
        }
        float i = width / 5 * 4;
        float j = height / 5;

        line(i , j , i , j + r5);
        line(i, j, i ,j - r5);

        line(i , j, i + r5 , j);
        line(i , j, i - r5 , j);

        line(i , j , i + r5 / 4, j - r5 / 4);
        line(i , j , i - r5 / 4, j + r5 / 4);

        line(i , j , i - r5 / 4, j - r5 / 4);
        line(i , j , i + r5 / 4, j + r5 / 4);

        line(i , j - r5, i + r5 /4 , j - r5 / 4);
        line(i , j - r5, i - r5 /4 , j - r5 / 4);
        line(i , j + r5, i + r5 /4 , j + r5 / 4);
        line(i , j + r5, i - r5 /4 , j + r5 / 4);

        line(i + r5, j, i + r5 /4 , j - r5 / 4);
        line(i + r5, j, i + r5 /4 , j + r5 / 4);
        line(i - r5, j, i - r5 /4 , j - r5 / 4);
        line(i - r5, j, i - r5 /4 , j + r5 / 4);

        r5 += dr5;
        if(r5 <
                70){
            dr5 = -dr5;
        }
        if(r5 > 150){
            dr5 = -dr5;
        }

    }

    public static void main(String... args) {
        PApplet.main("Main");
    }
}