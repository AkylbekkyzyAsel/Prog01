import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
	    Scanner scan = new Scanner(System.in);
	    System.out.print("Enter a point with two coordinates: ");
	    int x = scan.nextInt();
	    int y = scan.nextInt();
	    int c = 10;
	    int r = x * x + y * y;
		double a = (double)x;
		double b = (double) y;
	    if (Math.sqrt(r)> c) {
	        System.out.printf("Point (%.1f, %.1f) is not in the circle", a, b);
        } else
        	System.out.printf("Point (%.1f, %.1f) is in the circle", a, b);

    }
}
