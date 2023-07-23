public class ex1 {
    public static void main (String[] args){
        //NOte the hours he worked this week. 25 hours per week.
        //Take Hourly pay as 11.99$ per hour as constant using:
        //final float HOURLYPAY = 11.99;
        //Calculate Bi-Weekly pay for that user and display the output.
        //upload 23/7 2
        final float Hourly_Pay = 11.99f;
        int total_hour= 25;
        float Bi_week = Hourly_Pay*total_hour*2;
        System.out.println("The weekly hour he worked this week is $" +Bi_week);

       int m = 10, n = 20;
        System.out.println("++m = "+ ++m); //tính ++m trước rồi mới print nên ra 11
        System.out.println("n++ = "+ n++); //n++ là tính sau, nên nó print trước thì n đang là 20.


    }
}
