import java.lang.Math;
public class MathPow {
    public static void main (String[] args){
        System.out.println(Math.pow(2,3));

        double x = 16;
        double y = 8;

        //return the maximum of two numbers:
        System.out.println("Maximum number of x and y is: "+Math.max(x,y));
        //return the minimum of two numbers:
        System.out.println("Minimum number of x and y is: "+Math.min(x,y));
        //return the square root of y
        System.out.println("Square root of y is: "+ Math.sqrt(y));
        //return 16 power of 2
        System.out.println("Power of x and y is: " +Math.pow(x,2));
        //return the logarithm of given value
        System.out.println("Logarithm of x is : " +Math.log(x));
        System.out.println("Logarithm of y is : " +Math.log(y));



    }
}
