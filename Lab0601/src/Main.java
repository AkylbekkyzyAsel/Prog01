import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Your coordinate? ");
        int x = scan.nextInt();

        System.out.print("Coordinate of 1st point? ");
        int x1 = scan.nextInt();

        System.out.print("Coordinate of 2nd point? ");
        int x2 = scan.nextInt();

        int d1 = abs(x - x1);
        int d2 = abs(x - x2);

        if (d1 < d2) {
            System.out.printf("1st point closer. Distance %d%n", d1);
        } else if (d1 > d2) {
            System.out.printf("2nd point closer. Distance %d%n", d2);
        } else {
            System.out.printf("Same distance %d%n", d1);
        }


    }

    // x - parameter
    static int abs(int x) {
        int r = x;
        if (r < 0) {
            r = -r;
        }
        return r;
    }

}