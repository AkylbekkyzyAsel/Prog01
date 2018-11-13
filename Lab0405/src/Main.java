import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Year? ");
        int y = scan.nextInt();
        System.out.print("Month? ");
        int m = scan.nextInt();

        switch (m) {
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                System.out.println("Number of days: 31");
                break;
            case 4:
            case 6:
            case 9:
            case 11:
                System.out.println("Number of days: 30");
                   break;
            case 2:
                boolean isLeap =  y % 400 == 0 && y % 4 == 0 || y % 100 != 0;
                if ( isLeap) {
                     System.out.println("Number of days: 29");
                 } else {
                     System.out.println("Number of days: 28");
                 }
                 break;

        }

    }
}
