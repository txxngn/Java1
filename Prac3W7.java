package Week7;
import java.util.Scanner;
//TN
public class Prac3W7 {
    public static void main (String [] args){
        Scanner input = new Scanner (System.in);

        int num_try = 0;
        int grade;

        do{
            System.out.println("Enter the final grade: ");
            grade = input.nextInt();
            if (grade > 0 && grade < 100){
                System.out.println("You entered a valid grade.");
                break;
            }
            else {
                System.out.println("You entered invalid grade.");
                num_try++;
            }


        }while ((grade > 0 || grade < 100) && num_try < 5 && grade != 999);

        

    }
}
