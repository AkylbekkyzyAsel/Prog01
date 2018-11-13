import java.util.*;

public class Main {

    public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);
	System.out.print("Number of tests? ");
	int x = scan.nextInt();
	int a ;
	int b ;
	int y = 0;
	int c;
	int d = 0;
	int e = 0;
    while (y != x) {
        y ++;
        a = -100 + (int) (Math.random() * 200);
        b = -100 + (int) (Math.random() * 200);
        System.out.printf("%d + %d = ", a, b);
        c = scan.nextInt();
        if (a + b == c) {
            d +=1;
        }
        if (a + b != c) {
            e +=1;
        }
    }System.out.println("Number of correct answers: " + d);
    System.out.println("Number of incorrect answers: " + e);
    }
}
