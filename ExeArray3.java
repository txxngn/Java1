package Week9;
import java.util.Arrays;
import java.util.Scanner;

public class ExeArray3 {
    public static void main (String [] args){
        Scanner input = new Scanner (System.in);
        /*Prompt user to enter size and value of array
        Then sorting it
         */
        System.out.println("Enter the size of array: ");
        int size = input.nextInt();
        int num[] = new int[size];
        for (int i = 0; i <size; i++){
            System.out.println("Enter array elements: ");
            num[i] = input.nextInt();
        }
        System.out.println("The array is : ");
        for (int i = 0; i<size; i++){
            System.out.print(num[i] + " ");
        }

        System.out.println();
        Arrays.sort(num);
        System.out.println("The sorted array is ");
        for (int i:num)
            System.out.print(i + " ");






    }
}
