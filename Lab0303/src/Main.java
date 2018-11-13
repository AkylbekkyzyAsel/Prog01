import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("1st number? ");
        int a = scan.nextInt();
        System.out.print("2nd number? ");
        int b = scan.nextInt();
        System.out.print("3rd number? ");
        int c = scan.nextInt();
        int max = a;
        if( a > b ) {
            max = a;
        } else max = b;

        if( max > c) {
            max = max ;
        } else max = c;
        System.out.printf("The value %d is the greatest one.", max );

        }
    }

