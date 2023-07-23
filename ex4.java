import java.util.Scanner;
public class ex4 {
    public static void main (String [] args){
        Scanner input = new Scanner (System.in);
        //WAP Check if number is palindrome or not, should display at least one message "either palindrome or not"
        //Palindrome : đọc đầu hay cuối đều giống nhau. vd : 1221
        //Number is Palindrome if the number remains the same when its digits are reversed.
        //upload 23/7 4
        System.out.println("Enter a 4 digits number: ");
        int num = input.nextInt();

        //first num equal to last num
        int first_num = num % 10;
        int last_num = num / 1000 %10;
        System.out.println(first_num);
        System.out.println(last_num);

        //second num equal to third num
        int second_num = num / 10 %10;
        int third_num = num / 100 %10;
        System.out.println(second_num);
        System.out.println(third_num);

        if (first_num == last_num && second_num == third_num)
            System.out.println("Palindrome");
        else
            System.out.println("Not Palindrome");



    }
}
