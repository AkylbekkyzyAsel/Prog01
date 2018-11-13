import java.util.*;

public class ComputeArea {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("1st int? ");
        int a = scan.nextInt();
        System.out.print("2nd int? ");
        int b = scan.nextInt();
        System.out.println( "a + b = " + (a + b));
        System.out.println( "a - b = " + (a - b));
        System.out.println( "a * b = " + a * b );
        System.out.println( "a / b = " + a / b );
        System.out.println( "a % b = " + a % b );
    }
}