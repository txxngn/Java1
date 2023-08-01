package Week9;

public class ValueInArray {
    public static void main (String [] args){

        int ages[] = new int[10];
        for (int i = 0; i<10; i++) {
            ages[i] = i * 3;
            System.out.println(ages[i]);
        }

        System.out.println("The length of the array is " + ages.length);




    }
}
