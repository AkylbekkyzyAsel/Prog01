import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int m = scan.nextInt();

        switch (m) {
            case 3:
            case 4:
            case 5: System.out.println("spring");break;
            case 6:
            case 7:
            case 8: System.out.println("summer");break;
            case 9:
            case 10:
            case 11: System.out.println("autumn");break;
            case 12:
            case 1:
            case 2: System.out.println("winter");break;

        }


    }
}
