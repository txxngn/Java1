import java.sql.SQLOutput;
import java.util.Scanner;
public class Practice7 {
    public static void main (String [] args){
        Scanner input = new Scanner (System.in);

        //Prompts user to enter an answer of addition of two single digits
        //Using a loop, rewrite program to let user enter a new answer until it is correct

        int num;

        while (true) {
            System.out.println("What is 3+4?");
            num = input.nextInt();
            if (num == 7) {
                System.out.println("Correct");
                break;
            } else
                System.out.println("Incorrect");
        }


    }
}
