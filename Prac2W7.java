package Week7;
//TN
import java.util.Scanner;
import java.lang.Math;

public class Prac2W7 {
    public static void main (String [] args){
        Scanner input = new Scanner(System.in);
        /*
        WAP that randomly generates an integer between 0 and 100, inclusive.
        The program prompts the user to enter a number continuously until the number matches the randomly generated number.
        For each user input, the program tells the user whether the input is too low or too high,
        so the user can choose the next input intelligently
         */


        //run random num
        double ran_num = Math.random() * 100;
        int type_cast = (int) ran_num;
        System.out.println (type_cast);

        //Ask for user input
        System.out.println("Enter a number: ");
        int num = input.nextInt();

        //Condition
        if (num == type_cast)
            System.out.println("OK");
        else if (num > type_cast)
            System.out.println("too big");
        else
            System.out.println("Too low");
    }
}
