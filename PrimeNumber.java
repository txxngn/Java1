package Week7;

public class PrimeNumber {
    public static void main (String [] args){
        /*WAP display the first 50 prime numbers in 5 lines, each line contains 10 numbers.
        ->Test whether number is prime
        ->Determine whether a given number is prime
        ->Count the prime numbers.
        ->print each prime number and print 10 numbers per line.
         */

        int count = 0;
        int number = 2;

        while (count < 50) {
            boolean isPrime = true;
            for (int i = 2; i <= Math.sqrt(number); i++) {
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
