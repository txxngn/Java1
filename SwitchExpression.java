package Switch;

import java.util.Scanner;
public class SwitchExpression {
    public static void main (String [] args){
        Scanner input = new Scanner (System.in);

        //WAP to calculate delivery costs to various provinces and territories in Canada.
        //The user enter the province's official code and the program should display the correct delivery cost.

        System.out.println("Enter the province's official code to see the delivery cost: ");
        String office_code = input.nextLine();

        double a = 29.95;
        double b = 34.95;
        double c = 24.95;
        double d = 29.95;
        double e = 37.95;
        double f = 39.95;


        /*switch (office_code){
            case "NS", "NB", "PE":
                System.out.println("Delivery cost : "+a );
                break;
            case "NL":
                System.out.println("Delivery cost : "+b );
                break;
            case "QC", "ON":
                System.out.println("Delivery cost : "+c );
                break;
            case "MB", "SK":
                System.out.println("Delivery cost : "+d );
                break;
            case "AB", "BC":
                System.out.println("Delivery cost : "+e );
                break;
            case "NU", "NT", "YT":
                System.out.println("Delivery cost : "+f );
                break;
            default:
                System.out.println("Invalid code");
        }*/


        //Switch Expression
        String message = switch (office_code){
            case "NS", "NB", "PE" -> "Delivery cost : "+a;
            case "NL" -> "Delivery cost : "+b;
            case "QC", "ON" -> "Delivery cost : "+c;
            case "MB", "SK" -> "Delivery cost : "+d;
            case "AB", "BC" -> "Delivery cost : "+e;
            case "NU", "NT", "YT" -> "Delivery cost : "+f;
            default -> "Invalid data";

        };
        System.out.println(message);





    }
}
