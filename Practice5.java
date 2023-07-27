package Switch;

import java.util.Scanner;
public class Practice5 {
    public static void main (String [] args){
        Scanner input = new Scanner (System.in);
        System.out.println("Enter a number between 1 and 7");
        int user_in = input.nextInt();

        switch (user_in){
            case 1:
                System.out.println("Monday");
                break;            // nếu k có break, nó sẽ chạy ra luôn những case ở dưới cho tới khi có break thì mới dừng, kể cả default
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("Saturday");
                break;
            case 7:
                System.out.println("Sunday");
                break;
            default:
                System.out.println("Incorrect input");
                break;                 //break này k quan trọng vì nó đã là cái cuối
        }




    }
}
