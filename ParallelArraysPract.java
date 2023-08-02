package Week10;
import java.lang.String;

public class ParallelArraysPract {
    public static void main (String [] args){
        /*WAP create 2 arrays, Array1 (Fname[]) contains the first names of five persons.
        Array2 (Lname[]) contains the last names of five persons.
        copy the Fname and Lname in another array FullName and print the result of FullName array.
        Hint: Use Fname[i].concat(Lname[i]) to move name into Fullname array.
         */
        String Fname [] = {"Thai", "Ly", "Quan", "Thien", "Tri"};
        String Lname [] = {"Nguyen", "Tran", "Ton", "Le", "Hoang"};
        String Fullname [] = new String[5];

        for (int i = 0; i < Fname.length; i++){
            Fullname [i] = (Fname[i]+" ").concat(Lname[i]);   //tip, nho cai nay
        }
        for (String i: Fullname)            //luu y cho nay dang dung array la string nen i phai la string
            System.out.println(i);







    }
}
