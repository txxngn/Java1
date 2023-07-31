package Week9;

public class StringArray {
    public static void main (String [] args){
        String str_array[] = {"Mark", "Luke", "Joe"};
        String s = "Luke";

        for (int i = 0; i < str_array.length; i++){
            if (s.equals(str_array[i])){
                System.out.println("Name " + s + " is present");
                break;
            }
        }




    }
}
