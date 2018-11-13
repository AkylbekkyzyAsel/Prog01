import java.util.*;

public class Main {

    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.print("1st double? ");
        double a = scan.nextDouble();
        System.out.print("1nd double? ");
        double b = scan.nextDouble();
        System.out.println("a + b = " + (a + b));
        System.out.println("a + b = " + (a - b));
        System.out.println("a + b = " + a * b);
        System.out.println("a + b = " + a / b);
        System.out.println("a + b = " + a % b );

    }
}
