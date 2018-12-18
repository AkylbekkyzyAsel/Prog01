import java.util.*;

public class Main {
    static Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.print("Rows? ");
        int rows = scan.nextInt();

        System.out.print("Columns? ");
        int cols = scan.nextInt();

        int[][] a = new int[rows][cols];
        read2DArray(a);

        System.out.printf("Sum of elements is " + sum(a));

    }


    static void read2DArray(int[][] a) {
        int rows = a.length;
        int cols = a[0].length;
        System.out.printf("Enter %d rows and %d columns\n", rows, cols);

        for (int r = 0; r < a.length; ++r) {
            for (int c = 0; c < a[r].length; ++c) {
                a[r][c] = scan.nextInt();
            }
        }

    }

    static long sum(int[][] a) {
        long res = 0;
        for (int[] r : a) {
            for (int e : r) {
                res += e;
            }
        }
        return res;
    }
}
