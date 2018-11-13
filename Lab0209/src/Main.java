import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	    Scanner scan = new Scanner(System.in);
        System.out.print("Enter the nimber of minutes: ");
        int m = scan.nextInt();
        int y = m / 24 / 60 / 365;
        int d = (m - y * 24 * 60 * 365) / 24 / 60;
        System.out.printf("%d minutes is approximately" +
                " %d years and %d days", m, y, d);
    }
}
