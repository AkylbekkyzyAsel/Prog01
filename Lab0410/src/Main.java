import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String d;
        String e;
        int a = (int) (1 + Math.random() * 13);
        int b = (int) (1 + Math.random() * 4);
        if (b == 1) {
            e = "Hearts";
        } else if (b == 2) {
            e = "Clubs";
        } else if (b == 3) {
            e = "Diamonds";
        } else {
            e = "Spades";
        }
        if (a == 1) {
            d = "Ace";
            System.out.println("The card you picked is " + d + " of " + e);
        } else if (a == 11) {
            d = "Jack";
            System.out.println("The card you picked is " + d + " of " + e);
        } else if (a == 12) {
            d = "Queen";
            System.out.println("The card you picked is " + d + " of " + e);
        } else if (a == 13) {
            d = "King";
            System.out.println("The card you picked is " + d + " of " + e);
        } else {
            System.out.println("The card you picked is " + a + " of " + e);
        }


    }


    }

