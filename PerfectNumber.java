import java.util.Scanner;
public class PerfectNumber {
    public static void main(String[] args) {
        /*Write a java program to find whether the number is perfect or not.
        A number is perfect if the sum of the number is equal to the sum of tis positive divisors, excluding the number itself.
        for eg. 6 is the sum of 1,2 and 3
         */

        Scanner input = new Scanner(System.in);
        System.out.print("Enter a positive integer: ");
        int num = input.nextInt();
        input.close();

        int sum = 0;
        for (int i = 1; i < num; i++) {
            if (num % i == 0) {
                sum += i;
            }
        }

        if (sum == num) {
            System.out.println(num + " is a perfect number.");
        } else {
            System.out.println(num + " is not a perfect number.");
        }
    }
}





