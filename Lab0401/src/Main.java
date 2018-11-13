import java.util.*;

public class Main {

    public static void main(String[] args) {
	    Scanner scan = new Scanner(System.in);
        double d = 0.1;
        for (int i = 0; i < 10; i ++) {
            d +=0.1;
        }
        if (d == 1.0) {
            System.out.println("Equal");
        } else {
            System.out.println("Not equal");
        }



    }

}
