import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("Number of points? ");
		int a = scan.nextInt();
		if ( a < 0 || a > 100 ) {
			System.out.print("Incorrect input");
		}
			else if (a < 40){
			System.out.print("You failed “Structured Programming”!!!\nYou can take it again in the fall semester of 2019.");
    		}
    			else {
        		System.out.print("You passed “Structured Programming!!!\nYou should take “Object-Oriented Programming” in the next semester");
    			}
    }
}
