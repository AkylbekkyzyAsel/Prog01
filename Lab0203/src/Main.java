import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.print(" a four-digit integer? ");
	    Scanner scan = new Scanner(System.in);
	    int n = scan.nextInt();
	    int s = 0;
	    s += n%10;
        n /= 10;

        s += n % 10;
        n /=10;

        s += n % 10;
        n /= 10;

        s += n;
        System.out.print("The sum of all digits is " + s);
    }
}
