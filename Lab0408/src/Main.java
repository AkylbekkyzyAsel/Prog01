import java.util.*;

public class Main {

    public static void main(String[] args) {
	    Scanner scan = new Scanner(System.in);
	    double w = scan.nextDouble();
	    double c;
	    if (w > 50) {
	        System.out.print("The package cannot be shipped");
        } else if (w > 0 && w <=1) {
            c = 3.5 * w;
            System.out.print("The shipping cost: " + c );
        } else if (w <= 3 && w > 1) {
            c = 5.5 * w;
            System.out.print("The shipping cost: " + c);
        } else if (w <= 10 && w > 3) {
            c = 8.5 * w;
            System.out.print("The shipping cost: " + c);
        }else if (w <=20 && w > 10) {
            c = 10.5 * w;
            System.out.print("The shipping cost: " + c);
        }



    }
}
