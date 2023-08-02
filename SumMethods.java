package Week10;
import java.util.Scanner;

public class SumMethods {
    public static void main (String [] args){
        //Cộng tất cả các số từ a tăng dần đến b

        int num1, num2;
        Scanner input = new Scanner (System.in);
        System.out.println("Enter two positive integers in the increasing order");
        num1 = input.nextInt();
        num2 = input.nextInt();
        sum(num1,num2); //Method call/Method Invoke: Here control transfer to Method definition

    }

    public static void sum(int num1, int num2) //void mean no return type (return nothing type)


    {
        int add = 0;
        for (int i = num1; i <=num2; i++)
            add+=i;
        System.out.println("Sum of the numbers from " +num1 +" to " +num2 + " is " +add); //need print here bc "void",
                                                                                        // it return nothing so I have to print it out
                                                                                        // if in "main" has print already, then this method must have return type.
    }



}
