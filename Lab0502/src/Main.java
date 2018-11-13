import java.util.*;

public class Main {

    public static void main(String[] args) {
	    Scanner scan = new Scanner(System.in);
	    System.out.print("Integer? ");
	    int a = scan.nextInt();
	    int b = 0;

	    while (a != 0) {
            b += a % 10;
            a = a / 10;
        }
        System.out.println("The sum of all digits is " + b);


    }
}
