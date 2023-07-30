package Week9;

import java.util.Scanner;

public class InputForArray {
    public static void main (String [] args){
        Scanner input = new Scanner (System.in);

        int num [] = new int [5];                //Key: initialize the Array first
        System.out.println("Enter 5 number: ");

        for (int i = 0; i < num.length; i++) {
            num[i] = input.nextInt();
                                                //k thể print bên trong được vì mỗi lần input nó sẽ print lại nên cần dùng loop khác
        }
        System.out.print("THe array is: ");
        for (int i = 0; i < num.length; i++)
            System.out.print(num[i]+" ");










    }
}
