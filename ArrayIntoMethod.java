package Week10;
import java.util.Scanner;
import java.lang.Math;

public class ArrayIntoMethod {
    public static void main (String [] args){
        /*
        WAP to send an array into method.
        And that method return the square of the elements of the original array.
        Print the elements of the returned array.
         */
        Scanner input = new Scanner (System.in);
        System.out.println("Enter 3 numbers: ");
        double arr[] = new double[3];
        for (int i = 0; i < arr.length; i++){
            arr[i] = input.nextInt();
        }

        System.out.println("Your numbers are : " );
        for (double i:arr){
            System.out.print(i + " ");
        }
        System.out.println();



        Square(arr);

    }

    //passing array into method
    public static void Square(double list []){

        System.out.println("The squared of the the list are : ");
        for (int i = 0; i< list.length; i++){
            list [i] = Math.pow(list[i],2);
        }
        for (double i:list){
            System.out.print(i + " ");
        }

    }




}
