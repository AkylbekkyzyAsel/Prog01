import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	    Scanner scan = new Scanner(System.in);
        System.out.printf("Enter the radius and length" +
                " of a cylinder: ");
	    double r = scan.nextDouble();
	    int l = scan.nextInt();
        double a = r * r *  3.14159;
        double v = a * l;
        System.out.printf("The aria is %.4f%n", a);
        System.out.printf("The volume is %.1f", v);
    }
}
