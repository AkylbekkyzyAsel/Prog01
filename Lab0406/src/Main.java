import java.util.*;

public class Main {

    public static void main(String[] args) {
	    Scanner scan = new Scanner(System.in);
	    System.out.print("Enter a point with two coordinates: ");
	    int x = scan.nextInt();
        int y = scan.nextInt();
        double a = 10.0;
        double b = 5.0;
        double c = (double)x;
        double d = (double)y;
        double r = 10.0 / 2;
        double s = 5.0 / 2;
        if (x <= r && x >= -r && y <= s && y >= -s) {
            System.out.printf("Point (%.1f, %.1f) is in the rectangle", c, d);
        } else {
            System.out.printf("Point (%.1f, %.1f) is not in the rectangle", c, d);
        }



    }
}
