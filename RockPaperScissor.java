import java.util.Random;
import java.util.Scanner;

public class RockPaperScissor {
    public static void main(String[] args) {
        int c = 0, u = 0;
        System.out.println("There will be 5 Rounds of this Game.Get Ready!");
        for (int i = 0; i < 5; i++) {
            Random rand = new Random();
            String cc = "x";
            int computer_choice = rand.nextInt(3);
            switch (computer_choice) {
                case 0:
                    cc = "rock";
                    break;
                case 1:
                    cc = "paper";
                    break;
                case 2:
                    cc = "scissor";
                    break;
            }
            // System.out.println(cc);
            System.out.println("Enter your Stratergy");
            Scanner sc = new Scanner(System.in);
            String user_choice = sc.next();         //*****do not use '==',always use equals() to compare two strings;
            if (user_choice.equals(cc)) {
                System.out.println("DRAW\n");  
            } else if (user_choice.equals("rock") && cc.equals("paper")) {
                System.out.println("YOU LOSE!!\n");
                c++;
            } else if (user_choice.equals("rock") && cc.equals("scissor")) {
                System.out.println("CONGRATS!!YOU WON THIS ROUND\n");
                u++;
            } else if (user_choice.equals("paper") && cc.equals("scissor")) {
                System.out.println("YOU LOSE!!\n");
                c++;
            } else if (user_choice.equals("paper") && cc.equals("rock")) {
                System.out.println("CONGRATS!!YOU WON THIS ROUND\n");
                u++;
            } else if (user_choice.equals("scissor") && cc.equals("paper")) {
                System.out.println("CONGRATS!!YOU WON THIS ROUND\n");
                c++;
            } else {
                System.out.println("YOU LOSE!!\n");
                c++;
            }
        }
        if (u == c) {
            System.out.println("DRAW:PLAY AGAIN");
        }
        else if (u > c) {
            System.out.println("YIPEEEE!!YOU WON THIS GAME.WANNA PLAY AGAIN:)");
        } else {
            System.out.println("OOPS!!YOU LOOSE..RETRY:)");
        }
        
    }
}
