package Week10;
import java.util.Scanner;
public class InputMethod {
    public static void main (String [] args){
        Scanner input = new Scanner (System.in);
        System.out.println("enter 2 number, the system will calculate the sum between it: ");
        int i1 = input.nextInt();
        int i2 = input.nextInt();
        System.out.println("The sum of 2 number is " + sum(i1, i2));

    }


    public static int sum (int i1, int i2){
        int sum = 0;
        for (int i = i1; i < i2; i++)
            sum += i;
        return sum;
    }


}
