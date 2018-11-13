
public class Main {

    public static void main(String[] args) {
        double b = 0;
        int a = 0;
        double s;
        int d;
        do {
            d = (int) (Math.random() * 6);
            a += d;
            b += 1;
        System.out.println(d);
        } while ( d != 0);
        b -= 1;
        s = a / b;
        if (a == 0 || b == 0) {
            System.out.print("Nothing to calculate");
        }else {
            System.out.printf("the arithmetic mean is %.1f", s);
        }


    }
}
