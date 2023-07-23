public class ex2 {
    public static void main (String[] args){
        //Write a program to find out the sum of a three digit positive integer.
        //For example : 345 has sum 12.
        //Dùng modulus
        //
        int num = 345;
        int lastDigit = num % 10; //Will give 5
        System.out.println(lastDigit);


        int remainingNumber = num / 10;   //Will give 34
        int secondLastDigit = remainingNumber % 10;   //4
        System.out.println(secondLastDigit);
        
        remainingNumber = remainingNumber / 10;   //3
        int firstDigit = remainingNumber % 10;     //3

        int sum = lastDigit + secondLastDigit + firstDigit;
        System.out.println("The sum is: " +sum);








    }
}
