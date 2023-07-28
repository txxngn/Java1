package Week8;

import java.util.Scanner;


public class PracticeMidterm3 {
    public static void main (String [] args){
        Scanner input = new Scanner (System.in);
        /*A company calculates the cost of shipping packages by the weight of the package.
         Packages have a tiered cost based on weight:
            Up to 2 Kg: $1.15 per Kg
            Up to 5 Kg: $1.35 per Kg
            Up to 10 Kg: $1.75 per Kg
            10 Kg and over: $2.00 per Kg
            WAP that prompts the user to enter the package weight.
            Determine the cost per Kilogram based on the weight of the package.
            Then calculate and display the total shipping cost.
         */
        System.out.println("Enter the package weight: ");
        float p_weight = input.nextFloat();
        float cost_2 = 1.15f;
        float cost_5 = 1.35f;
        float cost_10 = 1.75f;
        float cost_over_10 = 2.00f;
        float total_ship;

        if (p_weight > 0 && p_weight <= 2){
            total_ship = cost_2 * p_weight;
        } else if (p_weight > 2 && p_weight <= 5) {
            total_ship = cost_5 * p_weight;
        } else if (p_weight > 5 && p_weight <=10) {
            total_ship = cost_10 * p_weight;
        }
        else
            total_ship = cost_over_10 * p_weight;

        System.out.printf("Total shipping cost is: %,.2f%n", total_ship);








    }
}
