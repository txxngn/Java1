package Week9;
import java.util.Scanner;

public class StringArrayExc {
    public static void main (String [] args){
        Scanner input = new Scanner(System.in);
        //WAP to input 10 names of your friends and print them.

        System.out.println("Enter 10 names of your friends: ");
        String name[] = new String[10];
        for (int i = 0; i < name.length; i++){
            name [i] = input.nextLine();
        }


        System.out.println("Your friend names are: ");
        for (int i = 0; i < name.length; i++)
            System.out.print(name[i] + " ");             //Công thức để in array hàng ngang






    }
}
