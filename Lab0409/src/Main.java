import java.util.*;

public class Main {

    public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        int b = scan.nextInt();
        int c = scan.nextInt();
        int p;

        if (a + b > c && a + c > b && c + b > a ) {
            p = a + b + c;
            System.out.println("The perimeter of a triangle: " + p);
        } else {
             System.out.println("The input is invalid");
        }


    }
}
