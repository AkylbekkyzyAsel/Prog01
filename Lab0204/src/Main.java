import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	    Scanner scan = new Scanner(System.in);
	    System.out.print("Length in inches? ");
	    int a = scan.nextInt();
	    double b = 2.54 * a;
	    System.out.printf("%d in. = %.2f cm. ", a, b);

    }
}
