package Week12;

public class ObjClass1 {
    public static void main (String [] args){
        car civic = new car(); //Creating objects of car class using constructor car   //class car is the blueprint
        car jeep = new car(); //Java constructor is invoked at the time of object creation.
        civic.seats = 5;
        civic.price = 20000.45;
        civic.model = "Touring";
        civic.year = 2012;
        System.out.println("No. of seats: " + civic.seats+ " Price: " +civic.price+ " Model: " +civic.model + " Year built: " +civic.year);
        jeep.seats = 7;
        jeep.price = 28000.45;
        jeep.model = "LX";
        jeep.year = 2015;
        System.out.println("No. of seats: " + jeep.seats+ " Price: " +jeep.price+ " Model: " +jeep.model + " Year built: " +jeep.year);
    }
}

class car { //class without any method
    car() {     //constructor
        System.out.println("It is a constructor");
    }
    int seats;
    double price;
    String model;
    int year;

}