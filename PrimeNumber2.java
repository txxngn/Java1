package Week7;

public class PrimeNumber2 {
    public static void main (String [] args){

        //Cách này của teacher
        final int number_of_primes = 50;
        final int number_of_primes_per_line = 10;
        int count = 0;
        int number = 2;
        System.out.println("The first 50 prime numbers are \n");


        //repeatedly fine prime numbers
        while (count < number_of_primes){
            boolean isPrime = true;
            for (int divisor = 2; divisor < number/2; divisor++){
                if (number % divisor ==0){
                    isPrime = false;
                    break;
                }
            }

            if (isPrime){
                count++;
                if (count % number_of_primes_per_line == 0){
                    System.out.println(number);
                }
                else
                    System.out.print(number + " ");
            }

            number++;

        }

    }
}
