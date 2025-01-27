// Using Scanner or Random make Rock Paper Scissor game.
import java.nio.channels.Pipe.SourceChannel;
import java.util.*;

public class SPS {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int choice = 0;
        String wanna_continue = "Y";
        int comp_choice;

        while (wanna_continue.equals("Y")) {
            System.out.println("Enter Choice (St for Stone, Pa for Paper, Sc for Scissors): ");
            String user_choice = sc.next();

            if (user_choice.equals("St")) {
                choice = 1;
            } else if (user_choice.equals("Pa")) {
                choice = 2;
            } else if (user_choice.equals("Sc")) {
                choice = 3;
            } else {
                System.out.println("Invalid Choice");
                continue;
            }

            comp_choice = (int) (Math.random() * 3) + 1;

            if (comp_choice == choice) {
                System.out.println("Draw");
            } 
            else if ((comp_choice == 1 && choice == 2) || (comp_choice == 2 && choice == 3) || (comp_choice == 3 && choice == 1)) {
                System.out.println("User Wins");
            } else {
                System.out.println("Computer Wins");
            }

            System.out.println("Do you want to continue? Y/N");
            wanna_continue = sc.next();
        }

        System.out.println("Thank you for playing!");
        sc.close();
    }
}