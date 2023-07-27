package Week7;
import java.util.Scanner;

public class DataValidation {
    public static void main (String [] args){
        Scanner input = new Scanner(System.in);
        /*
        WAP if the number of items entered is 0 or negative, display an error message.
        If the number of items is valid, go ahead and ask for the price.
        If the price is 0 or negative, display an error message.
        If the price is valid, go ahead and calculate/display the total cost.
        The total cost should only be calculated and displayed if both inputs are positive, non-zero values.
        */


        int numItems;
        double price;

        while (true) {
            System.out.print("Enter the number of items: ");
            numItems = input.nextInt();

            if (numItems <= 0) {
                System.out.println("Error: Number of items must be positive.");
                continue;
            }
                                                //Nhớ: input k đúng thì continue the loop, đúng thì break the loop.
            break;
        }

        while (true) {
            System.out.print("Enter the price per item: ");
            price = input.nextDouble();

            if (price <= 0) {
                System.out.println("Error: Price per item must be positive.");
                continue;
            }

            break;
        }

        double totalCost = numItems * price;
        System.out.println("Total cost: $" + totalCost);

    }
}
