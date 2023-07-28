package Week8;

import java.util.Scanner;
import java.lang.Math;

public class PracticeMidterm {
    public static void main (String [] args){
        Scanner input = new Scanner(System.in);
        /* WAP prompts the user to enter the score for each player for each of the three games,
        and then displays the average score for each player
         */
        float num_player= 4;
        float num_game = 3;
        for (int i = 1; i <= num_player; i++){
            System.out.println("Score for player " + i);
            float sum = 0;
            for (int j = 1; j <= num_game; j++){
                System.out.print("Game " + j + ": ");
                int game = input.nextInt();
                sum += game;
            }
             float avr_score = sum/(float)3;
            System.out.printf("Average Score: %,.2f%n", avr_score); //%,.2f%n công thức cho làm tròn 2 chữ số (dk là số đó phải float hoặc double)

        }







    }
}
