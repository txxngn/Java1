package Switch;

import java.util.Scanner;

public class IfToSwitch {
    public static void main (String [] args){
        Scanner keysIn = new Scanner(System.in);
        System.out.println("Enter the shipment status: ");
        int status = keysIn.nextInt();

        String action = "";                 // Initialize empty string
/*
        if (status == 1){                   //Just a different way to handle Strings instead of using print
            action = "Phone vendor and request delivery";
        } else if (status == 2) {
            action = "Phone customer and warn of late shipment.";
        } else if (status == 3) {
            action = "Prepare shipping labels";
        } else if (status == 4) {
            action = "Order additional product from vendor";
        } else
            action = "Error: Invalid status code.";

        System.out.println(action);
        */

            //Test sẽ yêu cầu chuyển từ if sang Switch

        switch (status){
            case 1:
                action = "Phone vendor and request delivery";
                break;
            case 2:
                action  = "Phone customer and warn of late shipment.";
                break;
            case 3:
                action = "Prepare shipping labels";
                break;
            case 4:
                action = "Order additional product from vendor";
                break;
            default:
                action = "Error: Invalid status code.";
                break;
        }
        System.out.println(action);







    }
}
