package Week12;

public class This {
    public static void main (String [] args){
        display obj = new display();
        obj.set(4,5);
        obj.show();
    }
}

class display{
    int a,b;      //Instance variables   //a and b are called data members
    public void set (int a, int b){  //Local variables
        this.a = a;
        this.b = b;
    }

    void show(){
        System.out.println(a + b);
    }
}
