import java.util.*;

public class Main {

    public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);
	System.out.print("complexity level? ");
	int a = scan.nextInt();

	if (a == 0) {
        System.out.print("You are a total newbie.");
    } else if (a == 1) {
        System.out.print("You are a beginner.");
    } else if (a == 2 || a == 3) {
        System.out.print("You are an experienced gamer.");
    } else if (a == 4 || a == 5) {
        System.out.print("You are a pro gamer.");
    }


    }
}
