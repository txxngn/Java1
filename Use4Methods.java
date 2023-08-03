package Week10;
import java.util.Scanner;


public class Use4Methods {
    public static void main (String [] args){
        //WAP to use 4 methods: sum, diff, prod, divide.
        //Use 4 methods to perform four different operations in each method (Add, difference, product, division)
        Scanner input = new Scanner (System.in);

        System.out.println("Enter 2 number: ");
        int num1 = input.nextInt();
        int num2 = input.nextInt();
        System.out.println("The sum is " +sum(num1,num2) );
        System.out.println("the diff is " + diff (num1, num2) );
        System.out.println("The prod is " + prod(num1, num2));
        System.out.println("The divide is " + div(num1, num2));



    }
    public static int sum(int num1, int num2){
        int sum = num1 + num2;
        return sum;
    }
    public static int diff(int num1, int num2){
        int diff;
        if (num1 > num2)
            diff = num1 - num2;
        else
            diff = num2 - num1;
        return diff;
    }

    public static int prod (int num1, int num2){
        int prod = num1*num2;
        return prod;
    }
    public static int div (int num1, int num2){
        int div;
        if (num1 > num2)
            div = num1/num2;
        else
            div = num2/num1;
        return div;
    }





}
