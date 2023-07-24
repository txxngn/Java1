import java.util.Scanner;  //util là packet   - Scanner là class

public class Input {
    public static void main (String[] args){
        Scanner input = new Scanner(System.in);
        int num;
        System.out.println("Enter a number: ");
        num = input.nextInt();
        System.out.println("The number is: "+num);

        /*.nextInt() là method
        Scanner input = new Scanner(System.in);
        Class  object        class   parameter
         */


    }
}
