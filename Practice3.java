import java.util.Scanner;
public class Practice3 {
    public static void main (String[] args){
        Scanner input = new Scanner (System.in);
        //Swap value

        System.out.println("Enter num1: ");
        int num1 = input.nextInt();
        System.out.println("Enter num2: ");
        int num2 = input.nextInt();

        //create a jar to swap value
        int temp = num1;
        System.out.println(temp);
        num1 = num2;
        System.out.println(num1);
        num2 = temp;
        System.out.println(num2);


    }
}
