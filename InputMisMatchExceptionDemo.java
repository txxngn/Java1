package Week11;
import java.util.*;
import java.util.Scanner;

public class InputMisMatchExceptionDemo {
    public static void main (String [] args){
        Scanner input = new Scanner (System.in);
        boolean continueInput = true;
        do {
            try{
                System.out.print("Enter an integer: ");
                int number = input.nextInt();
                System.out.println("The number entered is " +number); //Display the result
                continueInput = false;
            }
            catch(InputMismatchException ex){
                System.out.println("Try again. (" + "Incorrect input: an integer is required)");
                input.nextLine(); //discard input, nếu k có dùng này nó thành infinity loop
                                    //nếu k có nextline này nó vẫn giữ input trước đó, sẽ in dòng try again... liên tục
            }
        }while (continueInput);


    }

}
