import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);
    System.out.print("Enter a, b, c: ");
    double a = scan.nextDouble();
    double b = scan.nextDouble();
    double c = scan.nextDouble();
    double d = b * b - 4 * a * c;
    double r1 = (-b + Math.pow(d, 0.5)) / 2 * a;
    double r2 = (-b - Math.pow(d, 0.5)) / 2 * a;
    double r = -b / 2 * a;
    if (d > 0) {
        System.out.printf("The equation has two roots %.6f and %.6f", r1, r2);
    } else if(d == 0) {
        System.out.print("The equation has one root " + r);
    } else if(d < 0) {
        System.out.print("The equation has no real roots");
    }

    }
}
