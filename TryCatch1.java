package Week11;

public class TryCatch1 {
    public static void main (String [] args){

        int []num = {5,7,4,3,8};

        try{
            int LastElement = num [7];
            System.out.println(LastElement);
        }
        catch(Exception e){
            System.out.println(e);
        }
        System.out.println("Program ends here.");

    }
}
