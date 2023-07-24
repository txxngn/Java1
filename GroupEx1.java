import java.util.Scanner;

public class GroupEx1 {
    public static void main (String[] args){
        Scanner input = new Scanner (System.in);
        //Enter the leng
        System.out.print("Enter the length of the rectangle: ");
        float leng = input.nextFloat();
        //Enter the width
        System.out.print("Enter the width of the rectangle: ");
        float width = input.nextFloat();
        //Calculate
        System.out.println("The area of the rectangle is : " + leng*width);




    }
}
