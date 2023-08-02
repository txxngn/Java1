package Week10;

public class PassByValue {
    public static void main (String [] args){

        int x = 1;
        System.out.println("Before the call, x is " +x); //x=1
        increment(x); //increment(1) là n =1, xong ở dưới n++ -> n=2. K liên quan gì đền x
        System.out.println("After the call, x is " +x); //x vẫn = 1

    }
    public static void increment (int n){    //có thể thay n = x cũng ra kết quả y chang
        n++;
        System.out.println("n inside the method is " + n);
    }


}
