package Week9;
import java.util.ArrayList;

public class ArrayListEx2 {
    public static void main (String [] args){

        //add, remove value in a LIst

        //ArrayList<String> Declaration
        ArrayList<String> a = new ArrayList<String>();    //Create an empty String
        //Add method for String ArrayList
        a.add("Matthew");
        a.add("Mark");
        a.add("Luke");
        a.add("John");

        for (String i: a)
            System.out.println("Element of ArrayList of String Type: " +i);

        a.remove(0);
        System.out.println("After removing\n");
        for (String i: a)
            System.out.println("Element of ArrayList of String Type: " +i);






    }
}
