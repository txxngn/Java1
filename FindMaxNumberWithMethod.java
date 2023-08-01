package Week10;
import java.lang.Math;
import java.util.Scanner;

public class FindMaxNumberWithMethod {
    public static void main (String [] args){
        //WAP prompt user to enter 2 numbers and find the maximum numbers using method
        Scanner input = new Scanner (System.in);
        System.out.println("Enter the first number: ");
        int num1 = input.nextInt();
        System.out.println("Enter the second number: ");
        int num2 = input.nextInt();
        MaxNum(num1, num2);



    }
    public static void MaxNum (int num1, int num2){
        if (num1 > num2)
            System.out.println("Maximum number is " +num1);
        else
            System.out.println("Maximum number is " +num2);

    }
    //Có thể thử method return type
    //đặt method vào 1 variable trong main
    //trong method định nghĩa 1 variable rồi return variable đó.

}
