 import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        int a = (int) (Math.random() * 1000);
        Scanner input = new Scanner(System.in);
        System.out.print("Enter your lottery pick (two digits): ");
        int b = input.nextInt();
        int x = a / 10;
        int x2 = x / 10;
        int x3 = a % 10;
        int x4 = x % 10;
        int y = b / 10;
        int y2 = y / 10;
        int y3 = b % 10;
        int y4 = y % 10;

        System.out.println("The lottery number is " + a);
        if (b == a)
            System.out.println("Exact match: you win $10,000");
        else if (x2 == y3 && x4 == y4 && x3 == y2)
            System.out.println("Match all digits: you win $3,000");
        else if (x2  == y2 || x2 == y3 || x2 == y4
                && x3 == y2 || x3 == y3 || x3 == y4
                && x4 == y2 || x4 == y3 || x4 == y4)
            System.out.println("Match one digit: you win $1,000");
        else
            System.out.println("Sorry, no match");
    }
    }


