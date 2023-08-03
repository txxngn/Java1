package Week11;
import java.util.Scanner;

public class QuotientWithException {
    public static void main (String [] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter 2 integers: ");
        int num1 = input.nextInt();
        int num2 = input.nextInt();

        try {
            System.out.println(num1 + "/" + num2 + " is " + (num1 / num2));
        }
        catch(ArithmeticException e){
            System.out.println("Exception: num2 cannot be divided by zero");
        }
        System.out.println("Execution continues...");



    }

}
