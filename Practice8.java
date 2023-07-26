import java.util.Scanner;
public class Practice8 {
    public static void main (String [] args){
        Scanner input = new Scanner(System.in);

        //WAP to prompt user input 2 number (limits) and generate the following output

        System.out.println("Enter a start num: ");
        int start_num = input.nextInt();
        System.out.println("Enter an end num: ");
        int end_num = input.nextInt();

        int sum_even = 0;                      // Chỗ này ban đầu mình chỉ "int sum_even;" nên nó bị lỗi initialize, phải cho giá trị là 0 vào
        int sum_odd = 0;

        for (int i = start_num; i <= end_num; i++) {   //i đầu tiên k thể là i = 0. i đầu tiên là chỗ bắt đầu nên i = start_num
            if (i % 2 == 0) {                          //ban đầu mình làm sai là i = 0; start_num <= i && i<= end_num
                sum_even += i;
            } else
                sum_odd += i;
        }

        System.out.println("Sum of Even is: " + sum_even);
        System.out.println("Sum of Odd is: " + sum_odd);


        //hoặc dùng while (start_num <= end_num)





    }
}
