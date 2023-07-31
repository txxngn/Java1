package Week9;

public class SystemArrayCopy {
    public static void main (String [] args){

        char copyFrom [] = {'W', 'e', 'l', 'c', 'o', 'm', 'e'};
        char copyTo [] = new char[4];

        System.arraycopy(copyFrom,3, copyTo, 0,4);   //System.arraycopy(CopiedString, index position, PastedString, index position, how many?)
        for (int i = 0; i<copyTo.length; i++)
            System.out.println(copyTo[i]);

        int copyFrom1 [] = {1,2,3,4,5,6,7,8,9};
        int copyTo1 [] = new int[10];
        System.arraycopy(copyFrom1,2,copyTo1,0,3);
        for (int i = 0; i<copyTo1.length; i++)
            System.out.println(copyTo1[i]);





    }
}
