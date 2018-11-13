import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("What is your name?");
        String username = scan.next();
        System.out.print("Hello!");
        System.out.println(username);
    }
}

