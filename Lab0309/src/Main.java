import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int computer = (int)(Math.random() * 3);
        System.out.print("scissor (0), rock (1), paper (2): ");
        int you = scan.nextInt();
        System.out.print("The computer is ");

            switch (computer) {
                    case 0: System.out.print("scissor."); break;
                    case 1: System.out.print("rock."); break;
                    case 2: System.out.print("paper.");
                }

                System.out.print(" You are ");
            switch (you) {
                    case 0: System.out.print("scissor"); break;
                    case 1: System.out.print("rock"); break;
                    case 2: System.out.print("paper ");
                }
            if (computer == you) {
                System.out.println(" too. It is a draw");
            }else
                {
                    boolean win = (you == 0 && computer == 2)
                            || (you == 1 && computer == 0) || (you == 2 && computer == 1);
                    if (win)
                        System.out.println(". You won");
                    else
                        System.out.println(". You lose");
                }
            }
        }