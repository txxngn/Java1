import java.util.Scanner;

public class GroupEx2 {
    public static void main (String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the first number: ");
        int first_num = input.nextInt();
        System.out.print("Enter the second number: ");
        int second_num = input.nextInt();

        int num3 = (first_num < second_num)?second_num:first_num;


        System.out.println("The larger number is: " + num3);

    }
}
