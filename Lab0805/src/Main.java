import java.util.*;

public class Main {
    static Scanner scan = new Scanner(System.in);
    static int n = scan.nextInt();
    public static void main(String[] args) {

        float [][] matrix1 = getmatrix(1);
        float [][] matrix2 = getmatrix(2);
        float [][] matrix3 = multiplyMatrix(matrix1, matrix2);


        print(matrix1, matrix2, matrix3);
    }

        static float[][] getmatrix(int n) {

        System.out.print("Enter matrix" + n + ": ");
        float[][] m = new float[3][3];
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++)
                m[i][j] = scan.nextFloat();
        }

        return m;
    }

         static float[][] multiplyMatrix(float[][] a, float[][] b) {
        float[][] c = new float[3][3];

        for (int i = 0; i < c.length; i++) {
            for (int j = 0; j < c[i].length; j++) {
                for (int h = 0; h < c.length; h++) {
                    c[i][j] += a[i][h] * b[h][j];
                }
            }
        }
        return c;
    }


        static void print(float[][] m, int r) {
        for (int j = 0; j < m[r].length; j++) {
            System.out.printf("%5.1f", m[r][j]);
        }
    }


        static void print(float[][] m1, float[][] m2, float[][] m3) {
        System.out.println("The matrices are added as follows");

        for (int i = 0; i < 3; i++) {
            print(m1, i);
            System.out.print((i == 1 ? "   * " : "     "));
            print(m2, i);
            System.out.print((i == 1 ? "   = " : "     "));
            print(m3, i);
            System.out.println();
        }
    }
}


