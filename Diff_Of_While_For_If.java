
public class Diff_Of_While_For_If {
    public static void main (String [] args){

        //While cần initialize first, For có thể initialize first or inside For condition
        //DIff between While and If: If chỉ check condition chứ k chạy vòng lên lại.

/*        int i = 1;
        if (i<=10){
            System.out.println(i);
            i++;
        }
 */
        //----> output chỉ ra 1



        //For
/*        for (int i = 1; i<=10; i++){          //semi-colon inside condition!!
            System.out.println(i);
        }
*/


        //While
/*        int i = 1;
        while (i<=10){
            System.out.println(i);
            i++;                      //Chỗ này quan trọng, phải có vì giống for
        }
*/



    }
}
