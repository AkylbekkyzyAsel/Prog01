import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("A = ");
        int a = scan.nextInt();

        System.out.print("B = ");
        int b = scan.nextInt();

        try {
            System.out.printf("GCD(%d, %d) = %d%n", a, b, gcd(a, b));
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
    }

    private static int gcd(int a, int b) {
        if (a == 0 && b == 0) {
            throw new IllegalArgumentException("gcd(0, 0) is not defined");
        }
        if (a == 0) {
            return b;
        }
        if (b == 0) {
            return a;
        }

        a = Math.abs(a);
        b = Math.abs(b);
        int r = a % b;
        while (r != 0) {
            a = b;
            b = r;
            r = a % b;
        }

        return b;

    }
}