package Week8;
import java.util.Scanner;

public class PracticeMidterm2 {
    public static void main (String [] args){

        /*WAP using a for-loop that displays a conversion table for pounds and grams (one pound = 453.6 grams).
        The start and end value should be entered by the user.
        If the user enters a start value that's larger than the end value, swap the start and end values.
        Like below output:
        Enter Start Value: 1
        Enter End Value: 10

        Conversion Table:  LBS to GRAMS
LBS             GRAMS
----            ------
 1.             453.6
 2.             907.2
 3.            1360.8
 4.            1814.4
 5.            2268.0
 6.            2721.6
 7.            3175.2
 8.            3628.8
 9.            4082.4
10.            4536.0
         */

        Scanner input = new Scanner (System.in);
        System.out.println("Enter Start Value: ");
        int start_value = input.nextInt();
        System.out.println("Enter End Value: ");
        int end_value = input.nextInt();

        float one_pound = 453.6f;
        System.out.println("Conversion Table:  LBS to GRAMS");

        for (int i = start_value; i <= end_value; i++){

            System.out.print("   " + i + ".               ");
            System.out.println(one_pound*i);
        }











    }
}
