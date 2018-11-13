import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	    Scanner scan = new Scanner(System.in);
	    System.out.print("some real number? ");
	    double a = scan.nextDouble();
        if (a < 0) {
            a = -a;
            System.out.printf("|%.1f| = %.1f", -a, a);
        }else System.out.printf("|%.1f| = %.1f", a, a);
    }
}
