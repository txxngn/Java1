import java.util.Scanner;

public class Practice4 {
    public static void main (String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your grade point: ");
        int grade = input.nextInt();
        if ( grade >=90 && grade <= 100){
            System.out.println("Grade point is 4.0");
        } 
        else if ( grade >= 75 && grade <= 89) {
            System.out.println("Grade point is 3.5");
        } else if ( grade >= 60 && grade <= 74) {
            System.out.println("Grade point is 3.0");
        } else if ( grade >= 50 && grade <= 59) {
            System.out.println("Grade point is 2.0");
        }
        else
            System.out.println("Grade point is 0.0");

        //Find the biggest number in out of 3 numbers:
        /*System.out.println("Enter num1: ");
        int num1 = input.nextInt();
        System.out.println("Enter num2: ");
        int num2 = input.nextInt();
        System.out.println("Enter num3: ");
        int num3 = input.nextInt();


        if (num1 > num2 && num1 > num3){
            System.out.println("Max of all is " + num1);
        }
        else if (num2 > num1 && num2 > num3) {
            System.out.println("Max of all is " + num2);
        }
        else
            System.out.println("Max of all is " + num3);*/

        //Or use the Math.max method

        //Test knowledge IF
        int a = 5;
        int b = 4;
        if ((b=1) == a){             //Đổi b, bây giờ b là 1, xong check b có bằng a không, không nên chuyển xuống else
            System.out.println(b);
        }
        else
            System.out.println(++b); //b bây giờ là 1 chứ k phải 2 nữa nên ==b là 2




    }
}
