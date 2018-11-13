import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	    Scanner scan = new Scanner(System.in);
	    System.out.print("Temperature in degrees Fahrenheit? ");
	    int a = scan.nextInt();
	    double b = (a - 32) * 5.0/9;
        System.out.printf("The temperature in degrees Celsius is %.2f", b);


    }
}
