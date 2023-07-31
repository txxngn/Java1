package Week9;

import java.util.Arrays;
import java.util.Collections;

public class SortingArray {
    public static void main (String [] args){

        int a [] = {13,45,15,6,7,60,32};
        System.out.println("The sorted array is ");
        Arrays.sort(a);                               //sort method, sorts the array into increasing order ("Arrays" is a class)
        for (int i:a)
            System.out.print(i + " ");

        System.out.println();
        Integer b[] = {3,5,8,6,7,9};
        Arrays.sort(b, Collections.reverseOrder());
        for (int j:b) {
            System.out.print(j + " ");
        }





    }
}
