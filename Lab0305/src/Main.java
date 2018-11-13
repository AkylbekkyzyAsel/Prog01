import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Number of points? ");
        int a = scan.nextInt();

        if (a > 100 || a < 0) {
        System.out.printf("%d is not in the permitted range.", a );
        } else if (a >= 90) {
            System.out.print("Grade: A");
        } else if (a >= 80) {
            System.out.print("Grade: B");
        } else if (a >= 70) {
            System.out.print("Grade: C");
        } else if (a >= 60) {
            System.out.print("Grade: D");
        } else if (a < 60) {
            System.out.print("Grade: F");
        }


    }
}
