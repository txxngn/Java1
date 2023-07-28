package Week7;

import java.util.Scanner;

public class Week7Exc {
    public static void main (String [] args){
        Scanner keysIn = new Scanner(System.in);


        int i = 1;
        int totalGrade = 0;
        double NUM_COURSES = 6;

        do{
            System.out.print("Enter grade" + i + ": ");
            double grade = keysIn.nextDouble();
            totalGrade += grade;
            i++;

        }while (i<=NUM_COURSES);

        double avg = totalGrade / NUM_COURSES;

        System.out.println("Average grade:" + avg);















    }
}
