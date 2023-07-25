import java.util.Scanner;
import java.lang.Math;

public class Practice2 {
    public static void main (String[] args){
        Scanner input = new Scanner (System.in);
        //1.Enter a 3 digit number and print backward
        System.out.println("Enter a three digit number: ");
        int num = input.nextInt();

        //first num
        int last_digit = num % 10; //

        //second num
        int remain = num / 10;
        int second_digit = remain % 10;

        //third num
        remain = remain/10;
        int third_digit = remain % 10;

        System.out.println("The number in reverse is : " +last_digit+ ", "+second_digit+" , "+"and "+third_digit);

        //2. calculate celcius
        System.out.println("Enter the temperture: ");
        double cel = input.nextInt();
        double fah = ((9.0/5)*cel)+32;
        System.out.println("The Fahrenheit is : " + fah);

        //3. find maximum number
        System.out.println("Enter first positive num: ");
        int num1 = input.nextInt();
        System.out.println("Enter second positive num: ");
        int num2 = input.nextInt();
        System.out.println("The larger number is : " + Math.max(num1, num2));

    }
}
