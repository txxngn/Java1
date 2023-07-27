package Week7;

public class Continue {
    public static void main (String [] args){
        int sum = 0;
        int number = 0;

        while (number < 20) {
            number++;
            if (number == 10 || number == 11)
                continue; //skip below, continue the loop
            sum += number; //khi number = 10 hoặc 11 thì vòng lên loop lại, không run dòng dưới
        }

        System.out.println("The sum is " + sum);


    }
}
