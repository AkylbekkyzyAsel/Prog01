import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.print("Enter the number of years: ");
		int a = input.nextInt();
		int p = 312032486 + (((31536000 / 7) - (31536000 / 13)
				+ (31536000 / 45)) * a);
		System.out.println("The population in " + a + " is " + p);
	}
}