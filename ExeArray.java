package Week9;
import java.util.Scanner;

public class ExeArray {
    public static void main (String [] args){
        /*WAP to input the size of array
        Then user enter the element in the array
        the program print the element entered by the user
        sample:
        enter the size of the array
        6
        enter array elements
        12
        enter array elements
        23
        enter array elements
        34
        ...
        The array is 12 23 34 ...
         */
        Scanner input = new Scanner (System.in);
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






    }
}
