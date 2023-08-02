package Week10;

public class PassingArrays {
    public static void main (String [] args){

        int Arr [] = {3,5,6,8};
        PassArray(Arr);
    }

    public static void PassArray(int [] list){     //chủ yếu là data type chỗ này có thêm []
        for (int n:list)
            System.out.print(n + " ");
    }

}
