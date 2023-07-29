package Week9;

public class Array3 {
    public static void main (String [] args){
        int []value = new int [5];              //Để dấu [] trước hay sau đều được
        for (int i = 1; i < 5; i++)
            value[i] = i + value[i-1];

        value[0] = value[1] + value [4];
// v1 = 1 v2 = 3 v3 = 6 v4 = 10 --> v0= 11


    }
}
