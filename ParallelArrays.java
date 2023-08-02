package Week10;
import java.util.Arrays;
public class ParallelArrays {
    public static void main (String [] args){
        /*
        WAP that declares the three arrays for rent[], fee[], and totalExpense[].
        You can initialize the rent[] and fee[] arrays to 4 values of your choice.
        Then write the code to fill the totalExpence[] array, by adding rent and fee for
        each year. Consider index 0 as first year.
         */

        int rent [] = {800, 700, 600, 500};
        int fee [] = {50, 40, 30, 20};
        int totalExpense[] = new int[4];

        for (int i = 0; i<rent.length; i++){
            totalExpense [i] = rent[i] +fee[i];
        }

        for (int i : totalExpense){         //Nếu dùng for Array này thì print thằng i (công thức nó vậy)
            System.out.println(i);          //Nếu dùng for mà viết ra luôn (int i = 0; i<totalExpense; i++) thì print totalExpense[i]
        }




    }
}
