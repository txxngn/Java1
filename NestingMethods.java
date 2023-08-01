package Week10;
import java.util.Scanner;

public class NestingMethods {
    public static void main (String [] args){

        /*
    Refine Rectangle problem.
    Create set method to get input from user.
    Set method should call area method by passing input so that calculation can be done.
    Then Area method in turn should call get
    method by passing output of calculations So
    that it can display results to user.
     */
    set();


    }

    public static void set(){
        Scanner input = new Scanner (System.in);
        System.out.println("Enter the length of the rectangle: ");
        double length = input.nextDouble();
        System.out.println("Enter the width of the rectangle: ");
        double width = input.nextDouble();
        area(length, width);
    }
    public static void area(double length, double width){
        double Cal_area = length*width;
        get(Cal_area);
    }

    public static void get(double Cal_area){
        System.out.println("The area is : " + Cal_area);
    }

}
