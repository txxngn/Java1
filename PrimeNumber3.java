package Week7;

public class PrimeNumber3 {
    public static void main (String [] args){
        /*Write a program that displays the first 50 prime numbers in
        five lines, each of which contains 10 numbers.
         */

        //Học cách này. Y như cách của teacher nhưng dễ nhìn hơn chút
        int count = 0;
        int number = 2;

        while (count < 50) {
            boolean isPrime = true;
            for (int i = 2; i <= number / 2; i++) {
                if (number % i == 0) {
                    isPrime = false;
                    break;
                }
            }

            if (isPrime) {
                System.out.print(number + " ");
                count++;
                if (count % 10 == 0) {
                    System.out.println();
                }
            }

            number++;
        }



    }
}
