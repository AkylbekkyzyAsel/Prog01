import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	    Scanner scan = new Scanner(System.in);
	    System.out.print("Enter a number in pounds: ");
	    double p = scan.nextDouble();
	    double k = 0.454 * p;
	    System.out.printf("%.1f pounds is %.3f kilograms ", p, k);
    }
}
