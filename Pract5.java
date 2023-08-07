package Week12;
import java.util.Scanner;

public class Pract5 {
    public static void main (String [] args){
        /*
        8.	A company with a customer loyalty program assigns discounts to it's customers
        based on the number of purchases they've made, according to the table below:
    # of Purchases	Discount
    50 or more	        2%
    100 or more	        5%
    200 or more	        7%
    400 or more	        10%

    Write a program that prompts the user for the customer's number of purchases,
    and the balance due on the current purchase. Then the program displays the total amount due after the discount.

    Your program should include a method that accepts number of purchases and returns the discount percentage.
    You should also include a method that accepts the purchase amount and the discount percentage,
    and returns the total purchase amount with the discount applied.
         */
        Scanner input = new Scanner (System.in);
        System.out.println("Enter number of purchases: ");
        double quantity = input.nextDouble();
        System.out.println("Enter balance on the current purchase: ");
        double balance = input.nextDouble();
        double a = discountPercent(quantity);
        discounted_total(balance, a);
        System.out.println("With #" + quantity + "and the balance " + balance + " the discount is " +a + "and the discounted amt is " + discounted_total(balance, a));


    }

    public static double discountPercent(double quantity){
        double percentage = 0;

        if (quantity >= 50 && quantity <100) {
            percentage = 0.02;
        }
        else if (quantity >=100 && quantity <200) {
            percentage = 0.05;
        } else if (quantity >=200 && quantity <400) {
            percentage = 0.07;
        } else if (quantity >=400) {
            percentage = 0.1;
        } else if (quantity <50) {
            percentage = 0;
        }
        return percentage;
    }

    public static double discounted_total(double balance, double discount){
        double NumofDiscount = balance - (balance*discount);
        return NumofDiscount;
    }




}




