package Week10;

public class VariableArguments {
    public static void main (String [] args){
        calculateSum();                         //áp dụng cho kể cả 0
        calculateSum(2,4);
        calculateSum(2,4,5,6,7);
        calculateSum(new int[] {3,5,6,7});       //và cả array

    }

    public static void calculateSum (int ...a){       //ba chấm + tên variable - gọi là variable arguments
        int sum = 0;                                 //cách này áp dụng cho bất kỳ arguments nào được đặt vào mà k bị ràng buộc
        for (int i = 0; i < a.length; i++){          //kể cả array
            sum += a[i];
        }
        System.out.println(sum);


    }
}

