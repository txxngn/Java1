package Week11;
import java.util.Scanner;

public class Pract1 {
    public static void main (String [] args){
        /*
        Create user defined exception:
        if age <0, raise an exception to print under aged
        if age >125, raise an exception to print over aged
        otherwise, print the aged entered by the user
         */
        Scanner input = new Scanner (System.in);
        System.out.println("Enter an age: ");
        int age = input.nextInt();

        try{
            if (age<0)
                throw new Exception("This is not a valid age due to Under aged");
            else if (age > 125) {
                throw new Exception("This is not a valid age due to Over aged");
            }
            System.out.println("Entered age: " +age);
        }

        catch (Exception e){
            //System.out.println(e);
            System.out.println("Please input a valid age");
        }



    }
}
