public class LogicalOptr {
    public static void main (String[] args){

        int a = 1, b = 2, c = 3;
        boolean b1 = (a<b) && (b==c);
        boolean b2 = (a<b) || (b==c);
        boolean b3 = (a!=c);
        System.out.println("Above condition is " +b1);
        System.out.println("Above condition is " +b2);
        System.out.println("Above condition is " +b3);
    }
}
