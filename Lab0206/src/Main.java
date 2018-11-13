import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	    Scanner scan = new Scanner(System.in);
	    System.out.print("Enter a degree in Celsius: ");
	    double c = scan.nextDouble();
	    double f = (9.0 / 5) * c + 32;
        System.out.printf("%.0f Celsius = is %.1f Fahrenheit", c, f);
    }
}
