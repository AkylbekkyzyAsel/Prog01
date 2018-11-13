import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter three integers: ");
		int a = scan.nextInt();
		int b = scan.nextInt();
		int c = scan.nextInt();
		int max;

		if (b < a || c < a) {
			if (b < a) {
				max = a;
				a = b;
				b = max;
			}
			if (c < a) {
				max = a;
				a = c;
				c = max;
			}
		}
		if (c < b) {
			max = b;
			b = c;
			c = max;
		}
		System.out.println(a + " " + b + " " + c);
	}
}






