package Week9;
import java.util.Scanner;
public class ExeArray2 {
    public static void main (String [] args){
        /*WAP using for-each loop to find the sum of all the elements in the array
         */
        int array [] = {2,3,4,5,6,7};
        int sum = 0;
        for (int i:array){
            sum +=i;
        }
        System.out.println("The sum is: " + sum);




    }
}
