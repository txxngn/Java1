package Week9;
import java.util.Scanner;

public class SumAndAvgWithArray {
    public static void main (String [] args){
        /*prompt user input 10 numbers
        Calculate Sum and Avg of all those numbers.
        Calculate how many numbers user entered above Ave.
         */
        Scanner input = new Scanner (System.in);
        System.out.println("Enter 10 positive numbers: ");
        int num[] = new int[10];
        int sum = 0;

        for (int i = 0; i < num.length; i++){
            num [i] = input.nextInt();
            sum += num[i];
        }
        double avr = (double)sum/num.length;
        System.out.println("Sum is " + sum);
        System.out.println("Avr is " + avr);
        System.out.println("User entered " + num.length +" numbers");





    }
}
