package Week7;
import  java.util.Scanner;
//TN
public class Prac1W7 {
    public static void main (String [] args){
        Scanner input = new Scanner (System.in);


        int ans;

        do{
            System.out.println("What is 3+4? ");
            ans = input.nextInt();
            if (ans == 7) {
                System.out.println("Correct");
                break;
            }
            else
                System.out.println("Incorrect");

        }while(ans != 7);




    }
}
