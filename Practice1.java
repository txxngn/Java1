import java.util.Scanner;

public class Practice1 {
    public static void main (String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("What is 3+4?");
        int user_input = input.nextInt();

        String check = (user_input==7)?"Answer is correct":"Wrong";
        System.out.println(check);

        System.out.println("What is 3+4?");
        int user_input1 = input.nextInt();
        String check2 = (user_input1==7)?"Answer is correct":"Wrong";
        System.out.println(check2);

    }

}
