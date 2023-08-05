package Week11;

public class UserDefException {
    public static void main (String [] args){

        int num1 = 10;
        try{
            System.out.println("Starting of try block");
            if (num1 <15)
                throw new Exception("This is invalid input!"); //output nếu <15 -> java.lang.Exception: This is invalid input!
        }                              //throw new này là mình tự tạo cái Exception, cái câu "This is invalid input!" chính là e ở dưới
        catch(Exception e){
            System.out.println(e);
            System.out.println("Try something else");
        }
        finally{         //finally block is always executed regardless whether an exception occurred or not. it is optional block
            System.out.println("We are in the finally block");
        }
    }
}
