package Week9;
import java.util.ArrayList;      //Must import ArrayList first!!!!

public class ArrayListEx {
    public static void main (String [] args){
        //add, remove value in a LIst

        //create an empty array list of size 5
        ArrayList <Integer> arrlist = new ArrayList<Integer>(5);    //Integer is type
        //use add() method to add elements in the list
        arrlist.add(15);
        arrlist.add(22);
        arrlist.add(2,89);  //adding element 89 at 2nd index position
        arrlist.add(1,56);  //adding element 56 at 1st in dex position
        arrlist.add(65);
        arrlist.add(47);
        arrlist.add(99);

        for (Integer number : arrlist){
            System.out.println("Integer is " + number);
        }

        //Mặc dù size của List là 5 nhưng vẫn add được thêm (resizable)





    }
}
