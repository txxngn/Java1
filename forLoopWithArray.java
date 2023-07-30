package Week9;

public class forLoopWithArray {
    public static void main (String [] args){

        int marks[] = new int[10];
        marks[0] = 76;
        marks[1] = 98;
        marks[2] = 65;
        marks[3] = 34;
        marks[4] = 64;
        marks[5] = 87;
        marks[8] = 51;                         //Nếu k initialize value for index, the default value is 0
        for (int i = 0; i< marks.length; i++){              //x.length - độ dài của array, đôi khi k biết độ dài nên dùng cái này.
            System.out.println(i+ "th " + "element is " +marks[i]);
        }

    }
}
