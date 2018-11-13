import java.util.*;

public class Main {

    public static void main(String[] args) {
	    Scanner scan = new Scanner(System.in);
        int m = scan.nextInt();

       if (m == 3 || m == 4 || m == 5) {
           System.out.println("spring");
       } else if (m == 6 || m == 7 || m == 8) {
           System.out.println("summer");
       } else if (m == 9 || m == 10 || m == 11) {
           System.out.println("autumn");
       } else if (m == 12 || m == 1 || m == 2) {
           System.out.println("winter");
       }


    }
}
