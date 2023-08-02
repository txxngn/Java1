package Week10;

import java.sql.SQLOutput;

public class PassValueAndArraysDifferent {
    public static void main (String [] args){
        int x = 1;
        int [] y = new int [10];

        m(x,y);          //ở đây y là 1 array có y[0] = 0,
                        // mà trong method, num2 là 1 array khác nhưng có num2[0] = 5555
                        //nhưng nó được đặt trong method "m" nên nó pass value khiến cho array y bị thay đổi

        System.out.println("x is "+ x);
        System.out.println("y[0] is " + y[0]);

    }

    public static void m (int num1, int [] num2){  //num1 là pass value, num2 là pass array
        num1 = 1001;                               //pass value k ảnh hưởng variable trước vì đang handling 2 copies
        num2 [0] = 5555;                           //pass array sẽ thay đổi value
    }
}
