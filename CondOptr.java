public class CondOptr {
    public static void main (String[] args){
        int num1, num2;
        num1 = 5;
        num2 = (num1 == 5)?20:30;  //if num1 equal 5, then num2 is 20
        System.out.println("Value of num2 is: "+num2);
        num2= (num1 == 7)?20:30;   //num1 is not equal 5, then num2 is 30
        System.out.println("Value of num2 is: "+num2);

    }
}
